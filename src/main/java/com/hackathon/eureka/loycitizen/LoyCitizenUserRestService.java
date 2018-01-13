package com.hackathon.eureka.loycitizen;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hackathon.eureka.loycitizen.handlers.LoyCitizenUserHandler;
import com.hackathon.eureka.loycitizen.vo.LoyCitizenServiceResponse;
import com.hackathon.eureka.loycitizen.vo.LoyCitizenUserVO;

@Path("/LoyCitizenUser")
public class LoyCitizenUserRestService {

	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/getUser")
	public LoyCitizenServiceResponse getUser(LoyCitizenUserVO loyCitizenUserVO){
		LoyCitizenUserHandler  handler = new LoyCitizenUserHandler();
		return handler.get(loyCitizenUserVO);
	}
	
	
	@POST
    @Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	@Path("/addUser")
	public LoyCitizenServiceResponse addUser(LoyCitizenUserVO loyCitizenUserVO){
		LoyCitizenUserHandler  handler = new LoyCitizenUserHandler();
		return handler.create(loyCitizenUserVO);
	}
	

}
