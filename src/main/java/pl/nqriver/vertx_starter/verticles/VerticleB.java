package pl.nqriver.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleB extends AbstractVerticle {

  public static final Logger LOGGER = LoggerFactory.getLogger(VerticleB.class.getName());

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOGGER.info("Start {}", getClass().getSimpleName());

    startPromise.complete();
  }
}
