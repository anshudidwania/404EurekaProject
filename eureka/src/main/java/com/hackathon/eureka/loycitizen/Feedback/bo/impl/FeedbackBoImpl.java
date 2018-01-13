package com.hackathon.eureka.loycitizen.Feedback.bo.impl;

import com.hackathon.eureka.loycitizen.Feedback.bo.FeedbackBo;
import com.hackathon.eureka.loycitizen.Feedback.dao.FeedbackDao;
import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;



public class FeedbackBoImpl implements FeedbackBo{

	FeedbackDao feedbackDao;

	public void setFeedbackDao(FeedbackDao FeedbackDao) {
		this.feedbackDao = FeedbackDao;
	}

	public void save(Feedback Feedback){
		feedbackDao.save(Feedback);
	}

	public void update(Feedback Feedback){
		feedbackDao.update(Feedback);
	}

	public void delete(Feedback Feedback){
		feedbackDao.delete(Feedback);
	}

	public Feedback findByFeedbackCode(Long FeedbackCode){
		return feedbackDao.findByFeedbackCode(FeedbackCode);
	}
}
