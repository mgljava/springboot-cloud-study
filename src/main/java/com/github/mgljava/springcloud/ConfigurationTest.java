package com.github.mgljava.springcloud;

import com.github.mgljava.springcloud.config.BeanConfiguration;
import com.github.mgljava.springcloud.config.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    // ctx.register(BeanConfiguration.class);
    // ctx.refresh();
    MyBean bean = ctx.getBean(MyBean.class);
    bean.sayHello();
  }
}
