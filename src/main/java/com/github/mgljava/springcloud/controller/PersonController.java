package com.github.mgljava.springcloud.controller;

import com.github.mgljava.springcloud.domain.Person;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PersonController {

  @Value("${myConfig.myObject.myName}")
  private String name;
  @Value("${myConfig.myObject.myAge}")
  private int age;

  @GetMapping(value = "/person")
  public List<Person> test() {
    System.out.println("name: " + name + ", age : " + age);
    return Collections.singletonList(new Person(10L, "张三", "zhangsan@qq.com", ZonedDateTime.now()));
  }
}
