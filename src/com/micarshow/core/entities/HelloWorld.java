package com.micarshow.core.entities;

public class HelloWorld extends BaseEntity {

  private static final long serialVersionUID = -7129720066306038419L;

  private String name;
  
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  
}
