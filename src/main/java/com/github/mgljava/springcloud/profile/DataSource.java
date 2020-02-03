package com.github.mgljava.springcloud.profile;

public class DataSource {

  private String env;

  public DataSource(String env) {
    this.env = env;
  }

  public void thisEnv() {
    System.out.println("this env is " + env);
  }
}
