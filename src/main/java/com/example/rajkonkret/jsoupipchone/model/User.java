package com.example.rajkonkret.jsoupipchone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.element.Element;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String surname;
    String pesel;
   // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @OneToMany
    Set<Visit> visit;


    public User(String user, String surname) {
        this.name = user;
        this.surname = surname;
    }


    public User(String name, String surname, String pesel, Set<Visit> visit) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.visit = visit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
