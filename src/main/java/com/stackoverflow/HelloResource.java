package com.stackoverflow;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {

  @GET
  public @Valid HelloMessage getSomething() {
    HelloMessage helloMessage = new HelloMessage();
    helloMessage.setMessage("Hello World!");
    return helloMessage;
  }

  @POST
  public @Valid HelloMessage updateMessage(@Valid HelloMessage message) {
    return message;
  }
}
