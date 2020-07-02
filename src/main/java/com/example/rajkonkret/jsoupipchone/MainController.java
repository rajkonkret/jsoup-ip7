package com.example.rajkonkret.jsoupipchone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class MainController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("test")
    public String getHello() {
        User user  = new User("Radek");
        userRepository.save(user);

        return "hello";
    }
}

