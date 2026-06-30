package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

import com.project.ERASM.enums.CertificationStatus;

@Entity
@Table(name = "employee_certifications")

public class EmployeeCertification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_certification_id")
    private Long employeeCertificationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "certification_id", nullable = false)
    private Certification certification;

    @Column(nullable = false)
    private String certificateNumber;

    private LocalDate issueDate;

    private LocalDate expiryDate;

    private String verificationUrl;

    private String documentPath;

    @Enumerated(EnumType.STRING)
    private CertificationStatus status;

	public Long getEmployeeCertificationId() {
		return employeeCertificationId;
	}

	public void setEmployeeCertificationId(Long employeeCertificationId) {
		this.employeeCertificationId = employeeCertificationId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Certification getCertification() {
		return certification;
	}

	public void setCertification(Certification certification) {
		this.certification = certification;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getVerificationUrl() {
		return verificationUrl;
	}

	public void setVerificationUrl(String verificationUrl) {
		this.verificationUrl = verificationUrl;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public CertificationStatus getStatus() {
		return status;
	}

	public void setStatus(CertificationStatus status) {
		this.status = status;
	}

	public EmployeeCertification(Long employeeCertificationId, Employee employee, Certification certification,
			String certificateNumber, LocalDate issueDate, LocalDate expiryDate, String verificationUrl,
			String documentPath, CertificationStatus status) {
		this.employeeCertificationId = employeeCertificationId;
		this.employee = employee;
		this.certification = certification;
		this.certificateNumber = certificateNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.verificationUrl = verificationUrl;
		this.documentPath = documentPath;
		this.status = status;
	}

	public EmployeeCertification() {
	}
	
	
    
}