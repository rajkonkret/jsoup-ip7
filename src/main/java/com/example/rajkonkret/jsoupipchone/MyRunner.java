package com.example.rajkonkret.jsoupipchone;

import com.example.rajkonkret.jsoupipchone.model.Doctor;
import com.example.rajkonkret.jsoupipchone.repository.DoctorRepository;
import com.example.rajkonkret.jsoupipchone.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private final DoctorService doctorService;

    public MyRunner(DoctorRepository doctorRepository, DoctorService doctorService) {
        this.doctorRepository = doctorRepository;
        this.doctorService = doctorService;
    }

    @Override
    public void run(String... args) throws Exception {

        Doctor doctor = new Doctor("fra", "kjres", Specialty.OGÓLNY);
        System.out.println(doctor);
        doctorRepository.save(doctor);
        doctorRepository.findAll().forEach(System.out::println);
        List<Doctor> doctorRadek = doctorService.findByName("Radek");
        System.out.println(doctorRadek);
        doctorRadek.forEach(s -> s.setSpecialty(Specialty.OKULISTA));
        System.out.println("C L R");
        System.out.println(doctorRadek);
    }
}
