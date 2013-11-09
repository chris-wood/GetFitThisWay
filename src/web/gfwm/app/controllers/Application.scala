package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

	val title = "Get Fit This Way!"

  def gotoIndex = Action {
    Ok(views.html.index(title))
  }

  def gotoPlanRun = Action {
  	Ok(views.html.Planners.run(title))
  }

}