package com.stackoverflow;

import java.util.Collections;
import java.util.Set;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class HelloApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    return Collections.singleton(HelloResource.class);
  }
}
