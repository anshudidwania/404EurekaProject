package com.hackathon.eureka.loycitizen.loycitizenuser.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hackathon.eureka.loycitizen.loycitizenuser.dao.LoyCitizenUserDao;
import com.hackathon.eureka.loycitizen.loycitizenuser.model.LoyCitizenUser;


public class LoyCitizenUserDaoImpl extends HibernateDaoSupport implements LoyCitizenUserDao{

	public void save(LoyCitizenUser user){
		getHibernateTemplate().save(user);
	}

	public void update(LoyCitizenUser user){
		getHibernateTemplate().update(user);
	}

	public void delete(LoyCitizenUser user){
		getHibernateTemplate().delete(user);
	}

	public LoyCitizenUser findByLoyCitizenUserCode(String userCode){
		List list = getHibernateTemplate().find(
                      "from LoyCitizenUser where id=?",userCode
                );
		return  list.size() > 0  ? (LoyCitizenUser)list.get(0) : null;
	}

}