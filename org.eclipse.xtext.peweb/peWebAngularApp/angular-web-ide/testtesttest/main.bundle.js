webpackJsonp(["main"],{

/***/ "../../../../../src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "../../../../../src/app/abstract-syntax-tree.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AbstractSyntaxTree; });
var AbstractSyntaxTree = (function () {
    //Used so the automatic deserialisation can be given methods
    function AbstractSyntaxTree(ast) {
        //Used to display as part of tree-view component
        this.expanded = false;
        this.name = ast.name;
        this.nodeId = ast.nodeId;
        this.children = [];
        for (var _i = 0, _a = ast.children; _i < _a.length; _i++) {
            var c = _a[_i];
            this.children.push(new AbstractSyntaxTree(c));
        }
    }
    AbstractSyntaxTree.prototype.toggle = function () {
        this.expanded = !this.expanded;
    };
    AbstractSyntaxTree.prototype.getToggleIcon = function () {
        if (this.children == null || this.children.length == 0) {
            return ' ';
        }
        else if (this.expanded) {
            return '-';
        }
        else {
            return '+';
        }
    };
    AbstractSyntaxTree.prototype.addChild = function (child) {
        this.children.push(child);
    };
    AbstractSyntaxTree.prototype.removeChild = function (removeId) {
        for (var i = this.children.length; i >= 0; i--) {
            if (this.children[i].nodeId === removeId) {
                this.children.splice(i, 1);
            }
        }
    };
    return AbstractSyntaxTree;
}());



/***/ }),

