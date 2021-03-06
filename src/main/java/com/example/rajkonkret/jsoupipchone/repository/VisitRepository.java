package com.example.rajkonkret.jsoupipchone.repository;

import com.example.rajkonkret.jsoupipchone.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
}
