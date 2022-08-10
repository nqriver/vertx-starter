package pl.nqriver.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VerticleA extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start of " + this.getClass().getSimpleName());
    vertx.deployVerticle(new VerticleAA(), whenDeployed -> {
      System.out.println("Deployed " + getClass().getSimpleName());
      vertx.undeploy(whenDeployed.result());
    });

    vertx.deployVerticle(new VerticleAB(), whenDeployed -> {
      System.out.println("Deployed " + getClass().getSimpleName());

    });
    startPromise.complete();
  }

}
