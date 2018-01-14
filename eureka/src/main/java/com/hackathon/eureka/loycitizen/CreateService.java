package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.InitiativesHandler;
import com.hackathon.eureka.loycitizen.vo.CreateRequestVO;
import com.hackathon.eureka.loycitizen.vo.CreateResponseVO;

@Path("/create")
public class CreateService {
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/createEvent")
	public CreateResponseVO createEvent(CreateRequestVO createRequestVO){
		InitiativesHandler  handler = new InitiativesHandler();
		return handler.createEvent(createRequestVO);
	}
	
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/createPoll")
	public CreateResponseVO createPoll(CreateRequestVO createRequestVO){
		InitiativesHandler  handler = new InitiativesHandler();
		return handler.createPoll(createRequestVO);
	}
}
