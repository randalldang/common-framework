package com.micarshow.core.web.env;

public class Prod extends Environment {

  @Override
  protected DBSetting configDB() {
    throw new UnsupportedOperationException("PROD DB setting is not provided");
  }

}
