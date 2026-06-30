package com.project.ERASM.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

import com.project.ERASM.enums.AllocationStatus;

@Entity
@Table(name = "allocations")

public class Allocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allocation_id")
    private Long allocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    private Integer allocationPercentage;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean billable;

    @Enumerated(EnumType.STRING)
    private AllocationStatus status;

	public Long getAllocationId() {
		return allocationId;
	}

	public void setAllocationId(Long allocationId) {
		this.allocationId = allocationId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
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

	public Allocation(Long allocationId, Employee employee, Project project, Integer allocationPercentage,
			LocalDate startDate, LocalDate endDate, Boolean billable, AllocationStatus status) {
		this.allocationId = allocationId;
		this.employee = employee;
		this.project = project;
		this.allocationPercentage = allocationPercentage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.billable = billable;
		this.status = status;
	}

	public Allocation() {
		
	}
	
    
    
}
