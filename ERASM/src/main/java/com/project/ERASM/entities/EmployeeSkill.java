package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

import com.project.ERASM.enums.SkillLevel;

@Entity
@Table(name = "employee_skills")

public class EmployeeSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_skill_id")
    private Long employeeSkillId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Enumerated(EnumType.STRING)
    private SkillLevel proficiency;

    private Integer experienceYears;

    private LocalDate lastUsedDate;

    private Boolean primarySkill;

	public Long getEmployeeSkillId() {
		return employeeSkillId;
	}

	public void setEmployeeSkillId(Long employeeSkillId) {
		this.employeeSkillId = employeeSkillId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public SkillLevel getProficiency() {
		return proficiency;
	}

	public void setProficiency(SkillLevel proficiency) {
		this.proficiency = proficiency;
	}

	public Integer getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(Integer experienceYears) {
		this.experienceYears = experienceYears;
	}

	public LocalDate getLastUsedDate() {
		return lastUsedDate;
	}

	public void setLastUsedDate(LocalDate lastUsedDate) {
		this.lastUsedDate = lastUsedDate;
	}

	public Boolean getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(Boolean primarySkill) {
		this.primarySkill = primarySkill;
	}

	public EmployeeSkill(Long employeeSkillId, Employee employee, Skill skill, SkillLevel proficiency,
			Integer experienceYears, LocalDate lastUsedDate, Boolean primarySkill) {
		this.employeeSkillId = employeeSkillId;
		this.employee = employee;
		this.skill = skill;
		this.proficiency = proficiency;
		this.experienceYears = experienceYears;
		this.lastUsedDate = lastUsedDate;
		this.primarySkill = primarySkill;
	}

	public EmployeeSkill() {
	}
	
    
}
