// @SOURCE:/home/neelkanth/fileUpload/conf/routes
// @HASH:d6b24a96de2fd120e4b20caeb2bae1aa08181114
// @DATE:Tue Jan 22 11:53:11 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def uploadFile() = {
   Call("POST", "/upload")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def uploadFile = JavascriptReverseRoute(
   "controllers.Application.uploadFile",
   """
      function() {
      return _wA({method:"POST", url:"/upload"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def uploadFile() = new play.api.mvc.HandlerRef(
   controllers.Application.uploadFile(), HandlerDef(this, "controllers.Application", "uploadFile", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                