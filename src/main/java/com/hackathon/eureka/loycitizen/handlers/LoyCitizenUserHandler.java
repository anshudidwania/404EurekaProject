package com.hackathon.eureka.loycitizen.handlers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.loycitizenuser.bo.LoyCitizenUserBo;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;
import com.hackathon.eureka.loycitizen.util.EurekaExceptionEnum;
import com.hackathon.eureka.loycitizen.vo.LoyCitizenServiceResponse;
import com.hackathon.eureka.loycitizen.vo.LoyCitizenUserVO;

public class LoyCitizenUserHandler {

	public LoyCitizenServiceResponse create(LoyCitizenUserVO loyCitizenUserVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		LoyCitizenServiceResponse loyCitizenServiceResponse = new LoyCitizenServiceResponse();

		LoyCitizenUserBo userBo = (LoyCitizenUserBo) appContext.getBean("loyCitizenUserBo");
		LoyCitizenUser loyCitizenUser = userBo.findByLoyCitizenUserCode(loyCitizenUserVO.getId());

		if(null != loyCitizenUser && StringUtils.isNotBlank(loyCitizenUser.getId())) {
			loyCitizenServiceResponse.setLoyCitizenUser(null);
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESOURCE_FOUND.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESOURCE_FOUND.getErrorMessage());
		} else {
			userBo.save(new LoyCitizenUser(loyCitizenUserVO));
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());
		}
		
		return loyCitizenServiceResponse;
	}
	
	public LoyCitizenServiceResponse get(LoyCitizenUserVO loyCitizenUserVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		LoyCitizenServiceResponse loyCitizenServiceResponse = new LoyCitizenServiceResponse();

		LoyCitizenUserBo userBo = (LoyCitizenUserBo) appContext.getBean("loyCitizenUserBo");
		LoyCitizenUser loyCitizenUser = userBo.findByLoyCitizenUserCode(loyCitizenUserVO.getId());
		loyCitizenServiceResponse.setLoyCitizenUser(loyCitizenUser);

		if(null != loyCitizenUser && StringUtils.isNotBlank(loyCitizenUser.getId())) {
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());
		} else {
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESOURCE_NOT_FOUND.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESOURCE_NOT_FOUND.getErrorMessage());
		}
		
		return loyCitizenServiceResponse;
	}
	
//	public 
}
