package com.micarshow.core.web.env;

import java.util.Properties;

import com.google.inject.AbstractModule;
import com.micarshow.core.service.HelloWorldService;
import com.micarshow.core.service.impl.HelloWorldServiceImpl;

public abstract class  Environment extends AbstractModule {

  @Override
  protected void configure() {
    
    bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
  }
  
  protected abstract Properties getDBProperties();

}
