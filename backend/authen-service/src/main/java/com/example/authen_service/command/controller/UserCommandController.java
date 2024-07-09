package com.example.authen_service.command.controller;

import com.example.authen_service.command.service.UserCommandServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {
    @Autowired
    private UserCommandServiceImp userCommandServiceImp;
}
