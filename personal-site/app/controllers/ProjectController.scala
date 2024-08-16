package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class ProjectController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
    def show(pName: String) = Action {implicit request: Request[AnyContent] => 
        pName match {
            case "Particle-Engine" => Ok(views.html.projectPages.particleEngine())
            case _ => Ok(views.html.projects())
        }
    }
}