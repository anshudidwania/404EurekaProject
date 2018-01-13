package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;

public class ValidateUserResponse {
	
	@JsonProperty("loyCitizenUser")
	LoyCitizenUser loyCitizenUser;
	
	@JsonProperty("responseCode")
	String responseCode;
	
	@JsonProperty("responseMessage")
	String responseMessage;

	public synchronized LoyCitizenUser getLoyCitizenUser() {
		return loyCitizenUser;
	}

	public synchronized void setLoyCitizenUser(LoyCitizenUser loyCitizenUser) {
		this.loyCitizenUser = loyCitizenUser;
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
