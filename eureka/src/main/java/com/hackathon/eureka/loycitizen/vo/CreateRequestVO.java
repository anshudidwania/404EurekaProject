package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class CreateRequestVO {

	@JsonProperty
	private Long memberId;
	@JsonProperty
	private Long serviceId;
	@JsonProperty
	private String  initiativeType;

	@JsonProperty
	private String post;

	@JsonProperty
	private String location;

	@JsonProperty
	private String createdDate;

	@JsonProperty
	private String startDate;

	@JsonProperty
	private String endDate;

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getInitiativeType() {
		return initiativeType;
	}

	public void setInitiativeType(String initiativeType) {
		this.initiativeType = initiativeType;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
