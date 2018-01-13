package com.hackathon.eureka.loycitizen.initiatives.dao;

import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;


public interface InitiativesDao {

	void save(Initiatives initiatives);

	void update(Initiatives initiatives);

	void delete(Initiatives initiatives);

	Initiatives findByInitiativesCode(Long initiativesCode);

}