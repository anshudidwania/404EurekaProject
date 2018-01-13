package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.PollHandler;
import com.hackathon.eureka.loycitizen.vo.PollRequestVO;
import com.hackathon.eureka.loycitizen.vo.PollResponseVO;

@Path("/poll")
public class PollService {
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/participate")
	public PollResponseVO participate(PollRequestVO pollRequestVO){
		PollHandler  handler = new PollHandler();
		return handler.participate(pollRequestVO);
	}
}
