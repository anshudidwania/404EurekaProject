package com.hackathon.eureka.loycitizen.Feedback.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//LoyCitizen LoyCitizenUser
@Entity
@Table(name = "EUREKA_FEEDBACK")
public class Feedback {
	
	@Id
	@Column(name = "feedback_id", unique = true, nullable = false)
	Long feedbackId;

	@Column(name = "member_id", nullable = false)
	Long memberId;
	
	@Column(name = "service_id")
	private Long serviceId;
	
	@Column(name = "location",length = 20)
	private String location;

	@Column(name = "rating")
	private Long rating;

	@Column(name = "description",length = 20)
	private String description;
	
	@Column(name = "geo_location",length = 20)
	private String geoLocation;

	@Column(name = "likes_count")
	private Long likesCount;

	@Column(name = "status",length = 20)
	private String status;
	
	@Column(name = "deadline")
	private Date deadline;
	
	@Column(name = "created_date")
	private Date createdDate;

	public synchronized Long getFeedbackId() {
		return feedbackId;
	}

	public synchronized void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public synchronized Long getMemberId() {
		return memberId;
	}

	public synchronized void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public synchronized Long getServiceId() {
		return serviceId;
	}

	public synchronized void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public synchronized String getLocation() {
		return location;
	}

	public synchronized void setLocation(String location) {
		this.location = location;
	}

	public synchronized Long getRating() {
		return rating;
	}

	public synchronized void setRating(Long rating) {
		this.rating = rating;
	}

	public synchronized String getDescription() {
		return description;
	}

	public synchronized void setDescription(String description) {
		this.description = description;
	}

	public synchronized String getGeoLocation() {
		return geoLocation;
	}

	public synchronized void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public synchronized Long getLikesCount() {
		return likesCount;
	}

	public synchronized void setLikesCount(Long likesCount) {
		this.likesCount = likesCount;
	}

	public synchronized String getStatus() {
		return status;
	}

	public synchronized void setStatus(String status) {
		this.status = status;
	}

	public synchronized Date getDeadline() {
		return deadline;
	}

	public synchronized void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public synchronized Date getCreatedDate() {
		return createdDate;
	}

	public synchronized void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
