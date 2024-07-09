package com.example.authen_service.data.service;

import com.example.authen_service.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class UserService {
    @Autowired
    protected UserRepository userRepository;
}