/***/ "../../../../../src/app/app-routing.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__startup_startup_component__ = __webpack_require__("../../../../../src/app/startup/startup.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__editor_editor_component__ = __webpack_require__("../../../../../src/app/editor/editor.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




var routes = [
    { path: 'startup', component: __WEBPACK_IMPORTED_MODULE_2__startup_startup_component__["a" /* StartupComponent */] },
    { path: 'edit/:id', component: __WEBPACK_IMPORTED_MODULE_3__editor_editor_component__["a" /* EditorComponent */] },
    { path: '', redirectTo: '/startup', pathMatch: 'full' }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["I" /* NgModule */])({
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */].forRoot(routes)
            ],
            exports: [__WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".title {\n\ttext-align: center;\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<router-outlet></router-outlet>\n"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.title = 'Editor';
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("../../../forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__startup_startup_component__ = __webpack_require__("../../../../../src/app/startup/startup.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__app_routing_module__ = __webpack_require__("../../../../../src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__mockServices_message_service__ = __webpack_require__("../../../../../src/app/mockServices/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__mockServices_available_language_service__ = __webpack_require__("../../../../../src/app/mockServices/available-language.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__editor_editor_component__ = __webpack_require__("../../../../../src/app/editor/editor.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__services_projects_service__ = __webpack_require__("../../../../../src/app/services/projects.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__treeView_tree_view_component__ = __webpack_require__("../../../../../src/app/treeView/tree-view.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__default_node_editor_default_node_editor_component__ = __webpack_require__("../../../../../src/app/default-node-editor/default-node-editor.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__default_node_editor_default_einput_default_einput_component__ = __webpack_require__("../../../../../src/app/default-node-editor/default-einput/default-einput.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__services_edit_service__ = __webpack_require__("../../../../../src/app/services/edit.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__services_available_languages_service__ = __webpack_require__("../../../../../src/app/services/available-languages.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__services_language_service__ = __webpack_require__("../../../../../src/app/services/language.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

















var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_5__startup_startup_component__["a" /* StartupComponent */],
                __WEBPACK_IMPORTED_MODULE_9__editor_editor_component__["a" /* EditorComponent */],
                __WEBPACK_IMPORTED_MODULE_11__treeView_tree_view_component__["a" /* TreeViewComponent */],
                __WEBPACK_IMPORTED_MODULE_12__default_node_editor_default_node_editor_component__["a" /* DefaultNodeEditorComponent */],
                __WEBPACK_IMPORTED_MODULE_13__default_node_editor_default_einput_default_einput_component__["a" /* DefaultEinputComponent */],
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_common_http__["b" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_6__app_routing_module__["a" /* AppRoutingModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */]
            ],
            providers: [
                __WEBPACK_IMPORTED_MODULE_7__mockServices_message_service__["a" /* MessageService */],
                __WEBPACK_IMPORTED_MODULE_10__services_projects_service__["a" /* ProjectsService */],
                __WEBPACK_IMPORTED_MODULE_8__mockServices_available_language_service__["a" /* MockAvailableLanguageService */],
                __WEBPACK_IMPORTED_MODULE_14__services_edit_service__["a" /* EditService */],
                __WEBPACK_IMPORTED_MODULE_15__services_available_languages_service__["a" /* AvailableLanguagesService */],
                __WEBPACK_IMPORTED_MODULE_16__services_language_service__["a" /* LanguageService */]
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-einput/default-einput.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "input\n{\tcolor: black;\n}\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-einput/default-einput.component.html":
/***/ (function(module, exports) {

module.exports = "<div [ngSwitch]=\"type\">\n\t<input *ngSwitchCase=\"'EString'\" [type]=\"text\" [ngModel]=\"val\" (ngModelChange)=\"test($event)\">\n  <input *ngSwitchCase=\"'EInt'\" [type]=\"number\" [ngModel]=\"val\" (ngModelChange)=\"test($event)\" >\n</div> \n"

/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-einput/default-einput.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DefaultEinputComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var DefaultEinputComponent = (function () {
    function DefaultEinputComponent() {
        this.value = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["v" /* EventEmitter */]();
    }
    DefaultEinputComponent.prototype.ngOnInit = function () {
        this.val = this.initialValue;
    };
    DefaultEinputComponent.prototype.test = function (val) {
        console.log(this.value);
        //TODO change this so only emits after a period of nothing
        this.value.emit(val);
        console.log("yay!");
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", String)
    ], DefaultEinputComponent.prototype, "type", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", Object)
    ], DefaultEinputComponent.prototype, "initialValue", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["P" /* Output */])(),
        __metadata("design:type", Object)
    ], DefaultEinputComponent.prototype, "value", void 0);
    DefaultEinputComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'default-einput',
            template: __webpack_require__("../../../../../src/app/default-node-editor/default-einput/default-einput.component.html"),
            styles: [__webpack_require__("../../../../../src/app/default-node-editor/default-einput/default-einput.component.css")],
            encapsulation: __WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* ViewEncapsulation */].None
        }),
        __metadata("design:paramtypes", [])
    ], DefaultEinputComponent);
    return DefaultEinputComponent;
}());



/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-node-editor.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".default-node-editor{\n\tcursor: pointer;\n\tpadding-left: 10px;\n}\n\nul li{\n\tmargin: 0 0 3px 0;\n}\n\n\nul li ul li{\n\tmargin: 0.2em 0 0.2em 0;\n\tlist-style-type: none;\n}\n\n.textbtn{\n  cursor: pointer;\n  background: #1d1f2b;\n  border-radius: 3px;\n  padding-left:  1em;\n  padding-right: 1em;\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-node-editor.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"default-node-editor\" *ngIf=\"nodeDetails;else noDetails\">\n\t<div class =\"Attributes\" *ngIf=\"nodeDetails.attributes.length !=0\">\n\t\t<h4> Attributes: </h4>\n\t\t<ul>\n\t\t\t<li *ngFor=\"let att of nodeDetails.attributes\">\n\t\t\t\t{{att.name}} ({{att.type}}) : <default-einput [type]=\"att.type\" [initialValue]=\"att.value\" (value)=\"AttributeChange(att,$event)\" > </default-einput>\n\t\t\t</li>\n\t\t</ul>\n\t</div>\n\n\t<div class=\"References\" *ngIf=\"nodeDetails.references.length !=0\">\n\t\t<h4> References: </h4>\n\t\t<ul>\n\t\t\t<li *ngFor=\"let ref of nodeDetails.references\">\n\t\t\t\t{{ref.name}}\n\t\t\t\t<ul>\n\t\t\t\t\t<li *ngFor=\"let refNode of ref.nodes\">\n\t\t\t\t\t\t<span class=\"textbtn\" (click)=\"RemoveReferenceClick(refNode.nodeId,ref)\">X</span> {{refNode.name}}  : ({{refNode.nodeId}})\n\t\t\t\t\t</li>\n\t\t\t\t</ul>\n\t\t\t\t<span class=\"textbtn\" (click)=\"AddReferenceClick(ref)\">Add {{ref.name}}</span>\n\t\t\t</li>\n\t\t</ul>\t\t\n\t</div>\n</div>\n\n<ng-template #noDetails>\n\tNo nodeDetails\n</ng-template>\n"

/***/ }),

/***/ "../../../../../src/app/default-node-editor/default-node-editor.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DefaultNodeEditorComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__node_details__ = __webpack_require__("../../../../../src/app/node-details.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_edit_service__ = __webpack_require__("../../../../../src/app/services/edit.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__file_details__ = __webpack_require__("../../../../../src/app/file-details.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var DefaultNodeEditorComponent = (function () {
    function DefaultNodeEditorComponent(editService) {
        this.editService = editService;
    }
    DefaultNodeEditorComponent.prototype.ngOnInit = function () {
    };
    DefaultNodeEditorComponent.prototype.test = function (o) {
        console.log("edit" + o);
    };
    DefaultNodeEditorComponent.prototype.AttributeChange = function (att, value) {
        console.log(this.fileDetails);
        //What to do here? save?
        //Locally Validate
        this.editService.validateAttribute(this.projId, this.fileDetails, this.nodeDetails.nodeId, att.name, value).subscribe(function (a) { return null; });
        this.editService.updateAttribute(this.projId, this.fileDetails, this.nodeDetails.nodeId, att.name, value).subscribe(function (a) { return null; });
    };
    DefaultNodeEditorComponent.prototype.AddReferenceClick = function (ref) {
        var _this = this;
        console.log("Add " + ref.name);
        this.editService.addReference(this.projId, this.fileDetails, this.nodeDetails.nodeId, ref.name).subscribe(function (a) { return _this.nodeDetails.ast.addChild(a); });
    };
    DefaultNodeEditorComponent.prototype.RemoveReferenceClick = function (nodeId, ref) {
        var _this = this;
        console.log("Remove " + nodeId);
        this.editService.removeReference(this.projId, this.fileDetails, this.nodeDetails.nodeId, nodeId, ref.name)
            .subscribe(function (a) { if (a) {
            _this.nodeDetails.ast.removeChild(nodeId);
        }
        else {
            console.error("Error removing reference");
        } });
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", String)
    ], DefaultNodeEditorComponent.prototype, "projId", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_3__file_details__["a" /* FileDetails */])
    ], DefaultNodeEditorComponent.prototype, "fileDetails", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__node_details__["a" /* NodeDetails */])
    ], DefaultNodeEditorComponent.prototype, "nodeDetails", void 0);
    DefaultNodeEditorComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'default-node-editor',
            template: __webpack_require__("../../../../../src/app/default-node-editor/default-node-editor.component.html"),
            styles: [__webpack_require__("../../../../../src/app/default-node-editor/default-node-editor.component.css")],
            encapsulation: __WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* ViewEncapsulation */].None
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__services_edit_service__["a" /* EditService */]])
    ], DefaultNodeEditorComponent);
    return DefaultNodeEditorComponent;
}());



