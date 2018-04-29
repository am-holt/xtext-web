package org.eclipse.xtext.peweb.servlet;


import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.eclipse.xtext.peweb.OpenResources;
import org.eclipse.xtext.peweb.customview.ViewRetriever;
import org.eclipse.xtext.peweb.services.*;
import org.eclipse.xtext.util.DisposableRegistry;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.IUnwrappableServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.InvalidRequestException.InvalidDocumentStateException;
import org.eclipse.xtext.web.server.InvalidRequestException.PermissionDeniedException;
import org.eclipse.xtext.web.server.InvalidRequestException.ResourceNotFoundException;
import org.eclipse.xtext.web.servlet.*;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.inject.Injector;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An HTTP servlet for publishing the Xtext pe services. Include this into your web server by creating
 * a subclass that executes the standalone setups of your languages in its {@link #init()} method:
 * 
 * <pre>
 * &#64;WebServlet(name = "PEServices", urlPatterns = "/pe-service/*")
 * class MyXtextPeServlet extends PeServlet {
 *     override init() {
 *         super.init();
 *         MyDslPeWebSetup.doSetup();
 *     }
 * }
 * </pre>
 * 
 * Use the {@code WebServlet} annotation to register your servlet. The default URL pattern for
 * Xtext pe services is {@code "/pe-service/*"}.
 * 
 * 
 */
public abstract class PeServlet extends HttpServlet {
	
	DisposableRegistry disposableRegistry;
	Logger LOG = Logger.getLogger(this.getClass());
	private Gson gson = getGson();	private OpenResources openResources = new OpenResources();
	
	public abstract Injector getInjector(); 
	
	public abstract ViewRetriever getViewRetriever();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		try {
			super.service(req, resp);
		} catch (ResourceNotFoundException exception) {
			LOG.trace("Invalid request (" + req.getRequestURI() + "): " + exception.getMessage());
			resp.sendError(HttpServletResponse.SC_NOT_FOUND, exception.getMessage());
		} catch (InvalidDocumentStateException exception) {
			LOG.trace("Invalid request (" + req.getRequestURI() + "): " + exception.getMessage());
			resp.sendError(HttpServletResponse.SC_CONFLICT, exception.getMessage());
		} catch (PermissionDeniedException exception) {
			LOG.trace("Invalid request (" + req.getRequestURI() + "): " + exception.getMessage());
			resp.sendError(HttpServletResponse.SC_FORBIDDEN, exception.getMessage());
		} catch (InvalidRequestException exception) {
			LOG.trace("Invalid request (" + req.getRequestURI() + "): " + exception.getMessage());
			resp.sendError(HttpServletResponse.SC_BAD_REQUEST, exception.getMessage());
		}
	}
	
	public void doGet(HttpServletRequest request,  HttpServletResponse response)
	  throws ServletException, IOException {
		HttpServiceContext context = new HttpServiceContext(request);
		String serviceType = context.getParameter(IServiceContext.SERVICE_TYPE);
		PEService service = getService(serviceType);
		doService(service,context, response);
 	}
	
	public void doPut(HttpServletRequest request,  HttpServletResponse response)
			  throws ServletException, IOException {
				HttpServiceContext context = new HttpServiceContext(request);
				String serviceType = context.getParameter(IServiceContext.SERVICE_TYPE);
				PEService service = getService(serviceType);
				doService(service,context, response);
	}
	
	public void doPost(HttpServletRequest request,  HttpServletResponse response)
			  throws ServletException, IOException {
				HttpServiceContext context = new HttpServiceContext(request);
				String serviceType = context.getParameter(IServiceContext.SERVICE_TYPE);
				PEService service = getService(serviceType);
				doService(service,context, response);
	}
	
	private void doService(PEService service, HttpServiceContext context, HttpServletResponse response) throws IOException {
		IServiceResult result = service.service(context);
		response.setStatus( HttpServletResponse.SC_OK);
		response.setCharacterEncoding ("UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		if (result instanceof IUnwrappableServiceResult && ((IUnwrappableServiceResult)result).getContent() != null) {
			IUnwrappableServiceResult unwrapResult = (IUnwrappableServiceResult)result;
			response.setContentType(unwrapResult.getContentType() == null ? "text/plain" : unwrapResult.getContentType());
			response.getWriter().write(unwrapResult.getContent());
		} else {
			response.setContentType("text/x-json");
			gson.toJson(result, response.getWriter());
		}
	}

	private PEService getService(String serviceType) {
		if(serviceType == null){
			throw new InvalidRequestException("All requests need a service-type parameter!");
		}
		
		switch(serviceType){
			case "ls-languages":
				return getInjector().getInstance(GetAvailableLanguagesService.class);
			case "ls-projects":
				return new ListProjectsService();
			case "add-project":
				return new CreateProjectService();
			case "get-project":
				return new GetProjectService();
			case "add-file":
				return getInjector().getInstance(CreateFileService.class);
			case "get-file":
				return new GetFileService(this.openResources);
			case "get-node":
				return new GetNodeService(this.openResources, this.getViewRetriever());
			case "update-attribute":
				return new UpdateNodeService(this.openResources);
			case "validate-node":
				return new ValidateNodeService(this.openResources);
			case "save-file":
				return new SaveFileService(this.openResources);
			case "add-reference":
				return new AddNodeReferenceService(this.openResources);
			case "remove-reference":
				return new RemoveNodeReferenceService(this.openResources);
			default:
				throw new InvalidRequestException("No service of type " + serviceType + " found!");
		}
	}
	
	//Returns new Gson instance which will exclude fields with @exclude tag
	private Gson getGson(){
		return new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy(){
            @Override
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                final Expose expose = fieldAttributes.getAnnotation(Expose.class);
                return expose != null && !expose.serialize();
            }

            @Override
            public boolean shouldSkipClass(Class<?> aClass) {
                return false;
            }
        })
        .addDeserializationExclusionStrategy(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                final Expose expose = fieldAttributes.getAnnotation(Expose.class);
                return expose != null && !expose.deserialize();
            }

            @Override
            public boolean shouldSkipClass(Class<?> aClass) {
                return false;
            }
        }).create();

	}

}
