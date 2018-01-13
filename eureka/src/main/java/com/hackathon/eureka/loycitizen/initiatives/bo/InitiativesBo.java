package com.hackathon.eureka.loycitizen.initiatives.bo;

import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;


public interface InitiativesBo {

	void save(Initiatives initiatives);

	void update(Initiatives initiatives);

	void delete(Initiatives initiatives);

	Initiatives findByInitiativesCode(Long initiativesCode);
}