package org.agoncal.quarkus.starting.config;

import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationConfiguration {

  @Inject
  Logger logger;

  public void startupEvent(@Observes StartupEvent event){
    logger.info("Application started!");
  }
}
