package com.hackathon.eureka.loycitizen.handlers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.initiatives.bo.InitiativesBo;
import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;
import com.hackathon.eureka.loycitizen.util.EurekaExceptionEnum;
import com.hackathon.eureka.loycitizen.vo.CreateRequestVO;
import com.hackathon.eureka.loycitizen.vo.CreateResponseVO;
import com.hackathon.eureka.loycitizen.vo.PollRequestVO;
import com.hackathon.eureka.loycitizen.vo.PollResponseVO;

public class InitiativesHandler {

	public CreateResponseVO createEvent(CreateRequestVO createRequestVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		CreateResponseVO createResponseVO = new CreateResponseVO();

		InitiativesBo userBo = (InitiativesBo) appContext.getBean("initiativesBo");

		userBo.save(new Initiatives(createRequestVO));
		createResponseVO.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
		createResponseVO.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());

		return createResponseVO;
	}

	public CreateResponseVO createPoll(CreateRequestVO createRequestVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		CreateResponseVO createResponseVO = new CreateResponseVO();

		InitiativesBo userBo = (InitiativesBo) appContext.getBean("initiativesBo");

		userBo.save(new Initiatives(createRequestVO));
		createResponseVO.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
		createResponseVO.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());

		return createResponseVO;
	}
	
	public PollResponseVO participate(CreateRequestVO createRequestVO) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		PollResponseVO pollResponseVO = new PollResponseVO();

		/*LoyCitizenUserBo userBo = (LoyCitizenUserBo) appContext.getBean("loyCitizenUserBo");
		LoyCitizenUser loyCitizenUser = userBo.findByLoyCitizenUserCode(loyCitizenUserVO.getId());

		if(null != loyCitizenUser && StringUtils.isNotBlank(loyCitizenUser.getId())) {
			loyCitizenServiceResponse.setLoyCitizenUser(null);
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESOURCE_FOUND.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESOURCE_FOUND.getErrorMessage());
		} else {
			userBo.save(new LoyCitizenUser(loyCitizenUserVO));
			loyCitizenServiceResponse.setResponseCode(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorCode());
			loyCitizenServiceResponse.setResponseMessage(EurekaExceptionEnum.EUREKA_RESPONSE_SUCCESS.getErrorMessage());
		}*/
		
		return pollResponseVO;
	}
}
