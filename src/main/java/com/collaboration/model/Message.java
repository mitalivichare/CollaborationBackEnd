package com.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity

public class Message {

  private String message;
  @Id
  private int id;
  
  public Message() {}
  
  public Message(int id, String message) {
    this.id = id;
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
