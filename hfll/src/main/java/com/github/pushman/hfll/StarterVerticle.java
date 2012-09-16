package com.github.pushman.hfll;

import org.vertx.java.deploy.Verticle;

public class StarterVerticle extends Verticle {

    @Override
    public void start(){
        container.deployVerticle("com.github.pushman.hfll.ServerVerticle");
    }
}
