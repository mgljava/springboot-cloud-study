package com.github.mgljava.springcloud.domain;

import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  private Long id;
  private String name;
  private String email;
  private ZonedDateTime birthDay;
}
