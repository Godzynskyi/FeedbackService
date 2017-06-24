package com.feedback.repository.config;


import config.TestDbConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestDbConfig.class}, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("DatabaseTest")
public abstract class RepositoryTest {
}