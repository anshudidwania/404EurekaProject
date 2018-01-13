package com.hackathon.eureka.loycitizen.Feedback.bo;

import com.hackathon.eureka.loycitizen.Feedback.model.Feedback;

public interface FeedbackBo {

	void save(Feedback feedback);

	void update(Feedback feedback);

	void delete(Feedback feedback);

	Feedback findByFeedbackCode(Long feedbackCode);
}