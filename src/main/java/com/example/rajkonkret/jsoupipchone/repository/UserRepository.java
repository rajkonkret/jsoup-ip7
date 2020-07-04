package com.example.rajkonkret.jsoupipchone.repository;


import com.example.rajkonkret.jsoupipchone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public
interface UserRepository extends JpaRepository<User,Long> {

    }
