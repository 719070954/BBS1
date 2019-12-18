package com.hms.dao;

import com.hms.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.userdetails.User;

public interface LoginDao {
    @Select("select * from login where name = #{name} and password = #{password}")
    Login Login(@Param("name") String name, @Param("password") String password)throws Exception;
}