/***/ }),

/***/ "../../../../../src/app/editor/editor.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "\n.hidden { \n  visibility: hidden;\n }\n\n.container {\n  width: 100%;\n  height: 100%;\n  overflow: hidden;\n}\n\n.title{\n    width: 100%;\n    text-align: center;\n}\n\n\n.middlepane .savefilebtn{\n  cursor:pointer;\n  background-color: #eee;\n  color: black;\n  border-radius: 3px;\n  padding-left:  1em;\n  padding-right: 1em;\n}\n\n.leftpane .newfilebtn{\n  cursor:pointer;\n  background-color: #eee;\n  color: black;\n  border-radius: 3px;\n  padding-left:  1em;\n  padding-right: 1em;\n}\n\n.leftpane ul li{\n  list-style-type: none;\n  margin-top: 0.2em;\n}\n\n\n.leftpane ul li .textbtn{\n  cursor: pointer;\n  color: white;\n  background: #1d1f2b;\n  border-radius: 3px;\n  padding-left:  1em;\n  padding-right: 1em;\n}\n\n.middlepane >tree-view {\n  background-color: grey;\n}\n\n.leftpane {\n  width: 14%;\n  height: 100%;\n  float: left;\n}\n\n.middlepane {\n  width: 24%;\n  height: 100%;\n  float: left;\n}\n\n.rightpane {\n  width: 60%;\n  height: 100%;\n  position: relative;\n  float: right;\n}\n\n.rightpane p{\n  padding-left:15px; \n}\n\n.leftpane,.middlepane,.rightpane{\n  border-radius: 4px;\n  background-color: grey;\n  margin: .3em;\n  height: 75vh;\n}\n\n.leftpane h3, .middlepane h3, .rightpane h3{\n  padding-top: 0.2em;\n  margin-top: 0.2em ;\n  text-align: center;\n}\n\n.leftpane *, .middlepane *, .rightpane *{\n    background-color: grey;\n}\n\n\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/editor/editor.component.html":
/***/ (function(module, exports) {

module.exports = "<div *ngIf=\"project;else notFound\"> \n\t<h1 class=\"title\"> Editor : {{project.details.name}} </h1>\n\t<div class=\"container\">\n\t  <div class=\"leftpane\">\n\t  \t<h3>Files</h3>\n\t    <ul>\n\t      <li *ngFor=\"let file of project.files\">\n\t     \t\t<span class=\"textbtn\" (click)=\"loadFile(file)\">{{file.name}}</span>\n\t      </li>\n\t    </ul>\n\t    <a class=\"newfilebtn\" (click)=\"newFileClick()\"> New File </a>\n\t  </div>\n\n\t  <div class=\"middlepane\">\n\t  \t<h3>Tree</h3>\n\t  \t<div *ngIf=\"openFile\">\n\t\t   <tree-view [treeRoot]=\"openFile.treeRoot\" (clickedNode)=\"getNodeEditor($event)\"></tree-view>\n\t\t   <a class=\"savefilebtn\" [ngClass]=\"{hidden: !valid}\" (click)=\"saveFileClick()\"> Save File </a>\n\t\t  </div>\n\t\t</div>\n\n\t  <div class=\"rightpane\">\n\t    <h3>Edit</h3>\n\t    <div *ngIf=\"nodeDetails\">\n\t\t   <default-node-editor [nodeDetails]=\"nodeDetails\" [fileDetails]=\"openFile.details\" [projId]=\"project.details.id\"></default-node-editor>\n\t\t  </div>\n\t  </div>\n\t</div>\n</div>\n\n<ng-template #notFound>\n\t<h1> Invalid Project ID </h1>\n</ng-template>"

/***/ }),

/***/ "../../../../../src/app/editor/editor.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EditorComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_language_service__ = __webpack_require__("../../../../../src/app/services/language.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_projects_service__ = __webpack_require__("../../../../../src/app/services/projects.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


//import { MockAvailableLanguageService } from '../mockServices/available-language.service';


var EditorComponent = (function () {
    function EditorComponent(route, availableLangService, projectService) {
        this.route = route;
        this.availableLangService = availableLangService;
        this.projectService = projectService;
    }
    EditorComponent.prototype.ngOnInit = function () {
        var _this = this;
        var id = this.route.snapshot.paramMap.get('id');
        console.log(id);
        this.projectService.getProject(id).subscribe(function (prj) { return _this.project = prj; });
        this.valid = true;
    };
    EditorComponent.prototype.loadFile = function (file) {
        var _this = this;
        //this.openFile = file;
        console.log("Opened " + file.name);
        this.projectService.getFile(this.project.details.id, file).subscribe(function (a) { return _this.openFile = a; });
    };
    EditorComponent.prototype.newFileClick = function () {
        var _this = this;
        var name = "";
        console.log("test");
        while (name == "") {
            var name = prompt("Please enter file name:");
            if (name == null) {
                return; //user cancelled the request
            }
            else if (this.project.files.find(function (file) { return file.getNameWithoutExtension() == name; }) != null) {
                alert("File name already exists");
                name = "";
            }
        }
        this.projectService.addFileToProject(this.project.details.id, name).subscribe(function (fileDetail) { return _this.project.files.push(fileDetail); });
    };
    EditorComponent.prototype.getNodeEditor = function (node) {
        var _this = this;
        this.projectService.getNode(this.project.details.id, this.openFile.details, node).subscribe(function (a) { return _this.nodeDetails = a; });
    };
    EditorComponent.prototype.saveFileClick = function () {
        this.projectService.saveFile(this.project.details.id, this.openFile.details).subscribe(function (a) { return null; });
    };
    EditorComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-editor',
            template: __webpack_require__("../../../../../src/app/editor/editor.component.html"),
            styles: [__webpack_require__("../../../../../src/app/editor/editor.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */],
            __WEBPACK_IMPORTED_MODULE_2__services_language_service__["a" /* LanguageService */],
            __WEBPACK_IMPORTED_MODULE_3__services_projects_service__["a" /* ProjectsService */]])
    ], EditorComponent);
    return EditorComponent;
}());



