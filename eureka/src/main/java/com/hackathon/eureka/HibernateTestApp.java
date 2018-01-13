package com.hackathon.eureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.Feedback.bo.FeedbackBo;
import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;

public class HibernateTestApp {
	  public static void main( String[] args )
	    {
	    	ApplicationContext appContext =
	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

	   /* 	LoyCitizenUserBo userBo = (LoyCitizenUserBo)appContext.getBean("loyCitizenUserBo");

	    	*//** insert **//*
	    	LoyCitizenUser user = new LoyCitizenUser();
	    	user.setId("11");
	    	user.setMemberId(103l);
	    	user.setCountryCode(99l);
	    	userBo.save(user);

	    	*//** select **//*
	    	LoyCitizenUser user2 = userBo.findByLoyCitizenUserCode("11");
	    	System.out.println(user2);

	    	*//** update **//*
	    	user2.setFname("RR2");*/
	    	//userBo.update(user2);

	    	/** delete **/
	    	//userBo.delete(user2);

	    	
	    	FeedbackBo feedbackBo = (FeedbackBo)appContext.getBean("feedbackBo");

	    	/** insert **/
	    	Feedback feedback = new Feedback();
	    	feedback.setFeedbackId(10l);
	    	feedback.setServiceId(10l);
	    	feedback.setMemberId(11l);
	    	feedback.setRating(3l);
	    	feedbackBo.save(feedback);

	    	/** select **//*
	    	Feedback feedback2 = feedbackBo.findByFeedbackCode("11");
	    	System.out.println(feedback2);*/

	    	
	    	System.out.println("Done");
	    }
}
