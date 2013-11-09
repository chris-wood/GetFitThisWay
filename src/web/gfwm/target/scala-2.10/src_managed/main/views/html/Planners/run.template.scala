
package views.html.Planners

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
object run extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">    
		<!-- <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.53*/routes/*11.59*/.Assets.at("stylesheets/leaflet.css"))),format.raw/*11.96*/(""""/> -->
		<!--[if lte IE 8]>
			<link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.34*/routes/*13.40*/.Assets.at("stylesheets/leaflet.ie.css"))),format.raw/*13.80*/("""" />
		<![endif]-->

		<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
		<style type="text/css">
		  html """),format.raw/*18.10*/("""{"""),format.raw/*18.11*/(""" height: 100% """),format.raw/*18.25*/("""}"""),format.raw/*18.26*/("""
		  body """),format.raw/*19.10*/("""{"""),format.raw/*19.11*/(""" height: 100%; margin: 10px; padding: 10px """),format.raw/*19.54*/("""}"""),format.raw/*19.55*/("""
		  #map-canvas """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/(""" height: 100% """),format.raw/*20.32*/("""}"""),format.raw/*20.33*/("""
		  #panel """),format.raw/*21.12*/("""{"""),format.raw/*21.13*/("""
	        position: relative;
	        top: 5px;
	        left: 50%;
	        margin-left: -180px;
	        z-index: 5;
	        background-color: #fff;
	        padding: 5px;
	        border: 1px solid #999;
	      """),format.raw/*30.8*/("""}"""),format.raw/*30.9*/("""
		</style>
		<script type="text/javascript"
		  src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAi-lt4ht-4058cP1fjn0WcNeH6ofQ3Vs&sensor=false">
		</script>
		<script type="text/javascript">
		  function initialize() """),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
		    var mapOptions = """),format.raw/*37.24*/("""{"""),format.raw/*37.25*/("""
		      center: new google.maps.LatLng(-34.397, 150.644),
		      zoom: 8,
		      mapTypeId: google.maps.MapTypeId.ROADMAP
		    """),format.raw/*41.7*/("""}"""),format.raw/*41.8*/(""";
		    var map = new google.maps.Map(document.getElementById("map-canvas"),
		        mapOptions);
		  """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""
		  google.maps.event.addDomListener(window, 'load', initialize);
		</script>
    </head>

    <body>

    	<div class="navbar-wrapper">
	      <div class="container">

	        <div class="navbar navbar-inverse navbar-static-top" role="navigation">
	          <div class="container">
	            <div class="navbar-header">
	              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	                <span class="sr-only">Toggle navigation</span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	              </button>
	              <a class="navbar-brand" href="#">"""),_display_(Seq[Any](/*63.50*/title)),format.raw/*63.55*/("""</a>
	            </div>
	            <div class="navbar-collapse collapse">
	              <ul class="nav navbar-nav">
	                <li class="active"><a href="#">Home</a></li>
	                <li><a href="#about">About</a></li>
	                <li class="dropdown">
	                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Planners <b class="caret"></b></a>
	                  <ul class="dropdown-menu">
	                    <li><a href="#">Runs</a></li>
	                    <li><a href="#">Bike Rides</a></li>
	                    <li><a href="#">HIIT Circuits</a></li>
	                  </ul>
	                </li>
	              </ul>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
    	
    	<!-- <div class="row"> -->
    	<div id="panel">
	      <input onclick="clearMarkers();" type=button value="Hide Markers">
	      <input onclick="showMarkers();" type=button value="Show All Markers">
	      <input onclick="deleteMarkers();" type=button value="Delete Markers">

	      <br/>

	      <b>Start: </b>
		    <select id="start" onchange="calcRoute();">
		      <option value="chicago, il">Chicago</option>
		      <option value="st louis, mo">St Louis</option>
		      <option value="joplin, mo">Joplin, MO</option>
		      <option value="oklahoma city, ok">Oklahoma City</option>
		      <option value="amarillo, tx">Amarillo</option>
		      <option value="gallup, nm">Gallup, NM</option>
		      <option value="flagstaff, az">Flagstaff, AZ</option>
		      <option value="winona, az">Winona</option>
		      <option value="kingman, az">Kingman</option>
		      <option value="barstow, ca">Barstow</option>
		      <option value="san bernardino, ca">San Bernardino</option>
		      <option value="los angeles, ca">Los Angeles</option>
		    </select>
		    <b>End: </b>
		    <select id="end" onchange="calcRoute();">
		      <option value="chicago, il">Chicago</option>
		      <option value="st louis, mo">St Louis</option>
		      <option value="joplin, mo">Joplin, MO</option>
		      <option value="oklahoma city, ok">Oklahoma City</option>
		      <option value="amarillo, tx">Amarillo</option>
		      <option value="gallup, nm">Gallup, NM</option>
		      <option value="flagstaff, az">Flagstaff, AZ</option>
		      <option value="winona, az">Winona</option>
		      <option value="kingman, az">Kingman</option>
		      <option value="barstow, ca">Barstow</option>
		      <option value="san bernardino, ca">San Bernardino</option>
		      <option value="los angeles, ca">Los Angeles</option>
		    </select>
	    </div>
    	
    	<!-- the map -->
    	<div id="map-canvas"/>

	    <script src=""""),_display_(Seq[Any](/*127.20*/routes/*127.26*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*127.71*/("""" type="text/javascript"></script>
    	<script src=""""),_display_(Seq[Any](/*128.20*/routes/*128.26*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*128.68*/("""" type="text/javascript"></script>
    	<script src=""""),_display_(Seq[Any](/*129.20*/routes/*129.26*/.Assets.at("javascripts/planner.js"))),format.raw/*129.62*/("""" type="text/javascript"></script>
    	// <script src=""""),_display_(Seq[Any](/*130.23*/routes/*130.29*/.Assets.at("javascripts/leaflet.js"))),format.raw/*130.65*/("""" type="text/javascript"></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 09 14:16:07 PST 2013
                    SOURCE: /Users/caw/Projects/GetFitThisWay/src/web/gfwm/app/views/Planners/run.scala.html
                    HASH: b461864a2b2bbcbb3c281fda2bf3b9954b0f450a
                    MATRIX: 563->1|672->16|760->69|786->74|883->136|897->142|952->176|1043->232|1057->238|1122->281|1219->342|1234->348|1288->380|1383->439|1398->445|1457->482|1555->544|1570->550|1632->590|1789->719|1818->720|1860->734|1889->735|1927->745|1956->746|2027->789|2056->790|2101->807|2130->808|2172->822|2201->823|2241->835|2270->836|2513->1052|2541->1053|2794->1278|2823->1279|2875->1303|2904->1304|3062->1435|3090->1436|3221->1540|3249->1541|4008->2264|4035->2269|6752->4949|6768->4955|6836->5000|6927->5054|6943->5060|7008->5102|7099->5156|7115->5162|7174->5198|7268->5255|7284->5261|7343->5297
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|34->13|39->18|39->18|39->18|39->18|40->19|40->19|40->19|40->19|41->20|41->20|41->20|41->20|42->21|42->21|51->30|51->30|57->36|57->36|58->37|58->37|62->41|62->41|65->44|65->44|84->63|84->63|148->127|148->127|148->127|149->128|149->128|149->128|150->129|150->129|150->129|151->130|151->130|151->130
                    -- GENERATED --
                */
            