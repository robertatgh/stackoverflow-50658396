# [Stack Overflow: Jersey JAX-RS REST “getter” method always called][1]


### Run

```bash
mvn jetty:run
```

### cURL

```bash
curl -i -H 'Content-Type:application/json' -d '{"message":"Hello World"}' http://localhost:8080/api/hello
```

With the following resource class

```java
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
```

When we make the previous POST request, the `getSomething()` resource method is also called.


[1]: https://stackoverflow.com/q/50658396/2587435