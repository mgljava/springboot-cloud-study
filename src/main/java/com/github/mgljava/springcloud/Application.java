package com.github.mgljava.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

  public static void main(String[] args) {
    System.out.println(Application.class.getClassLoader());
    SpringApplication.run(Application.class, args);
  }

}
