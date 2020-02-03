package com.github.mgljava.springcloud.config;

import com.github.mgljava.springcloud.profile.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 嵌套内部类注入
 */
@Configuration
public class NestedConfiguration {

  @Autowired
  private DataSource dataSource;

  static class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
      return new DataSource("nested");
    }
  }
}
