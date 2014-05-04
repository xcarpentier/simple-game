package controllers

import scala.concurrent.duration.DurationInt
import play.api._
import play.api.mvc._
import play.api.libs.iteratee._
import play.api.libs.concurrent._
import play.api.libs.concurrent.Execution.Implicits._
import util.Random

object WebSock extends Controller {

  def aleatPosition() = WebSocket.using[String] { implicit request =>

	val in = Iteratee.ignore[String]
	val out = Enumerator.repeatM {
		Promise.timeout(Random.nextInt + "", 1 seconds)
	}
	(in,out)

  }

}