/***/ }),

/***/ "../../../../../src/app/file-details.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FileDetails; });
var FileDetails = (function () {
    function FileDetails(name) {
        this.name = name;
    }
    FileDetails.prototype.getExtension = function () {
        return this.name.substring(this.name.lastIndexOf('.'));
    };
    FileDetails.prototype.getNameWithoutExtension = function () {
        return this.name.substring(0, this.name.lastIndexOf('.'));
    };
    return FileDetails;
}());



/***/ }),

/***/ "../../../../../src/app/file.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return File; });
var File = (function () {
    function File(treeRoot, details) {
        this.treeRoot = treeRoot;
        this.details = details;
    }
    return File;
}());



/***/ }),

/***/ "../../../../../src/app/language-spec.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LanguageSpec; });
var LanguageSpec = (function () {
    function LanguageSpec(name, ext) {
        this.name = name;
        this.fileExtension = ext;
    }
    return LanguageSpec;
}());



/***/ }),

/***/ "../../../../../src/app/mockServices/available-language.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MockAvailableLanguageService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_observable_of__ = __webpack_require__("../../../../rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_service__ = __webpack_require__("../../../../../src/app/mockServices/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__mock_languages__ = __webpack_require__("../../../../../src/app/mockServices/mock-languages.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var MockAvailableLanguageService = (function () {
    //sa
    function MockAvailableLanguageService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
    }
    ;
    MockAvailableLanguageService.prototype.getLanguages = function () {
        this.messageService.addMessage("Available Language Service: Getting available languages");
        return Object(__WEBPACK_IMPORTED_MODULE_1_rxjs_observable_of__["a" /* of */])(__WEBPACK_IMPORTED_MODULE_4__mock_languages__["a" /* LANGUAGESPEC */]);
    };
    MockAvailableLanguageService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__message_service__["a" /* MessageService */],
            __WEBPACK_IMPORTED_MODULE_2__angular_common_http__["a" /* HttpClient */]])
    ], MockAvailableLanguageService);
    return MockAvailableLanguageService;
}());



/***/ }),

/***/ "../../../../../src/app/mockServices/message.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MessageService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var MessageService = (function () {
    function MessageService() {
        this.messages = [];
    }
    MessageService.prototype.addMessage = function (msg) {
        this.messages.push(msg);
    };
    MessageService.prototype.clearMessages = function () {
        this.messages = [];
    };
    MessageService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])()
    ], MessageService);
    return MessageService;
}());



/***/ }),

/***/ "../../../../../src/app/mockServices/mock-languages.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LANGUAGESPEC; });
var LANGUAGESPEC = { name: "mydsl", fileExtension: ".mydsl" };


/***/ }),

/***/ "../../../../../src/app/node-details.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export Attribute */
/* unused harmony export Reference */
/* unused harmony export NodeReference */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NodeDetails; });
var Attribute = (function () {
    function Attribute() {
    }
    return Attribute;
}());

var Reference = (function () {
    function Reference() {
    }
    return Reference;
}());

var NodeReference = (function () {
    function NodeReference() {
    }
    return NodeReference;
}());

