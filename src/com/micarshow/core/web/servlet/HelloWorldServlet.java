package com.micarshow.core.web.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micarshow.core.service.HelloWorldService;

@Singleton
public class HelloWorldServlet extends BaseServlet {

  private static final long serialVersionUID = 8625689852132905083L;
  
  @Inject
  private HelloWorldService helloWorldService;

  @Override
  protected void handleGet(HttpServletRequest req, HttpServletResponse resp) {
    try {
      resp.getWriter().write(new Gson().toJson(helloWorldService.sayHello()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void handlePost(HttpServletRequest req, HttpServletResponse resp) {
  }

  @Override
  protected void handleDelete(HttpServletRequest req, HttpServletResponse resp) {
  }

  @Override
  protected void handlePut(HttpServletRequest req, HttpServletResponse resp) {
  }
}
