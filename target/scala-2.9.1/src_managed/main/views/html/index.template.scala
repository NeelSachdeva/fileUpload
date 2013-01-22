
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.19*/(""" 
"""),_display_(Seq(/*2.2*/main("File Upload  in Play")/*2.30*/ {_display_(Seq(format.raw/*2.32*/("""

<h1>File Upload In Play</h1>
"""),_display_(Seq(/*5.2*/helper/*5.8*/.form(action = routes.Application.uploadFile, 'enctype -> "multipart/form-data")/*5.88*/ {_display_(Seq(format.raw/*5.90*/("""
    
    <input type="file" name="fileUpload">
    
    <p>
        <input type="submit" value="Upload">
    </p>
    
""")))})),format.raw/*13.2*/("""


""")))})),format.raw/*16.2*/("""
"""))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 22 11:57:05 IST 2013
                    SOURCE: /home/neelkanth/fileUpload/app/views/index.scala.html
                    HASH: 8fbbc904a108068dbdafbee43a92afe72c85125f
                    MATRIX: 505->1|594->18|626->21|662->49|696->51|757->83|770->89|858->169|892->171|1044->292|1079->296
                    LINES: 19->1|22->1|23->2|23->2|23->2|26->5|26->5|26->5|26->5|34->13|37->16
                    -- GENERATED --
                */
            