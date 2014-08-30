package com.micarshow.core.dao;

import org.apache.ibatis.annotations.Select;

import com.micarshow.core.entities.HelloWorld;

public interface HelloWorldDao extends BaseDao {
  
  @Select("SELECT name, age FROM test")
  HelloWorld getHelloWrold();
}
