package com.project.ERASM.dto.request;

import java.time.LocalDate;

import com.project.ERASM.enums.AllocationStatus;

public class AllocationRequestDTO {

    private Long employeeId;
    private Long projectId;
    private Integer allocationPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean billable;
    private AllocationStatus status;

    public AllocationRequestDTO() {
    }

    public AllocationRequestDTO(Long employeeId, Long projectId,
            Integer allocationPercentage, LocalDate startDate,
            LocalDate endDate, Boolean billable,
            AllocationStatus status) {
        this.employeeId = employeeId;
        this.projectId = projectId;
        this.allocationPercentage = allocationPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.billable = billable;
        this.status = status;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getAllocationPercentage() {
        return allocationPercentage;
    }

    public void setAllocationPercentage(Integer allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
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

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public AllocationStatus getStatus() {
        return status;
    }

    public void setStatus(AllocationStatus status) {
        this.status = status;
    }
}