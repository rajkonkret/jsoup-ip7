package com.example.rajkonkret.jsoupipchone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println(doctor);
        return doctorRepository.save(doctor);
    }
}
