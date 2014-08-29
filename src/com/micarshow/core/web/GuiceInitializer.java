package com.micarshow.core.web;

import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.micarshow.core.web.env.DB;
import com.micarshow.core.web.env.Local;

public class GuiceInitializer extends GuiceServletContextListener{

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new Dispatcher(), JdbcHelper.HSQLDB_Embedded, new Local(),
        new DB());
  }

}
