package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.ResourceRequest;

@Repository
public interface ResourceRequestRepository extends JpaRepository<ResourceRequest, Long> {

}
