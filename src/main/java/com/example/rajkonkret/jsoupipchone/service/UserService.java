package com.example.rajkonkret.jsoupipchone.service;

import com.example.rajkonkret.jsoupipchone.model.User;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
