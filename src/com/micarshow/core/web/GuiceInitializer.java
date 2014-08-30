package com.micarshow.core.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.micarshow.core.web.env.Local;

public class GuiceInitializer extends GuiceServletContextListener{

  @Override
  protected Injector getInjector() {
	  
    return Guice.createInjector(new Dispatcher(), new Local());
  }

  
  
}
