package com.micarshow.core.web.env;


public class QA extends Environment {

  @Override
  protected DBSetting configDB() {
    throw new UnsupportedOperationException("QA DB setting is not provided");
  }

}
