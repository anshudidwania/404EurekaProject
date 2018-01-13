package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.FeedbackHandler;
import com.hackathon.eureka.loycitizen.vo.FeedbackResponse;
import com.hackathon.eureka.loycitizen.vo.FeedbackVO;

@Path("/feedback")
public class FeedbackRestService {

	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/get")
	public FeedbackResponse get(FeedbackVO feedbackVO){
		FeedbackHandler  handler = new FeedbackHandler();
		return handler.get(feedbackVO);
	}
	
	
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/add")
	public FeedbackResponse add(FeedbackVO feedbackVO){
		FeedbackHandler  handler = new FeedbackHandler();
		return handler.create(feedbackVO);
	}
}
