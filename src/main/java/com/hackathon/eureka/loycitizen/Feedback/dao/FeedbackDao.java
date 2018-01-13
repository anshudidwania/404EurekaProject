package com.hackathon.eureka.loycitizen.Feedback.dao;

import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;

public interface FeedbackDao {

	void save(Feedback user);

	void update(Feedback user);

	void delete(Feedback user);

	Feedback findByFeedbackCode(String feedbackCode);

}