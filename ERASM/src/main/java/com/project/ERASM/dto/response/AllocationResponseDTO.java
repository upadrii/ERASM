package com.project.ERASM.dto.response;

import java.time.LocalDate;

import com.project.ERASM.enums.AllocationStatus;

public class AllocationResponseDTO {

    private Long allocationId;

    private Long employeeId;
    private String employeeCode;
    private String employeeName;

    private Long projectId;
    private String projectCode;
    private String projectName;

    private Integer allocationPercentage;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean billable;
    private AllocationStatus status;

    public AllocationResponseDTO() {
    }

    public AllocationResponseDTO(Long allocationId,
            Long employeeId, String employeeCode, String employeeName,
            Long projectId, String projectCode, String projectName,
            Integer allocationPercentage,
            LocalDate startDate, LocalDate endDate,
            Boolean billable,
            AllocationStatus status) {

        this.allocationId = allocationId;
        this.employeeId = employeeId;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.projectId = projectId;
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.allocationPercentage = allocationPercentage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.billable = billable;
        this.status = status;
    }

    public Long getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(Long allocationId) {
        this.allocationId = allocationId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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