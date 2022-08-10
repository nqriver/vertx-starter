package pl.nqriver.vertx_starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import pl.nqriver.vertx_starter.verticles.VerticleA;
import pl.nqriver.vertx_starter.verticles.VerticleB;
import pl.nqriver.vertx_starter.verticles.VerticleN;

import java.util.UUID;

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
    vertx.deployVerticle(VerticleN.class.getName(),
      new DeploymentOptions().setInstances(4)
        .setConfig(
          new JsonObject()
            .put("id", UUID.randomUUID().toString())
            .put("name", VerticleN.class.getSimpleName())
        ));

    startPromise.complete();
  }
}
