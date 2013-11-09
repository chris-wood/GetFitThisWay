// @SOURCE:/Users/caw/Projects/GetFitThisWay/src/web/gfwm/conf/routes
// @HASH:f239286db8d9e1fb2ee0d7d9871d67cea8c87bc3
// @DATE:Sat Nov 09 13:57:43 PST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def gotoPlanRun(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "plan/run")
}
                                                

// @LINE:9
// @LINE:6
def gotoIndex(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:9
case () if true => Call("GET", _prefix + { _defaultPrefix } + "plan")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def gotoPlanRun : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gotoPlanRun",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plan/run"})
      }
   """
)
                        

// @LINE:9
// @LINE:6
def gotoIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gotoIndex",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plan"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def gotoPlanRun(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gotoPlanRun(), HandlerDef(this, "controllers.Application", "gotoPlanRun", Seq(), "GET", """""", _prefix + """plan/run""")
)
                      

// @LINE:6
def gotoIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gotoIndex(), HandlerDef(this, "controllers.Application", "gotoIndex", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    