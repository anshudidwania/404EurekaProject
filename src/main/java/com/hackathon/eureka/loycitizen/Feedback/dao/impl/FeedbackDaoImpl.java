package com.hackathon.eureka.loycitizen.Feedback.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hackathon.eureka.loycitizen.Feedback.dao.FeedbackDao;
import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;


public class FeedbackDaoImpl extends HibernateDaoSupport implements FeedbackDao{

	public void save(Feedback feedback){
		getHibernateTemplate().save(feedback);
	}

	public void update(Feedback feedback){
		getHibernateTemplate().update(feedback);
	}

	public void delete(Feedback feedback){
		getHibernateTemplate().delete(feedback);
	}

	public Feedback findByFeedbackCode(String feedbackCode){
		List list = getHibernateTemplate().find(
                      "from Feedback where id=?",feedbackCode
                );
		return (Feedback)list.get(0);
	}

}