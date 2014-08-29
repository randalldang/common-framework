package com.micarshow.core.web.env;

import java.util.Properties;

public class Local extends Environment {

  @Override
  protected Properties getDBProperties() {
    Properties myBatisProperties = new Properties();
    myBatisProperties.setProperty("mybatis.environment.id", "test");
    myBatisProperties.setProperty("JDBC.schema", "mybatis-guice_TEST");
    myBatisProperties.setProperty("derby.create", "true");
    myBatisProperties.setProperty("JDBC.username", "sa");
    myBatisProperties.setProperty("JDBC.password", "");
    myBatisProperties.setProperty("JDBC.autoCommit", "false");
    return myBatisProperties;
  }

}
