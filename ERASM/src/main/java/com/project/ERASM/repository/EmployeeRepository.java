package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}