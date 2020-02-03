package com.github.mgljava.springcloud.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// 开发环境
@Configuration
@Profile("dev")
public class EmbeddedDatabaseConfig {

  @Bean
  public DataSource dataSource() {
    return new DataSource("dev");
  }
}
