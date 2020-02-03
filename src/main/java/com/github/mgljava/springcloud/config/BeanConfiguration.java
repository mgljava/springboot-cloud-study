package com.github.mgljava.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Import(DatabaseConfig.class)
@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {

  private final DatabaseConfig databaseConfig;

  public BeanConfiguration(DatabaseConfig databaseConfig) {
    this.databaseConfig = databaseConfig;
  }

  @Bean
  public MyBean myBean(Environment environment) {
    DataSourceBean dataSourceBean = databaseConfig.dataSourceBean();
    dataSourceBean.sayHello();
    MyBean myBean = new MyBean();
    myBean.setName(environment.getProperty("myBean.name"));
    return myBean;
  }
}
