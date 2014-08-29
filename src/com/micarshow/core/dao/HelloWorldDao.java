package com.micarshow.core.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.micarshow.core.entities.HelloWrold;

public interface HelloWorldDao extends BaseDao {
  
  @Select("SELECT * FROM HelloWorld WHERE id = #{userId}")
  HelloWrold getHelloWrold(@Param("userId") String userId);
}
