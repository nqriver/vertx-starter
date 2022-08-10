package pl.nqriver.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleAB extends AbstractVerticle {

  public static final Logger LOGGER = LoggerFactory.getLogger(VerticleAB.class.getName());

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOGGER.info("Start {}", getClass().getSimpleName());
    startPromise.complete();
  }
}
