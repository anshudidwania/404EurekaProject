package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.ValidateUserHandler;
import com.hackathon.eureka.loycitizen.vo.ValidateUserRequest;
import com.hackathon.eureka.loycitizen.vo.ValidateUserResponse;

@Path("/aadhar")
public class UIDAIUserRestService {

	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/getUIDAIData")
	public ValidateUserResponse validateAndGetUserByUDID(ValidateUserRequest validateUserRequest){
		ValidateUserHandler  handler = new ValidateUserHandler();
		return handler.processAndReturnResponse(validateUserRequest);
	}
}
