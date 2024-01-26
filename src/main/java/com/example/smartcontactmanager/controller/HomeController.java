package com.example.smartcontactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.smartcontactmanager.dao.UserRepository;
import com.example.smartcontactmanager.entities.User;


@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    @ResponseBody
    public String test() {
        User user = new User();
        user.setName("Harikesh Mohan");
        user.setEmail("2021aspire25@gmail.com");
        user.setPassword("harikesh");
        user.setEnabled(true);
        userRepository.save(user);
        return "Hello Duniya";
    }
    
}
