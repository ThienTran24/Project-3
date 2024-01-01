package com.example.demo.model;

import org.springframework.data.rest.core.annotation.RestResource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses", schema = "public")
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	
	@Column(name = "cluster")
	private String clusterId;
	
	@Column(name = "name")
	private String courseName;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "descriptions")
	private String description;
	
	@Column(name = "numenrolled")
	private String numEnrolled;
	
	@Column(name = "numreviews")
	private String numReviews;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "reviewsurl")
	private String reviewUrl;
	
	@Column(name = "instructorname")
	private String instructorId;
	
	@Column(name = "providername")
	private String providerName;
	
	@Column(name = "stars")
	private String averageRatings;
	
	@Column(name = "mastercategories")
	private String masterCategories;
	
	@Column(name = "source")
	private String source;
	

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumEnrolled() {
		return numEnrolled;
	}

	public void setNumEnrolled(String numEnrolled) {
		this.numEnrolled = numEnrolled;
	}

	public String getNumReviews() {
		return numReviews;
	}

	public void setNumReviews(String numReviews) {
		this.numReviews = numReviews;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getReviewUrl() {
		return reviewUrl;
	}

	public void setReviewUrl(String reviewUrl) {
		this.reviewUrl = reviewUrl;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getAverageRatings() {
		return averageRatings;
	}

	public void setAverageRatings(String averageRatings) {
		this.averageRatings = averageRatings;
	}

	public String getMasterCategories() {
		return masterCategories;
	}

	public void setMasterCategories(String masterCategories) {
		this.masterCategories = masterCategories;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
