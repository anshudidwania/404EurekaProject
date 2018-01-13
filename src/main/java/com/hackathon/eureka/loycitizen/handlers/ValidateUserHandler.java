package com.hackathon.eureka.loycitizen.handlers;

import com.hackathon.eureka.loycitizen.business.AadharServiceClient;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;
import com.hackathon.eureka.loycitizen.vo.ValidateUserRequest;
import com.hackathon.eureka.loycitizen.vo.ValidateUserResponse;

public class ValidateUserHandler {

	public ValidateUserResponse processAndReturnResponse(ValidateUserRequest validateUserRequest) {
		LoyCitizenUser loyCitizenUser = AadharServiceClient.validateUserAndGetUserDetails(validateUserRequest.getUniqueResourceId(), validateUserRequest.getCountryCode());
		ValidateUserResponse validateUserResponse = new ValidateUserResponse();

		if(null != loyCitizenUser) {
			validateUserResponse.setLoyCitizenUser(loyCitizenUser);
			validateUserResponse.setResponseCode("200");
			validateUserResponse.setResponseMessage("SUCCESS");
		} else {
			validateUserResponse.setResponseCode("200");
			validateUserResponse.setResponseMessage("Not Found");
		}
		
		return validateUserResponse;
	}
}
