package com.micarshow.core.web.env;


public class Local extends Environment {

  @Override
  protected DBSetting configDB() {
    return new DBSetting("local", "localhost", "3306", "test", "root", "");
  }

}
