package com.project.ERASM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.ResourceRequest;
import com.project.ERASM.enums.RequestStatus;

@Repository
public interface ResourceRequestRepository extends JpaRepository<ResourceRequest, Long> {
    long countByStatus(RequestStatus status);
}
