package com.micarshow.core.web.env;

import java.util.Properties;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.name.Names;
import com.micarshow.core.dao.HelloWorldDao;

public class DB extends MyBatisModule {

  @Override
  protected void initialize() {
    install(JdbcHelper.HSQLDB_Embedded);
    
    bindDataSourceProviderType(PooledDataSourceProvider.class);
    bindTransactionFactoryType(JdbcTransactionFactory.class);
    addMapperClass(HelloWorldDao.class);
    
    Names.bindProperties(binder(), getDBProperties());
    
  }
  
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
