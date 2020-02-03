package com.github.mgljava.springcloud.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 一个配置类中提供了所有环境的配置文件
 */
@Configuration
public class ProfileDatabaseConfig {

  @Bean("dataSource")
  @Profile("dev")
  public DataSource embeddedDatabase() {
    return new DataSource("dev");
  }

  @Bean("dataSource")
  @Profile("prod")
  public DataSource productionDatabase() {
    return new DataSource("prod");
  }
}
