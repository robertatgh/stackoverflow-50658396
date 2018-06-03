package com.stackoverflow;

import javax.validation.constraints.Size;

public class HelloMessage {

  @Size(max = 100)
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
