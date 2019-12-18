package com.hms.service;

import com.hms.entity.Login;


public interface LoginService {
    Login Login(String name,String password) throws Exception;
}
