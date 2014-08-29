package com.micarshow.core.web;

import com.google.inject.servlet.ServletModule;
import com.micarshow.core.web.servlet.HelloWorldServlet;

public class Dispatcher extends ServletModule{

  @Override
  protected void configureServlets() {
    serve("/helloworld").with(HelloWorldServlet.class);
  }
}
