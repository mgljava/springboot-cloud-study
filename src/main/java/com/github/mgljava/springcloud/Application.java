package com.github.mgljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    System.out.println(Application.class.getClassLoader());
    SpringApplication.run(Application.class, args);
  }

}
