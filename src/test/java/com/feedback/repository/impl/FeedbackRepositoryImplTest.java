package com.feedback.repository.impl;

import com.feedback.entity.FeedbackEntity;
import com.feedback.repository.FeedbackRepository;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@DatabaseSetup(value = "/dataset/feedback/feedback.xml")
public class FeedbackRepositoryImplTest extends DbUnitRepositoryTest {

    public static final String FEEDBACK_TEXT = "feedbackText";

    @Autowired
    FeedbackRepository sut;

    @Test
    @ExpectedDatabase(value = "/dataset/feedback/feedback.xml")
    public void shouldCreateAnitDataset() throws Exception {
        FeedbackEntity feedback = sut.getFeedback(1L);

        assertThat(feedback.getFeedback(), equalTo("Tra ta ta"));
    }

    @Test
    public void shouldCreateEntityAndGetIt() throws Exception {
        FeedbackEntity feedbackEntity = new FeedbackEntity();
        feedbackEntity.setFeedback(FEEDBACK_TEXT);

        Long id = sut.createFeedback(feedbackEntity);

        FeedbackEntity feedback = sut.getFeedback(id);

        assertThat(feedback.getFeedback(), equalTo(FEEDBACK_TEXT));
    }

    @Test
    @ExpectedDatabase(value = "/dataset/feedback/feedback.xml")
    public void shouldUseDBUnitDataset() throws Exception {
        FeedbackEntity feedback = sut.getFeedback(1L);

        assertThat(feedback.getFeedback(), equalTo("Tra ta ta"));
    }
}