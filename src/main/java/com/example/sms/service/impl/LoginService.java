package com.example.sms.service.impl;

import com.example.sms.dao.ILoginDao;
import com.example.sms.entity.Login;
import com.example.sms.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Login login(String username, String password) {
        return iLoginDao.login(username, password);
    }
}