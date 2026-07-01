package com.project.ERASM.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERASM.entities.AuditLog;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
	List<AuditLog> findByTimestampBetween(
	        LocalDateTime start,
	        LocalDateTime end);

	List<AuditLog> findByAction(String action);
}
