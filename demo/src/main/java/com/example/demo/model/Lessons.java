package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lessons3", schema = "public")
public class Lessons {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lessonId;
	
	@Column(name = "modulenumber")
	private int moduleNumber;
	
	@Column(name = "modulename")
	private String lessonName;
	
	@Column(name = "moduleduration")
	private String duration;

	@Column(name = "link")
	private String link;
	
	public Lessons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLessonId() {
		return lessonId;
	}

	public void setLessonId(Long lessonId) {
		this.lessonId = lessonId;
	}

	public int getModuleNumber() {
		return moduleNumber;
	}

	public void setModuleNumber(int moduleNumber) {
		this.moduleNumber = moduleNumber;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}