package com.hackathon.eureka.loycitizen.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.loycitizen.loycitizenuser.bo.LoyCitizenUserBo;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;

public class AadharServiceClient {

	public static LoyCitizenUser validateUserAndGetUserDetails(String uniqueID, String countryCode) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		LoyCitizenUserBo userBo = (LoyCitizenUserBo) appContext.getBean("loyCitizenUserBo");
		LoyCitizenUser loyCitizenUser = userBo.findByLoyCitizenUserCode(uniqueID);
		return loyCitizenUser;
		/*
		 * if("123".equalsIgnoreCase(uniqueID) &&
		 * "IN".equalsIgnoreCase(countryCode)){
		 * loyCitizenUser.setFname("dummyFirstName");
		 * loyCitizenUser.setLname("dummyLastName");
		 * loyCitizenUser.setAddress("dummyAddress"); return loyCitizenUser; }
		 * else { return null; }
		 */
	}
}
