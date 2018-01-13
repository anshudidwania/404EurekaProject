package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class FeedbackVO {

	@JsonProperty
	Long feedbackId;
	@JsonProperty
	Long memberId;
	@JsonProperty
	private Long serviceId;

	@JsonProperty
	private String location;

	@JsonProperty
	private Long rating;

	@JsonProperty
	private String description;

	@JsonProperty
	private String geoLocation;

	@JsonProperty
	private Long likesCount;
	@JsonProperty
	private String status;
	@JsonProperty
	private String deadline;
	@JsonProperty
	private String createdDate;

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

	public synchronized String getDeadline() {
		return deadline;
	}

	public synchronized void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public synchronized String getCreatedDate() {
		return createdDate;
	}

	public synchronized void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
