
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/(""" """)))})),format.raw/*3.19*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 09 13:56:51 PST 2013
                    SOURCE: /Users/caw/Projects/GetFitThisWay/src/web/gfwm/app/views/index.scala.html
                    HASH: e233d2104b9b9c86ad3dfb38dc64b714ce1d257e
                    MATRIX: 556->1|667->18|704->21|725->34|764->36|797->38
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3
                    -- GENERATED --
                */
            