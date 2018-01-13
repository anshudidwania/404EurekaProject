package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;

public class CreateResponseVO {

	@JsonProperty("initiatives")
	Initiatives initiatives;

	@JsonProperty("responseCode")
	String responseCode;

	@JsonProperty("responseMessage")
	String responseMessage;

	public Initiatives getInitiatives() {
		return initiatives;
	}

	public void setInitiatives(Initiatives initiatives) {
		this.initiatives = initiatives;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
