package com.github.pushman.hfll

import org.vertx.java.deploy.impl.cli.Starter

object App extends App {

  println("Hello World!")
  Starter.main(Array("run", "com.github.pushman.hfll.StarterVerticle"))
  println("Goodbye World!")
}