var NodeDetails = (function () {
    function NodeDetails(atts, refs, id, ast) {
        this.attributes = atts;
        this.references = refs;
        this.nodeId = id;
        this.ast = ast;
    }
    return NodeDetails;
}());



/***/ }),

/***/ "../../../../../src/app/services/available-languages.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AvailableLanguagesService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_observable_of__ = __webpack_require__("../../../../rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__message_service__ = __webpack_require__("../../../../../src/app/services/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__mockServices_mock_languages__ = __webpack_require__("../../../../../src/app/mockServices/mock-languages.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var AvailableLanguagesService = (function () {
    function AvailableLanguagesService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
    }
    ;
    AvailableLanguagesService.prototype.getLanguages = function () {
        this.messageService.addMessage("Available Language Service: Getting available languages");
        return Object(__WEBPACK_IMPORTED_MODULE_1_rxjs_observable_of__["a" /* of */])(__WEBPACK_IMPORTED_MODULE_4__mockServices_mock_languages__["a" /* LANGUAGESPEC */]);
    };
    AvailableLanguagesService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__message_service__["a" /* MessageService */],
            __WEBPACK_IMPORTED_MODULE_2__angular_common_http__["a" /* HttpClient */]])
    ], AvailableLanguagesService);
    return AvailableLanguagesService;
}());



/***/ }),

/***/ "../../../../../src/app/services/edit.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return EditService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__mockServices_message_service__ = __webpack_require__("../../../../../src/app/mockServices/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__file__ = __webpack_require__("../../../../../src/app/file.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__abstract_syntax_tree__ = __webpack_require__("../../../../../src/app/abstract-syntax-tree.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__responses_valid_node_response__ = __webpack_require__("../../../../../src/app/services/responses/valid-node-response.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__responses_update_node_response__ = __webpack_require__("../../../../../src/app/services/responses/update-node-response.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__responses_add_reference_response__ = __webpack_require__("../../../../../src/app/services/responses/add-reference-response.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__responses_remove_reference_response__ = __webpack_require__("../../../../../src/app/services/responses/remove-reference-response.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var EditService = (function () {
    function EditService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
        this.serviceUrl = "/pe-service";
    }
    EditService.prototype.getFile = function (projId, fileDetails) {
        var a = this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'get-file').append('file-name', fileDetails.name).append('project-name', projId) })
            .map(function (a) { return new __WEBPACK_IMPORTED_MODULE_4__file__["a" /* File */](new __WEBPACK_IMPORTED_MODULE_5__abstract_syntax_tree__["a" /* AbstractSyntaxTree */](a["ast"]), fileDetails); });
        return a;
    };
    EditService.prototype.validateAttribute = function (projId, fileDetails, nodeId, attributeName, newValue) {
        return this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]()
                .append('serviceType', 'validate-node')
                .append('file-name', fileDetails.name)
                .append('project-name', projId)
                .append('node-id', nodeId)
                .append('attribute-name', attributeName)
                .append('value', newValue)
        }).map(function (a) { return new __WEBPACK_IMPORTED_MODULE_6__responses_valid_node_response__["a" /* ValidNodeResponse */](a); });
    };
    EditService.prototype.updateAttribute = function (projId, fileDetails, nodeId, attributeName, newValue) {
        //TODO change to post
        return this.http.get(this.serviceUrl, {
            params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]()
                .append('serviceType', 'update-node')
                .append('file-name', fileDetails.name)
                .append('project-name', projId)
                .append('node-id', nodeId)
                .append('attribute-name', attributeName)
                .append('value', newValue)
        }).map(function (a) { return new __WEBPACK_IMPORTED_MODULE_7__responses_update_node_response__["a" /* UpdateNodeResponse */](a); });
    };
    EditService.prototype.addReference = function (projId, fileDetails, nodeId, referenceName) {
        return this.http.get(this.serviceUrl, {
            params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]()
                .append('serviceType', 'add-reference')
                .append('file-name', fileDetails.name)
                .append('project-name', projId)
                .append('node-id', nodeId)
                .append('reference-name', referenceName)
        }).map(function (a) { return new __WEBPACK_IMPORTED_MODULE_8__responses_add_reference_response__["a" /* AddReferenceResponse */](a).getAst(); });
    };
    EditService.prototype.removeReference = function (projId, fileDetails, nodeId, toRemoveId, referenceName) {
        return this.http.get(this.serviceUrl, {
            params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]()
                .append('serviceType', 'remove-reference')
                .append('file-name', fileDetails.name)
                .append('project-name', projId)
                .append('node-id', nodeId)
                .append('reference-id', toRemoveId)
                .append('reference-name', referenceName)
        }).map(function (a) { return new __WEBPACK_IMPORTED_MODULE_9__responses_remove_reference_response__["a" /* RemoveReferenceResponse */](a).getSuccess(); });
    };
    EditService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__mockServices_message_service__["a" /* MessageService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */]])
    ], EditService);
    return EditService;
}());



/***/ }),

