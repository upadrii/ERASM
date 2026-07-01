package com.project.ERASM.dto.request;

import java.time.LocalDate;

public class EmployeeRequestDTO {

    private String employeeCode;
    private String firstName;
    private String lastName;
    private String designation;
    private String department;
    private LocalDate joiningDate;
    private String phone;
    private String address;

    private Long userId;
    private Long managerId;

    public EmployeeRequestDTO() {
    }

    public EmployeeRequestDTO(String employeeCode, String firstName, String lastName,
            String designation, String department, LocalDate joiningDate,
            String phone, String address, Long userId, Long managerId) {
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.department = department;
        this.joiningDate = joiningDate;
        this.phone = phone;
        this.address = address;
        this.userId = userId;
        this.managerId = managerId;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }
}