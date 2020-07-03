package com.example.rajkonkret.jsoupipchone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("test")
    public List<User> getHello() {
       //ReGwiazda:) niedługo będzie livy jak Waldek robił i kosił 200 k na miesiąć;) User user  = new User("Radek", "Janiak");
        System.out.println(LocalDate.now());
        return userRepository.findAll();
    }
    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody User user){

        System.out.println(user);
        return userRepository.save(user);

    }
}

