package com.example.rajkonkret.jsoupipchone.model;

import com.example.rajkonkret.jsoupipchone.TypeOfVisit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String surname;
    @Enumerated(EnumType.STRING)
    TypeOfVisit typeOfVisit;
    @OneToOne
    Visit visit;
    // Specialty specialty;
}
