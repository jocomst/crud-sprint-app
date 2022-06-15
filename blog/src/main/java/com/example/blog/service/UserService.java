package com.example.blog.service;

import com.example.blog.model.User;
import com.example.blog.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

//        boolean authenticate(String username, String password);
        User save(UserRegistrationDto registrationDto);
}
