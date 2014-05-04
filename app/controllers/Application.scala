package controllers

import scala.concurrent.duration.DurationInt
import play.api._
import play.api.mvc._
import play.api.libs.iteratee._
import play.api.libs.concurrent._
import play.api.libs.concurrent.Execution.Implicits._
import util.Random

object Application extends Controller {

  def index(name: String) = Action { implicit request =>
    Ok(views.html.index("Hello " + name))
  }

}
