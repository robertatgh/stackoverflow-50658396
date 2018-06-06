package com.stackoverflow;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/hello")
@Produces("application/json")
@Consumes("application/json")
public class HelloResource {

  @GET
  public @Valid HelloMessage getSomething() {
    System.out.println("* * * *---==** getSomething() called **==---* * * *");
    HelloMessage helloMessage = new HelloMessage();
    helloMessage.setMessage("Hello World!");
    return helloMessage;
  }

  @POST
  public @Valid HelloMessage updateMessage(@Valid HelloMessage message) {
    return message;
  }
}
