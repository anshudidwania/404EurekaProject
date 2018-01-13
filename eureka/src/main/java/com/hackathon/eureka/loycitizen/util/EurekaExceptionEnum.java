package com.hackathon.eureka.loycitizen.util;

public enum EurekaExceptionEnum {

	EUREKA_COMM("EUREKA_1001", " Communication Failure"), 
	EUREKA_INPUT("EUREKA_1002", " Input Invalid"), 
	EUREKA_FAULT("EUREKA_1003", " Fault Response Received"), 
	EUREKA_HIBERNATE("EUREKA_1004", " Hibernate Failure"), 
	EUREKA_SERVICE("EUREKA_1005", " Service Failure"),
	EUREKA_RESOURCE_NOT_FOUND("EUREKA_1006", " Resource Not Found"),
	EUREKA_RESOURCE_FOUND("EUREKA_1007", "Resource already exists"),
	EUREKA_RESPONSE_SUCCESS("200", " Operation Successful");

	String errorCode;
	String errorMessage;

	EurekaExceptionEnum(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;

	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	/*
	 * Check if Error Code is Valid.
	 */
	public static EurekaExceptionEnum findErrorCodeEnum(String errorCode) {
		if (errorCode != null) {
			for (EurekaExceptionEnum enumConstant : values()) {
				if (errorCode.equals(enumConstant.getErrorCode())) {
					return enumConstant;
				}
			}
		}
		return null;
	}
}
