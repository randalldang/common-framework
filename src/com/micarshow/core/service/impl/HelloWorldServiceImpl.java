package com.micarshow.core.service.impl;

import com.micarshow.core.service.HelloWorldService;

public class HelloWorldServiceImpl extends BaseServiceImpl implements
    HelloWorldService {

  @Override
  public String sayHello() {
    return "Hello World";
  }

}
