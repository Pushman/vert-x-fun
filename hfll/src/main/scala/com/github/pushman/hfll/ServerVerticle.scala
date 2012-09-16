package com.github.pushman.hfll

import org.vertx.java.core.Handler
import org.vertx.java.deploy.Verticle
import org.vertx.java.core.http.HttpServerRequest
import scala.collection.JavaConversions._

class ServerVerticle extends Verticle {
  def start {
    vertx.createHttpServer().requestHandler(new RequestHandler).listen(8080)
    println("Started listening on port 8080")
  }
}

class RequestHandler extends Handler[HttpServerRequest] {
  def handle(req: HttpServerRequest) {
    println("Got request: " + req.uri)
    println("Headers are: ")
    for (key <- req.headers.keySet) {
      println(key + ":" + req.headers.get(key))
    }
    req.response.headers.put("Content-Type", "text/html; charset=UTF-8")
    req.response.end("<html><body><h1>Hello from vert.x!</h1></body></html>")
  }
}