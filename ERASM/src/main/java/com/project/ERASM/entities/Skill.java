package com.project.ERASM.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills")

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillId;

    @Column(nullable = false, unique = true)
    private String skillName;

    private String category;

   

    @OneToMany(mappedBy = "skill",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<EmployeeSkill> employeeSkills = new ArrayList<>();

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	

	public List<EmployeeSkill> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<EmployeeSkill> employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public Skill(Long skillId, String skillName, String category,  
			List<EmployeeSkill> employeeSkills) {
		this.skillId = skillId;
		this.skillName = skillName;
		this.category = category;
		this.employeeSkills = employeeSkills;
	}

	public Skill() {
		
	}
	
    
}
