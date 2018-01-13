package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class PollRequestVO {
	@JsonProperty
	private Long memberId;
	@JsonProperty
	private Long initiativeId;
	@JsonProperty
	private String createdDate;
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getInitiativeId() {
		return initiativeId;
	}
	public void setInitiativeId(Long initiativeId) {
		this.initiativeId = initiativeId;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