/***/ "../../../../../src/app/services/language.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LanguageService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__mockServices_message_service__ = __webpack_require__("../../../../../src/app/mockServices/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__language_spec__ = __webpack_require__("../../../../../src/app/language-spec.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var LanguageService = (function () {
    function LanguageService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
        this.serviceUrl = "/pe-service";
    }
    ;
    LanguageService.prototype.getLanguages = function () {
        this.messageService.addMessage("Available Language Service: Getting available languages");
        return this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]()
                .append('serviceType', 'ls-languages')
        }).map(function (a) {
            console.log(a.languages);
            console.log(a.languages[0].Name);
            return [new __WEBPACK_IMPORTED_MODULE_3__language_spec__["a" /* LanguageSpec */](a.languages[0].Name, a.languages[0].FileExtension)];
        });
    };
    LanguageService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__mockServices_message_service__["a" /* MessageService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */]])
    ], LanguageService);
    return LanguageService;
}());



/***/ }),

/***/ "../../../../../src/app/services/message.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MessageService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var MessageService = (function () {
    function MessageService() {
        this.messages = [];
    }
    MessageService.prototype.addMessage = function (msg) {
        this.messages.push(msg);
    };
    MessageService.prototype.clearMessages = function () {
        this.messages = [];
    };
    MessageService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])()
    ], MessageService);
    return MessageService;
}());



/***/ }),

/***/ "../../../../../src/app/services/projects.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ProjectsService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("../../../common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__ = __webpack_require__("../../../../rxjs/_esm5/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__mockServices_message_service__ = __webpack_require__("../../../../../src/app/mockServices/message.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__file_details__ = __webpack_require__("../../../../../src/app/file-details.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__file__ = __webpack_require__("../../../../../src/app/file.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__abstract_syntax_tree__ = __webpack_require__("../../../../../src/app/abstract-syntax-tree.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__responses_get_node_response__ = __webpack_require__("../../../../../src/app/services/responses/get-node-response.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__responses_save_file_response__ = __webpack_require__("../../../../../src/app/services/responses/save-file-response.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var ProjectsService = (function () {
    function ProjectsService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
        this.serviceUrl = "/pe-service";
    }
    ProjectsService.prototype.getProjectDetails = function () {
        var _this = this;
        this.log("getting project details");
        return this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'ls-projects') })
            .map(function (res) { return (res["projectnames"]); }).map(function (a) { return a.map(_this.stringToProjectDetails); });
    };
    ProjectsService.prototype.stringToProjectDetails = function (s) {
        return { id: s, name: s };
    };
    ProjectsService.prototype.addNewProject = function (name) {
        var b = this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'add-project').append('name', name) }).map(function (a) { return name; });
        return b;
    };
    ProjectsService.prototype.getProject = function (id) {
        this.log("retrieving project id: " + id);
        var b = this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'get-project').append('name', id) })
            .map(function (a) { return a["Files"]; })
            .map(function (ls) { var files = ls.map(function (a) { return new __WEBPACK_IMPORTED_MODULE_5__file_details__["a" /* FileDetails */](a); }); return { details: { name: id, id: id }, files: files }; });
        return b;
    };
    ProjectsService.prototype.getFile = function (projId, fileDetails) {
        var a = this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'get-file').append('file-name', fileDetails.name).append('project-name', projId) })
            .map(function (a) { return new __WEBPACK_IMPORTED_MODULE_6__file__["a" /* File */](new __WEBPACK_IMPORTED_MODULE_7__abstract_syntax_tree__["a" /* AbstractSyntaxTree */](a["ast"]), fileDetails); });
        return a;
    };
    //TODO refactor out into separate service? 
    //TODO Modify service so it returns something other than default node response
    ProjectsService.prototype.getNode = function (projId, fileDetails, node) {
        return this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'get-node')
                .append('file-name', fileDetails.name)
                .append('project-name', projId)
                .append('node-id', node.nodeId) })
            .map(function (a) { return new __WEBPACK_IMPORTED_MODULE_8__responses_get_node_response__["a" /* GetNodeResponse */](a).getNodeDetails(node); });
    };
    ProjectsService.prototype.addFileToProject = function (projId, fileName) {
        this.log("adding file " + fileName + "to project " + projId);
        var b = this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'add-file')
                .append('name', fileName)
                .append('project-name', projId) })
            .map(function (a) { return new __WEBPACK_IMPORTED_MODULE_5__file_details__["a" /* FileDetails */](a["name"]); });
        return b;
    };
    ProjectsService.prototype.saveFile = function (projId, fileDetails) {
        this.log("saving file " + fileDetails.name + " to project " + projId);
        return this.http.get(this.serviceUrl, { params: new __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["c" /* HttpParams */]().append('serviceType', 'save-file')
                .append('file-name', fileDetails.name)
                .append('project-name', projId) })
            .map(function (a) { return new __WEBPACK_IMPORTED_MODULE_9__responses_save_file_response__["a" /* SaveFileResponse */](a); });
    };
    ProjectsService.prototype.log = function (message) {
        this.messageService.addMessage("Projects Service: " + message);
    };
    /**
     * Handle Http operation that failed.
     * Let the app continue.
     * @param operation - name of the operation that failed
     * @param result - optional value to return as the observable result
     */
    ProjectsService.prototype.handleError = function (operation, result) {
        var _this = this;
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            console.error(error);
            _this.log(operation + " failed: " + error.message);
            // Let the app keep running by returning an empty result.
            return Object(__WEBPACK_IMPORTED_MODULE_2_rxjs_observable_of__["a" /* of */])(result);
        };
    };
    ProjectsService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_4__mockServices_message_service__["a" /* MessageService */],
            __WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */]])
    ], ProjectsService);
    return ProjectsService;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/add-reference-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export AddReferenceRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AddReferenceResponse; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__abstract_syntax_tree__ = __webpack_require__("../../../../../src/app/abstract-syntax-tree.ts");

