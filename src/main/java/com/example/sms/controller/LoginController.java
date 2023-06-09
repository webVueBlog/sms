package com.example.sms.controller;

import com.example.sms.entity.Login;
import com.example.sms.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Login login(@RequestParam String username, @RequestParam String password){
        return iLoginService.login(username, password);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    private Login login2(@RequestBody Login login){
        return iLoginService.login(login.getUsername(), login.getPassword());
    }
}
