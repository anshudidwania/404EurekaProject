package com.hackathon.eureka.loycitizen.loycitizenuser.bo;

import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;

public interface LoyCitizenUserBo {

	void save(LoyCitizenUser user);

	void update(LoyCitizenUser user);

	void delete(LoyCitizenUser user);

	LoyCitizenUser findByLoyCitizenUserCode(String userCode);
}