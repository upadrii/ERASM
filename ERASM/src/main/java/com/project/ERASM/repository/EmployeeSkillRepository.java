package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.EmployeeSkill;

@Repository
public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill, Long> {

}
