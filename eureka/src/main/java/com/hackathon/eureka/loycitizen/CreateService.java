package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.CreateHandler;
import com.hackathon.eureka.loycitizen.handlers.ValidateUserHandler;
import com.hackathon.eureka.loycitizen.vo.CreateRequestVO;
import com.hackathon.eureka.loycitizen.vo.CreateResponseVO;
import com.hackathon.eureka.loycitizen.vo.ValidateUserRequest;
import com.hackathon.eureka.loycitizen.vo.ValidateUserResponse;

@Path("/create")
public class CreateService {
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/createEvent")
	public CreateResponseVO createEvent(CreateRequestVO createRequestVO){
		CreateHandler  handler = new CreateHandler();
		return handler.createEvent(createRequestVO);
	}
	
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/createEvent")
	public CreateResponseVO createPoll(CreateRequestVO createRequestVO){
		CreateHandler  handler = new CreateHandler();
		return handler.createPoll(createRequestVO);
	}
}
