package com.stackoverflow;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;


@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

  public HelloApplication() {
    register(HelloResource.class);

    property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
  }

}
