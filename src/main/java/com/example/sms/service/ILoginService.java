package com.example.sms.service;

import com.example.sms.entity.Login;

public interface ILoginService {
    Login login(String username, String password);
}