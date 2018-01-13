package com.hackathon.eureka.loycitizen.loycitizenuser.dao;

import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;

public interface LoyCitizenUserDao {

	void save(LoyCitizenUser user);

	void update(LoyCitizenUser user);

	void delete(LoyCitizenUser user);

	LoyCitizenUser findByLoyCitizenUserCode(String userCode);

}