package com.micarshow.core.web.module;

import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.micarshow.core.dao.HelloWorldDao;

public class MySqlDBModule extends MyBatisModule {

  @Override
  protected void initialize() {
    install(JdbcHelper.MySQL);
    
    bindDataSourceProviderType(PooledDataSourceProvider.class);
    bindTransactionFactoryType(JdbcTransactionFactory.class);
    addMapperClass(HelloWorldDao.class);
  }
  
  
}
