package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.EmployeeCertification;

@Repository
public interface EmployeeCertificationRepository extends JpaRepository<EmployeeCertification, Integer> {

}
