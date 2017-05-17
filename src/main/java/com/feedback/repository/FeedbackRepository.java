package com.feedback.repository;

import com.feedback.entity.FeedbackEntity;

public interface FeedbackRepository {
    Long createFeedback(FeedbackEntity entity);
    FeedbackEntity getFeedback(Long id);
}