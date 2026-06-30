package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(nullable = false, unique = true)
    private String employeeCode;

    private String firstName;

    private String lastName;

    private String designation;

    private String department;

    private LocalDate joiningDate;

    private String phone;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // Self-reference (Manager)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @OneToMany(mappedBy = "manager")
    private List<Employee> subordinates = new ArrayList<>();

    // Skills

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL)
    private List<EmployeeSkill> employeeSkills = new ArrayList<>();

    // Certifications

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL)
    private List<EmployeeCertification> certifications = new ArrayList<>();

    // Project Allocations

    @OneToMany(mappedBy = "employee")
    private List<Allocation> allocations = new ArrayList<>();

    // Resource Requests

    @OneToMany(mappedBy = "requestedBy")
    private List<ResourceRequest> resourceRequests = new ArrayList<>();

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	public List<EmployeeSkill> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<EmployeeSkill> employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public List<EmployeeCertification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<EmployeeCertification> certifications) {
		this.certifications = certifications;
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

	public Employee(Long employeeId, String employeeCode, String firstName, String lastName, String designation,
			String department, LocalDate joiningDate, String phone, String address, User user, Employee manager,
			List<Employee> subordinates, List<EmployeeSkill> employeeSkills, List<EmployeeCertification> certifications,
			List<Allocation> allocations, List<ResourceRequest> resourceRequests) {
		this.employeeId = employeeId;
		this.employeeCode = employeeCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.department = department;
		this.joiningDate = joiningDate;
		this.phone = phone;
		this.address = address;
		this.user = user;
		this.manager = manager;
		this.subordinates = subordinates;
		this.employeeSkills = employeeSkills;
		this.certifications = certifications;
		this.allocations = allocations;
		this.resourceRequests = resourceRequests;
	}

	public Employee() {
		
	}
	
    
}
