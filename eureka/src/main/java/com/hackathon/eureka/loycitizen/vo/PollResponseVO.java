package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

public class PollResponseVO {
	@JsonProperty("user")
	User user;

	@JsonProperty("responseCode")
	String responseCode;

	@JsonProperty("responseMessage")
	String responseMessage;
}
