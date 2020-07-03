package com.example.rajkonkret.jsoupipchone;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    TypeOfVisit typeOfVisit;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;


    @OneToOne
    Doctor doctor;

}
