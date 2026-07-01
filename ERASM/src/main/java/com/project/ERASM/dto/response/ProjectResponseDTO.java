package com.project.ERASM.dto.response;

import java.time.LocalDate;

import com.project.ERASM.enums.ProjectStatus;

public class ProjectResponseDTO {

    private Long projectId;
    private String projectCode;
    private String projectName;
    private String client;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private ProjectStatus status;

    public ProjectResponseDTO() {
    }

    public ProjectResponseDTO(Long projectId, String projectCode,
                              String projectName, String client,
                              String description, LocalDate startDate,
                              LocalDate endDate, ProjectStatus status) {
        this.projectId = projectId;
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.client = client;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

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
}