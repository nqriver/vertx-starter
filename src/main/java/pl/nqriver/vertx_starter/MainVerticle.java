package pl.nqriver.vertx_starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import pl.nqriver.vertx_starter.verticles.VerticleA;
import pl.nqriver.vertx_starter.verticles.VerticleB;

public class MainVerticle extends AbstractVerticle {


  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());
  }
  @Override
  public void start(Promise<Void> startPromise) throws Exception {

    System.out.println("Start " + getClass().getName());
    vertx.deployVerticle(new VerticleA());
    vertx.deployVerticle(new VerticleB());
    startPromise.complete();
  }
}
