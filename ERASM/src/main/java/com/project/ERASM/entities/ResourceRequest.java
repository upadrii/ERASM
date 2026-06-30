package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

import com.project.ERASM.enums.RequestStatus;

@Entity
@Table(name = "resource_requests")

public class ResourceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long requestId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requested_by", nullable = false)
    private Employee requestedBy;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill requiredSkill;
    
    private Integer requiredCount;

    private Integer minimumExperience;

    private LocalDate requiredFrom;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    @Column(length = 500)
    private String remarks;

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(Employee requestedBy) {
		this.requestedBy = requestedBy;
	}

	public Skill getRequiredSkill() {
		return requiredSkill;
	}

	public void setRequiredSkill(Skill requiredSkill) {
		this.requiredSkill = requiredSkill;
	}

	public Integer getRequiredCount() {
		return requiredCount;
	}

	public void setRequiredCount(Integer requiredCount) {
		this.requiredCount = requiredCount;
	}

	public Integer getMinimumExperience() {
		return minimumExperience;
	}

	public void setMinimumExperience(Integer minimumExperience) {
		this.minimumExperience = minimumExperience;
	}

	public LocalDate getRequiredFrom() {
		return requiredFrom;
	}

	public void setRequiredFrom(LocalDate requiredFrom) {
		this.requiredFrom = requiredFrom;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public ResourceRequest(Long requestId, Project project, Employee requestedBy, Skill requiredSkill,
			Integer requiredCount, Integer minimumExperience, LocalDate requiredFrom, RequestStatus status,
			String remarks) {
		this.requestId = requestId;
		this.project = project;
		this.requestedBy = requestedBy;
		this.requiredSkill = requiredSkill;
		this.requiredCount = requiredCount;
		this.minimumExperience = minimumExperience;
		this.requiredFrom = requiredFrom;
		this.status = status;
		this.remarks = remarks;
	}

	public ResourceRequest() {
		
	}
    
    
}
