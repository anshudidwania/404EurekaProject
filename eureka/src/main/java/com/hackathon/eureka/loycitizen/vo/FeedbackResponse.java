package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;

public class FeedbackResponse {
	@JsonProperty("feedback")
	Feedback feedback;
	
	@JsonProperty("responseCode")
	String responseCode;
	
	@JsonProperty("responseMessage")
	String responseMessage;


	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
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
