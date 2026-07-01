package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    boolean existsBySkillName(String skillName);
}
