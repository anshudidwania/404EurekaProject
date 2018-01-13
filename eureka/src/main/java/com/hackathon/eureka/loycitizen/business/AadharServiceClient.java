package com.hackathon.eureka.loycitizen.business;

import com.hackathon.eureka.loycitizen.vo.User;

public class AadharServiceClient {

	public static User validateUserAndGetUserDetails(String uniqueID, String countryCode) {

		User user = new UserRepository().getLoyCitizenUser(uniqueID);
		return user;
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
