package controllers

import play.api._
import play.api.mvc._
import java.io.File

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("File Upload In Play"))
  }

  def uploadFile = Action(parse.multipartFormData) { request =>
    request.body.file("fileUpload").map { video =>
      val videoFilename = video.filename
      val contentType = video.contentType.get
      video.ref.moveTo(new File("/home/neelkanth/Desktop/" + video.filename))
    }.getOrElse {
      Redirect(routes.Application.index)
    }
    Ok("File has been uploaded")
  }
}