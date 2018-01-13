package com.hackathon.eureka.loycitizen.handlers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.vo.PollRequestVO;
import com.hackathon.eureka.loycitizen.vo.PollResponseVO;

public class PollHandler {
	public PollResponseVO participate(PollRequestVO pollRequestVO) {
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
