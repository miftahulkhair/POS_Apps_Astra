package com.astra.pos.service;

import com.astra.pos.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {
    @Autowired
    LoginDao loginDao;

    public boolean checkLogin(String username, String password){
        return loginDao.checkLogin(username, password);
    }
}
