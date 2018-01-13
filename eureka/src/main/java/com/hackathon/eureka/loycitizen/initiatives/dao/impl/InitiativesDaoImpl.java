package com.hackathon.eureka.loycitizen.initiatives.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hackathon.eureka.loycitizen.initiatives.dao.InitiativesDao;
import com.hackathon.eureka.loycitizen.initiatives.model.Initiatives;



public class InitiativesDaoImpl extends HibernateDaoSupport implements InitiativesDao{

	public void save(Initiatives initiatives){
		getHibernateTemplate().save(initiatives);
	}

	public void update(Initiatives initiatives){
		getHibernateTemplate().update(initiatives);
	}

	public void delete(Initiatives initiatives){
		getHibernateTemplate().delete(initiatives);
	}

	public Initiatives findByInitiativesCode(Long initiativesCode){
		List list = getHibernateTemplate().find(
                      "from Initiatives where id=?",initiativesCode
                );
		return (Initiatives)list.get(0);
	}

}