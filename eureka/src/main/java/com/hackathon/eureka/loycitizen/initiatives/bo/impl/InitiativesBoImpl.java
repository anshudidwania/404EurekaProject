package com.hackathon.eureka.loycitizen.initiatives.bo.impl;

import com.hackathon.eureka.loycitizen.initiatives.bo.InitiativesBo;
import com.hackathon.eureka.loycitizen.initiatives.dao.InitiativesDao;
import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;




public class InitiativesBoImpl implements InitiativesBo{

	InitiativesDao initiativesDao;

	public void setInitiativesDao(InitiativesDao initiativesDao) {
		this.initiativesDao = initiativesDao;
	}

	public void save(Initiatives Initiatives){
		initiativesDao.save(Initiatives);
	}

	public void update(Initiatives Initiatives){
		initiativesDao.update(Initiatives);
	}

	public void delete(Initiatives Initiatives){
		initiativesDao.delete(Initiatives);
	}

	public Initiatives findByInitiativesCode(Long InitiativesCode){
		return initiativesDao.findByInitiativesCode(InitiativesCode);
	}
}
