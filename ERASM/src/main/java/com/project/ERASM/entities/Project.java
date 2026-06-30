package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.project.ERASM.enums.ProjectStatus;

@Entity
@Table(name = "projects")

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @Column(nullable = false, unique = true)
    private String projectCode;

    @Column(nullable = false)
    private String projectName;

    private String client;

    @Column(length = 1000)
    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;

    @OneToMany(mappedBy = "project",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Allocation> allocations = new ArrayList<>();

    @OneToMany(mappedBy = "project",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ResourceRequest> resourceRequests = new ArrayList<>();

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public ProjectStatus getStatus() {
		return status;
	}

	public void setStatus(ProjectStatus status) {
		this.status = status;
	}

	public List<Allocation> getAllocations() {
		return allocations;
	}

	public void setAllocations(List<Allocation> allocations) {
		this.allocations = allocations;
	}

	public List<ResourceRequest> getResourceRequests() {
		return resourceRequests;
	}

	public void setResourceRequests(List<ResourceRequest> resourceRequests) {
		this.resourceRequests = resourceRequests;
	}

	public Project(Long projectId, String projectCode, String projectName, String client, String description,
			LocalDate startDate, LocalDate endDate, ProjectStatus status, List<Allocation> allocations,
			List<ResourceRequest> resourceRequests) {
		this.projectId = projectId;
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.client = client;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.allocations = allocations;
		this.resourceRequests = resourceRequests;
	}

	public Project() {
		
	}
    
}
