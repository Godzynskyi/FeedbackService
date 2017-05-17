package com.feedback.repository.impl;

import com.feedback.entity.FeedbackEntity;
import com.feedback.repository.FeedbackRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {
    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public Long createFeedback(FeedbackEntity entity) {
        em.persist(entity);

        return entity.getId();
    }

    @Override
    public FeedbackEntity getFeedback(Long id) {
        return em.find(FeedbackEntity.class, id);
    }
}