var AddReferenceRawResponse = (function () {
    function AddReferenceRawResponse() {
    }
    return AddReferenceRawResponse;
}());

var AddReferenceResponse = (function () {
    function AddReferenceResponse(rawResponse) {
        this.rawResponse = rawResponse;
        this.annotatedAst = new __WEBPACK_IMPORTED_MODULE_0__abstract_syntax_tree__["a" /* AbstractSyntaxTree */](this.rawResponse.ast);
    }
    AddReferenceResponse.prototype.getAst = function () {
        return this.annotatedAst;
    };
    return AddReferenceResponse;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/get-node-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export GetNodeRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return GetNodeResponse; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__node_details__ = __webpack_require__("../../../../../src/app/node-details.ts");

var GetNodeRawResponse = (function () {
    function GetNodeRawResponse() {
    }
    return GetNodeRawResponse;
}());

var GetNodeResponse = (function () {
    function GetNodeResponse(rawResponse) {
        this.rawResponse = rawResponse;
    }
    GetNodeResponse.prototype.getNodeDetails = function (ast) {
        return new __WEBPACK_IMPORTED_MODULE_0__node_details__["a" /* NodeDetails */](this.rawResponse.attributes, this.rawResponse.references, this.rawResponse.nodeId, ast);
    };
    return GetNodeResponse;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/remove-reference-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export RemoveReferenceRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RemoveReferenceResponse; });
var RemoveReferenceRawResponse = (function () {
    function RemoveReferenceRawResponse() {
    }
    return RemoveReferenceRawResponse;
}());

var RemoveReferenceResponse = (function () {
    function RemoveReferenceResponse(rawResponse) {
        this.rawResponse = rawResponse;
    }
    RemoveReferenceResponse.prototype.getSuccess = function () {
        return this.rawResponse.success;
    };
    return RemoveReferenceResponse;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/save-file-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export SaveFileRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SaveFileResponse; });
var SaveFileRawResponse = (function () {
    function SaveFileRawResponse() {
    }
    return SaveFileRawResponse;
}());

var SaveFileResponse = (function () {
    function SaveFileResponse(rawResponse) {
        this.rawResponse = rawResponse;
    }
    SaveFileResponse.prototype.getSuccess = function () {
        return this.rawResponse.success;
    };
    SaveFileResponse.prototype.getMessage = function () {
        return this.rawResponse.message;
    };
    return SaveFileResponse;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/update-node-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export UpdateNodeRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return UpdateNodeResponse; });
var UpdateNodeRawResponse = (function () {
    function UpdateNodeRawResponse() {
    }
    return UpdateNodeRawResponse;
}());

var UpdateNodeResponse = (function () {
    function UpdateNodeResponse(rawResponse) {
        this.rawResponse = rawResponse;
    }
    UpdateNodeResponse.prototype.getSuccess = function () {
        return this.rawResponse.success;
    };
    UpdateNodeResponse.prototype.getMessage = function () {
        return this.rawResponse.message;
    };
    return UpdateNodeResponse;
}());



/***/ }),

/***/ "../../../../../src/app/services/responses/valid-node-response.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export ValidNodeRawResponse */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ValidNodeResponse; });
var ValidNodeRawResponse = (function () {
    function ValidNodeRawResponse() {
    }
    return ValidNodeRawResponse;
}());

var ValidNodeResponse = (function () {
    function ValidNodeResponse(rawResponse) {
        this.rawResponse = rawResponse;
    }
    ValidNodeResponse.prototype.getValid = function () {
        return this.rawResponse.valid;
    };
    ValidNodeResponse.prototype.getMessage = function () {
        return this.rawResponse.message;
    };
    return ValidNodeResponse;
}());



/***/ }),

