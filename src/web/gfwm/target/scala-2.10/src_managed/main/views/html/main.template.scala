
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/carousel.css"))),format.raw/*10.98*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">    
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
	              <a class="navbar-brand" href="#">"""),_display_(Seq[Any](/*27.50*/title)),format.raw/*27.55*/("""</a>
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

	    <!-- Carousel
	    ================================================== -->
	    <div id="myCarousel" class="carousel slide" data-ride="carousel">
	      <!-- Indicators -->
	      <ol class="carousel-indicators">
	        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	        <li data-target="#myCarousel" data-slide-to="1"></li>
	        <li data-target="#myCarousel" data-slide-to="2"></li>
	      </ol>
	      <div class="carousel-inner">
	        <div class="item active">
	          <img data-src="holder.js/900x500/auto/#777:#7a7a7a/text:First slide" alt="First slide">
	          <div class="container">
	            <div class="carousel-caption">
	              <h1>Get Fit This Way</h1>
	              <p>Don't waste time planning your workouts. Let us do that for you.</p>
	              <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img data-src="holder.js/900x500/auto/#666:#6a6a6a/text:Second slide" alt="Second slide">
	          <div class="container">
	            <div class="carousel-caption">
	              <h1>Tired of the same old run every day?</h1>
	              <p>Tell us where you are and how far you want to go and we'll pick a route <b>just for you</b>.</p>
	              <p><a class="btn btn-lg btn-primary" href="#" role="button">Give it a go!</a></p>
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img data-src="holder.js/900x500/auto/#666:#6a6a6a/text:Second slide" alt="Second slide">
	          <div class="container">
	            <div class="carousel-caption">
	              <h1>Craving a tougher bike route?</h1>
	              <p>Tell us how far and how high you want to climb and we'll do the rest.</p>
	              <p><a class="btn btn-lg btn-primary" href="#" role="button">Get rolling!</a></p>
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img data-src="holder.js/900x500/auto/#555:#5a5a5a/text:Third slide" alt="Third slide">
	          <div class="container">
	            <div class="carousel-caption">
	              <h1>Into HIIT circuit training?</h1>
	              <p>Tell us how hard you want to work, for how long, and what parts of the body you want to target, and we'll put together an intense workout <b>in no time</b>.</p>
	              <p><a class="btn btn-lg btn-primary" href="#" role="button">Get going now!</a></p>
	            </div>
	          </div>
	        </div>
	      </div>
	      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
	      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
	    </div><!-- /.carousel -->


	    <!-- Marketing messaging and featurettes
	    ================================================== -->
	    <!-- Wrap the rest of the page in another container to center all the content. -->

	    <div class="container marketing">

	      <!-- Three columns of text below the carousel -->
	      <div class="row">

	      </div><!-- /.row -->

	      <!-- START THE FEATURETTES -->

	      <hr class="featurette-divider">

	      <div class="row featurette">
	        <div class="col-md-7">
	          <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It'll blow your mind.</span></h2>
	          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
	        </div>
	        <div class="col-md-5">
	          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
	        </div>
	      </div>

	      <hr class="featurette-divider">

	      <div class="row featurette">
	        <div class="col-md-5">
	          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
	        </div>
	        <div class="col-md-7">
	          <h2 class="featurette-heading">Oh yeah, it's that good. <span class="text-muted">See for yourself.</span></h2>
	          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
	        </div>
	      </div>

	      <hr class="featurette-divider">

	      <div class="row featurette">
	        <div class="col-md-7">
	          <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
	          <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
	        </div>
	        <div class="col-md-5">
	          <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="Generic placeholder image">
	        </div>
	      </div>

	      <hr class="featurette-divider">

	      <!-- /END THE FEATURETTES -->


	      <!-- FOOTER -->
	      <footer>
	        <p class="pull-right"><a href="#">Back to top</a></p>
	        <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
	      </footer>

	    </div><!-- /.container -->

	    <script src=""""),_display_(Seq[Any](/*166.20*/routes/*166.26*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*166.71*/("""" type="text/javascript"></script>
    	<script src=""""),_display_(Seq[Any](/*167.20*/routes/*167.26*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*167.68*/("""" type="text/javascript"></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 09 13:59:19 PST 2013
                    SOURCE: /Users/caw/Projects/GetFitThisWay/src/web/gfwm/app/views/main.scala.html
                    HASH: 913b7f6d2b48c7a6a556ff305ca64c4691c2dee5
                    MATRIX: 560->1|684->31|772->84|798->89|895->151|909->157|964->191|1055->247|1069->253|1134->296|1226->352|1241->358|1301->396|1398->457|1413->463|1467->495|2153->1145|2180->1150|8624->7557|8640->7563|8708->7608|8799->7662|8815->7668|8880->7710
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|48->27|48->27|187->166|187->166|187->166|188->167|188->167|188->167
                    -- GENERATED --
                */
            