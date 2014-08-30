package com.micarshow.core.service.impl;

import com.google.inject.Inject;
import com.micarshow.core.dao.HelloWorldDao;
import com.micarshow.core.entities.HelloWorld;
import com.micarshow.core.service.HelloWorldService;

public class HelloWorldServiceImpl extends BaseServiceImpl implements
    HelloWorldService {
  
  @Inject
  HelloWorldDao helloWorldDao;

  @Override
  public HelloWorld sayHello() {
    return this.helloWorldDao.getHelloWrold();
  }

}
