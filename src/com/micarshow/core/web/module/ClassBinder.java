package com.micarshow.core.web.module;

import com.google.inject.AbstractModule;
import com.micarshow.core.service.HelloWorldService;
import com.micarshow.core.service.impl.HelloWorldServiceImpl;

public class ClassBinder extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
  }

}
