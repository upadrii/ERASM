package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}