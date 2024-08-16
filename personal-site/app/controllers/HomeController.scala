package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  /**
   * Create an Action to render the resume page
   */

  def resume() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.resume())
  }

  /**
   * Create an Action to render the projects page
   */

  def projects() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.projects())
  }

  /**
   * Create an Action to render the about page
   */

  def aboutPage() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.about())
  }

  def noPage(page: String) = Action { implicit request: Request[AnyContent] =>
    NotFound(views.html.commons.noPageFound())
  }
}
