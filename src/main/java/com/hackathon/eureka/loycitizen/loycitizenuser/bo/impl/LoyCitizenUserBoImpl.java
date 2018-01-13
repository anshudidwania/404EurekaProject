package com.hackathon.eureka.loycitizen.loycitizenuser.bo.impl;

import com.hackathon.eureka.loycitizen.loycitizenuser.bo.LoyCitizenUserBo;
import com.hackathon.eureka.loycitizen.loycitizenuser.dao.LoyCitizenUserDao;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;



public class LoyCitizenUserBoImpl implements LoyCitizenUserBo{

	LoyCitizenUserDao loyCitizenUserDao;

	public void setLoyCitizenUserDao(LoyCitizenUserDao LoyCitizenUserDao) {
		this.loyCitizenUserDao = LoyCitizenUserDao;
	}

	public void save(LoyCitizenUser LoyCitizenUser){
		loyCitizenUserDao.save(LoyCitizenUser);
	}

	public void update(LoyCitizenUser LoyCitizenUser){
		loyCitizenUserDao.update(LoyCitizenUser);
	}

	public void delete(LoyCitizenUser LoyCitizenUser){
		loyCitizenUserDao.delete(LoyCitizenUser);
	}

	public LoyCitizenUser findByLoyCitizenUserCode(String LoyCitizenUserCode){
		return loyCitizenUserDao.findByLoyCitizenUserCode(LoyCitizenUserCode);
	}
}
