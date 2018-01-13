package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class ValidateUserResponse {

	@JsonProperty("user")
	User user;

	@JsonProperty("responseCode")
	String responseCode;

	@JsonProperty("responseMessage")
	String responseMessage;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public synchronized String getResponseCode() {
		return responseCode;
	}

	public synchronized void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public synchronized String getResponseMessage() {
		return responseMessage;
	}

	public synchronized void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
