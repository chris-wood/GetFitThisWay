// @SOURCE:/Users/caw/Projects/GetFitThisWay/src/web/gfwm/conf/routes
// @HASH:f239286db8d9e1fb2ee0d7d9871d67cea8c87bc3
// @DATE:Sat Nov 09 13:57:43 PST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_gotoIndex0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_gotoIndex1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("plan"))))
        

// @LINE:10
private[this] lazy val controllers_Application_gotoPlanRun2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("plan/run"))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.gotoIndex"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """plan""","""controllers.Application.gotoIndex"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """plan/run""","""controllers.Application.gotoPlanRun"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_gotoIndex0(params) => {
   call { 
        invokeHandler(controllers.Application.gotoIndex, HandlerDef(this, "controllers.Application", "gotoIndex", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_gotoIndex1(params) => {
   call { 
        invokeHandler(controllers.Application.gotoIndex, HandlerDef(this, "controllers.Application", "gotoIndex", Nil,"GET", """ Planning pages""", Routes.prefix + """plan"""))
   }
}
        

// @LINE:10
case controllers_Application_gotoPlanRun2(params) => {
   call { 
        invokeHandler(controllers.Application.gotoPlanRun, HandlerDef(this, "controllers.Application", "gotoPlanRun", Nil,"GET", """""", Routes.prefix + """plan/run"""))
   }
}
        

// @LINE:13
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     