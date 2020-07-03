package com.example.rajkonkret.jsoupipchone;

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
    //@OneToMany(mappedBy = "doctormusze many to  oona itd przećwi")
    Long id;
    String name;
    String surname;

    @OneToOne
    Visit visit;
    // Specialty specialty;
}