/***/ "../../../../../src/app/startup/startup.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".title {\n\ttext-align: center;\n\t\n}\n\n.startup { \n\ttext-align: center;\n\twidth: 30%;\n\tmargin: auto;\n}\n\n.startup li{\n\tcursor: pointer;\n\tborder-radius: 4px;\n\tbackground-color: #eee;\n\tmargin: .5em;\n\tpadding: 0.6em 0;\n\twidth: auto;\n\tlist-style-type: none;\n}\n\n.startup li a{\n\tcolor: black;\n\tbackground-color: #eee;\n\ttext-decoration: none;\n}\n\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/startup/startup.component.html":
/***/ (function(module, exports) {

module.exports = "<h1 class=\"title\"> Projectional Editor </h1>\n<div class=\"startup\">\n\t<h2> Create New Project </h2>\n\t<li *ngFor=\"let lang of availableLanguages\">\n\t\t<a class=\"newProjectButton\" (click)=\"newProjectClick()\">Create new {{lang.name}} Project </a>\n\t</li>\n\t<h2> Open Existing Project </h2>\n\t<li *ngFor=\"let proj of existingProjects\">\n\t\t<a class=\"existingProjectButton\" routerLink=\"/edit/{{proj.id}}\"> Open {{proj.name}}</a>\n\t</li>\n</div>"

/***/ }),

/***/ "../../../../../src/app/startup/startup.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return StartupComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_language_service__ = __webpack_require__("../../../../../src/app/services/language.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("../../../router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__services_projects_service__ = __webpack_require__("../../../../../src/app/services/projects.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

//import { MockAvailableLanguageService } from '../mockServices/available-language.service';



var StartupComponent = (function () {
    function StartupComponent(availableLangService, projectsService, router) {
        this.availableLangService = availableLangService;
        this.projectsService = projectsService;
        this.router = router;
        this.availableLanguages = [];
    }
    StartupComponent.prototype.ngOnInit = function () {
        this.getAvailableLanguages();
        this.getExistingProjects();
    };
    StartupComponent.prototype.getExistingProjects = function () {
        var _this = this;
        this.projectsService.getProjectDetails().subscribe(function (projects) { return _this.existingProjects = projects; });
        console.log("test");
    };
    StartupComponent.prototype.getAvailableLanguages = function () {
        var _this = this;
        this.availableLangService.getLanguages().subscribe(function (langs) { _this.availableLanguages = langs; });
    };
    StartupComponent.prototype.newProjectClick = function () {
        var _this = this;
        //this.projectsService.test();
        var name = "";
        while (name == "") {
            var name = prompt("Please enter your project name:");
            if (name == null) {
                return; //user cancelled the request
            }
            else if (this.existingProjects.find(function (project) { return project.name == name; }) != null) {
                alert("Name already exists");
                name = "";
            }
        }
        var id = this.projectsService.addNewProject(name);
        id.subscribe(function (id) { return _this.router.navigate(['edit/' + id]); });
    };
    StartupComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-startup',
            template: __webpack_require__("../../../../../src/app/startup/startup.component.html"),
            styles: [__webpack_require__("../../../../../src/app/startup/startup.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_language_service__["a" /* LanguageService */],
            __WEBPACK_IMPORTED_MODULE_3__services_projects_service__["a" /* ProjectsService */],
            __WEBPACK_IMPORTED_MODULE_2__angular_router__["b" /* Router */]])
    ], StartupComponent);
    return StartupComponent;
}());



/***/ }),

/***/ "../../../../../src/app/treeView/tree-view.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, ".treeView ul li{\n\tlist-style-type: none;\n\tmargin-top:0;\n\tcursor: pointer;\n}\n.treeView ul{\n\tmargin-top:0;\n\tpadding-left: 10px;\n}\n\n.treeView{\n\tcursor: pointer;\n\tpadding-left: 10px;\n}\n\n.toggleIcon{\n\tcursor: pointer;\n}", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/treeView/tree-view.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"treeView\" *ngIf=\"treeRoot;else notFound\">\n\t<span class=\"toggleIcon\" (click)=\"treeRoot.toggle()\">{{treeRoot.getToggleIcon()}}</span>\n\t<span class=\"data\" (click)=\"onClick()\">{{treeRoot.name}}</span>\n\t    <ul *ngIf=\"treeRoot.expanded\">\n\t      <li *ngFor=\"let child of treeRoot.children\">\n\t        <tree-view [treeRoot]=\"child\" (clickedNode)=\"passUpClickedNode($event)\"></tree-view>\n\t      </li>\n\t    </ul>\n</div>\n\n<ng-template #notFound>\n\tNo nodes yet!\n</ng-template>\n"

/***/ }),

/***/ "../../../../../src/app/treeView/tree-view.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TreeViewComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__abstract_syntax_tree__ = __webpack_require__("../../../../../src/app/abstract-syntax-tree.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var TreeViewComponent = (function () {
    function TreeViewComponent() {
        this.clickedNode = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["v" /* EventEmitter */]();
    }
    TreeViewComponent.prototype.ngOnInit = function () {
    };
    TreeViewComponent.prototype.onClick = function () {
        this.clickedNode.emit(this.treeRoot);
    };
    //if a child is clicked we need to pass up it's clickedNode output as editor is only subscribed to root
    TreeViewComponent.prototype.passUpClickedNode = function (ast) {
        this.clickedNode.emit(ast);
    };
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["P" /* Output */])(),
        __metadata("design:type", Object)
    ], TreeViewComponent.prototype, "clickedNode", void 0);
    __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["D" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__abstract_syntax_tree__["a" /* AbstractSyntaxTree */])
    ], TreeViewComponent.prototype, "treeRoot", void 0);
    TreeViewComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'tree-view',
            template: __webpack_require__("../../../../../src/app/treeView/tree-view.component.html"),
            styles: [__webpack_require__("../../../../../src/app/treeView/tree-view.component.css")],
            encapsulation: __WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* ViewEncapsulation */].None
        }),
        __metadata("design:paramtypes", [])
    ], TreeViewComponent);
    return TreeViewComponent;
}());



/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map