package com.hackathon.eureka.loycitizen.vo;

import org.codehaus.jackson.annotate.JsonProperty;

  
public class ValidateUserRequest {
	 
	@JsonProperty("uniqueResourceId")
	String uniqueResourceId;
	
	@JsonProperty("countryCode")
	String countryCode;
	
	public synchronized String getUniqueResourceId() {
		return uniqueResourceId;
	}
	public synchronized void setUniqueResourceId(String uniqueResourceId) {
		this.uniqueResourceId = uniqueResourceId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
}
