package com.feedback.repository.config;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
public abstract class DbUnitRepositoryTest extends RepositoryTest {
}
