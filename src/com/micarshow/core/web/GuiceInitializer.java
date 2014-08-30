package com.micarshow.core.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.micarshow.core.web.env.Environment;
import com.micarshow.core.web.env.Environment.Type;
import com.micarshow.core.web.env.Local;
import com.micarshow.core.web.env.Prod;
import com.micarshow.core.web.env.QA;
import com.micarshow.core.web.module.ClassBinder;
import com.micarshow.core.web.module.Dispatcher;
import com.micarshow.core.web.module.MySqlDBModule;

public class GuiceInitializer extends GuiceServletContextListener{

  @Override
  protected Injector getInjector() {
    
    return Guice.createInjector(new Dispatcher(), new ClassBinder(),
        getEnvironment(), new MySqlDBModule());

  }

  private Environment getEnvironment() {
    String envString = System.getProperty("env");
    
    Environment env = null;
    if (envString == null) {
      env = new Local();
    } else {
      Type type = Enum.valueOf(Environment.Type.class, envString.toUpperCase());
      
      switch(type) {
        case PROD: env = new Prod();
        case QA: env = new QA();
        default: env = new Local();
      }
    }
    return env;
  }
}
