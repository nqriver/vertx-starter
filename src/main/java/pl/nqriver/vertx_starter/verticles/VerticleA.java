package pl.nqriver.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleA extends AbstractVerticle {

  public static final Logger LOGGER = LoggerFactory.getLogger(VerticleA.class.getName());

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOGGER.info("Start {}", getClass().getSimpleName());
    vertx.deployVerticle(new VerticleAA(), whenDeployed -> {
      LOGGER.info("Deployed {}", getClass().getSimpleName());
      vertx.undeploy(whenDeployed.result());
    });

    vertx.deployVerticle(new VerticleAB(), whenDeployed -> {
      LOGGER.info("Deployed {}", getClass().getSimpleName());

    });
    startPromise.complete();
  }

}
