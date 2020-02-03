package com.github.mgljava.springcloud.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// 生产环境
@Configuration
@Profile("prod")
public class ProductionDatabaseConfig {

  @Bean
  public DataSource dataSource() {
    return new DataSource("prod");
  }
}
