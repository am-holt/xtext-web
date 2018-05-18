package org.eclipse.xtext.peweb.customview;

import org.eclipse.xtext.peweb.OpenFileState;
import org.eclipse.xtext.peweb.ResourceAbstractSyntaxTree;
import org.eclipse.xtext.peweb.TypeHelper;

public interface IViewRetriever {

	public ProjectionDescription getView(TypeHelper typeHelper, OpenFileState ofs, ResourceAbstractSyntaxTree node); 
}
