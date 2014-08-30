package com.micarshow.core.web.env;

import java.util.Properties;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.micarshow.core.service.HelloWorldService;
import com.micarshow.core.service.impl.HelloWorldServiceImpl;

public abstract class  Environment extends AbstractModule {

  @Override
  protected void configure() {
    
    Names.bindProperties(binder(), this.getDBProperties());
    
  }
  
  protected abstract DBSetting configDB();
  
  private Properties getDBProperties() {
    Properties properties = new Properties();
    DBSetting dbSetting = this.configDB();
    if (null == dbSetting) {
      return properties;
    }
    properties.setProperty("mybatis.environment.id", dbSetting.mybatisEnvId);
    properties.setProperty("JDBC.host", dbSetting.host);
    properties.setProperty("JDBC.port", dbSetting.port);
    properties.setProperty("JDBC.schema", dbSetting.schema);
    properties.setProperty("JDBC.username", dbSetting.username);
    properties.setProperty("JDBC.password", dbSetting.password);
    properties.setProperty("JDBC.autoCommit", "false");
    return properties;
  }
  
  public enum Type{
    LOCAL("local"), QA("qa"), PROD("prod");
    
    private String value;
    
    private Type(String value){
      this.value = value;
    }
    
    public String getValue(){
      return this.value;
    }
  }
  
  class DBSetting {
    
    public DBSetting(String mybatisEnvId, String host, String port,
        String schema, String username, String password) {
      this.mybatisEnvId = mybatisEnvId;
      this.host = host;
      this.port = port;
      this.schema = schema;
      this.username = username;
      this.password = password;
    }

    protected String mybatisEnvId;
    protected String host;
    protected String port;
    protected String schema;
    protected String username;
    protected String password;
  }

}
