package pl.nqriver.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleN extends AbstractVerticle {

  private static final Logger LOGGER = LoggerFactory.getLogger(VerticleN.class.getName());

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOGGER.info("Start of: {} on thread: {} with config: {}",
      getClass().getSimpleName(),
      Thread.currentThread().getName(),
      config().toString());

    startPromise.complete();
  }

}
