package com.example.rajkonkret.jsoupipchone.model;


import com.example.rajkonkret.jsoupipchone.StatusYourVisit;
import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import com.example.rajkonkret.jsoupipchone.model.Doctor;
import com.example.rajkonkret.jsoupipchone.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    LocalDate dateOfVisit;
    @Enumerated(EnumType.STRING)
    StatusYourVisit status;
    @Enumerated(EnumType.STRING)
    TypeOfVisit typeOfVisit;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    User user;



    @ManyToOne
    @JoinColumn(name = "doctor_id")
    Doctor doctor;

    public Visit(LocalDate dateOfVisit, StatusYourVisit status, TypeOfVisit typeOfVisit, User user, Doctor doctor) {
        this.dateOfVisit = dateOfVisit;
        this.status = status;
        this.typeOfVisit = typeOfVisit;
        //this.user = user;
        this.doctor = doctor;
    }
}
