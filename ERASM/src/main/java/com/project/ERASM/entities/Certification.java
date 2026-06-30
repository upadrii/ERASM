package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "certifications")

public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certification_id")
    private Long certificationId;

    @Column(nullable = false, unique = true)
    private String certificationName;

    private String issuingOrganization;

    private String category;

    @Column(length = 500)
    private String description;

    @OneToMany(mappedBy = "certification",
            cascade = CascadeType.ALL)
    private List<EmployeeCertification> employeeCertifications = new ArrayList<>();

	public Long getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(Long certificationId) {
		this.certificationId = certificationId;
	}

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getIssuingOrganization() {
		return issuingOrganization;
	}

	public void setIssuingOrganization(String issuingOrganization) {
		this.issuingOrganization = issuingOrganization;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EmployeeCertification> getEmployeeCertifications() {
		return employeeCertifications;
	}

	public void setEmployeeCertifications(List<EmployeeCertification> employeeCertifications) {
		this.employeeCertifications = employeeCertifications;
	}

	public Certification(Long certificationId, String certificationName, String issuingOrganization, String category,
			String description, List<EmployeeCertification> employeeCertifications) {
		this.certificationId = certificationId;
		this.certificationName = certificationName;
		this.issuingOrganization = issuingOrganization;
		this.category = category;
		this.description = description;
		this.employeeCertifications = employeeCertifications;
	}

	public Certification() {
	}
	
    
    
}
