// @SOURCE:/home/neelkanth/fileUpload/conf/routes
// @HASH:d6b24a96de2fd120e4b20caeb2bae1aa08181114
// @DATE:Tue Jan 22 11:53:11 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_uploadFile1 = Route("POST", PathPattern(List(StaticPart("/upload"))))
                    

// @LINE:11
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""POST""","""/upload""","""controllers.Application.uploadFile"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_uploadFile1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.uploadFile, HandlerDef(this, "controllers.Application", "uploadFile", Nil))
   }
}
                    

// @LINE:11
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                