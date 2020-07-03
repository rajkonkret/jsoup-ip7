package com.example.rajkonkret.jsoupipchone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/visits")
public class VisitController {
    @Autowired
    VisitRepository visitRepository;

    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visit createVisit(@RequestBody Visit visit) {
        System.out.println(visit);
        return visitRepository.save(visit);

    }
}
