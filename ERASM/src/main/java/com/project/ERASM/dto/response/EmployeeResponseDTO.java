package com.project.ERASM.dto.response;

import java.time.LocalDate;

public class EmployeeResponseDTO {

    private Long employeeId;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private String designation;
    private String department;
    private LocalDate joiningDate;
    private String phone;
    private String address;

    private Long userId;
    private String username;

    private Long managerId;
    private String managerName;

    public EmployeeResponseDTO() {
    }

    public EmployeeResponseDTO(Long employeeId, String employeeCode,
            String firstName, String lastName, String designation,
            String department, LocalDate joiningDate, String phone,
            String address, Long userId, String username,
            Long managerId, String managerName) {

        this.employeeId = employeeId;
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.department = department;
        this.joiningDate = joiningDate;
        this.phone = phone;
        this.address = address;
        this.userId = userId;
        this.username = username;
        this.managerId = managerId;
        this.managerName = managerName;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}