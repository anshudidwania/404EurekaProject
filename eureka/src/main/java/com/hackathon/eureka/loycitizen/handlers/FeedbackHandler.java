package com.hackathon.eureka.loycitizen.handlers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.Feedback.bo.FeedbackBo;
import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;
import com.hackathon.eureka.loycitizen.util.EurekaExceptionEnum;
import com.hackathon.eureka.loycitizen.vo.FeedbackResponse;
import com.hackathon.eureka.loycitizen.vo.FeedbackVO;

public class FeedbackHandler {

	public FeedbackResponse create(FeedbackVO FeedbackVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		FeedbackResponse FeedbackResponse = new FeedbackResponse();

		FeedbackBo userBo = (FeedbackBo) appContext.getBean("feedbackBo");
			userBo.save(new Feedback(FeedbackVO));
			FeedbackResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
			FeedbackResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());
		
		return FeedbackResponse;
	}
	
	public FeedbackResponse get(FeedbackVO feedbackVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		FeedbackResponse feedbackResponse = new FeedbackResponse();

		FeedbackBo feedbackBo = (FeedbackBo) appContext.getBean("feedbackBo");
		Feedback feedback = feedbackBo.findByFeedbackCode(feedbackVO.getFeedbackId());
		feedbackResponse.setFeedback(feedback);

		if(null != feedback &&null != feedback.getFeedbackId()) {
			feedbackResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
			feedbackResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());
		} else {
			feedbackResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESOURCE_NOT_FOUND.getErrorCode());
			feedbackResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESOURCE_NOT_FOUND.getErrorMessage());
		}
		
		return feedbackResponse;
	}
	
}
