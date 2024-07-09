package com.example.authen_service.query.controller;

import com.example.authen_service.query.service.UserQueryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserQueryController {
    @Autowired
    private UserQueryServiceImp userQueryServiceImp;
}
