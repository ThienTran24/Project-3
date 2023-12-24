package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills", schema = "public")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String skillId;
	
	@Column(name = "skill_name")
	private String skillName;

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}
