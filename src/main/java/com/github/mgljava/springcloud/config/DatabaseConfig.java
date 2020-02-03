package com.github.mgljava.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

  @Bean
  public DataSourceBean dataSourceBean() {
    return new DataSourceBean();
  }
}
