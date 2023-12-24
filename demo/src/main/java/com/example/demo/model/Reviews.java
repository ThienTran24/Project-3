package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews", schema = "public")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long reviewsId;
	
	@Column(name = "course_id")
	private String courseId;
	
	@Column(name = "reviewer")
	private String reviewer;
	
	@Column(name = "rate")
	private int rate;
	
	@Column(name = "comment")
	private String comment;

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getReviewsId() {
		return reviewsId;
	}

	public void setReviewsId(Long reviewsId) {
		this.reviewsId = reviewsId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
