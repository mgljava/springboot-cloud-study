package com.github.mgljava.springcloud.config;

public class MyBean {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void sayHello() {
    System.out.println("Hello " + this.name);
  }
}
