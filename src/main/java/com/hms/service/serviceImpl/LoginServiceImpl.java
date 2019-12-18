package com.hms.service.serviceImpl;

import com.hms.dao.LoginDao;
import com.hms.entity.Login;
import com.hms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    public Login Login(String name,String password) throws Exception {
        return loginDao.Login(name,password);
    }
}
