package com.micarshow.core.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.micarshow.core.exception.CommonException;

public abstract class BaseServlet extends HttpServlet {

  private static final long serialVersionUID = -520405083713009101L;
  
  @Override
  protected final void  doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      this.handleGet(req, resp);
    } catch(CommonException e) {
      //TODO log the exception
    }
    
  }
  
  @Override
  protected final void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      this.handlePost(req, resp);
    } catch (CommonException e) {
      // TODO log the exception
    }
  }
  
  @Override
  protected final void doDelete(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      this.handleDelete(req, resp);
    } catch (CommonException e) {
      // TODO log the exception
    }
  }
  
  @Override
  protected final void doPut(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    try {
      this.handlePut(req, resp);
    } catch (CommonException e) {
      // TODO log the exception
    }
  }
  
  protected abstract void handleGet(HttpServletRequest req, HttpServletResponse resp);
  
  protected abstract void handlePost(HttpServletRequest req, HttpServletResponse resp);
  
  protected abstract void handleDelete(HttpServletRequest req, HttpServletResponse resp);
  
  protected abstract void handlePut(HttpServletRequest req, HttpServletResponse resp);

}
