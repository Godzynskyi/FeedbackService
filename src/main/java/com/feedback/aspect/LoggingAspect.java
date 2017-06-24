package com.feedback.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Before("methodsToBeLogged()")
    public void before(JoinPoint jp) {
        log.debug("Method started: {}", jp.toShortString());
    }
    @After("methodsToBeLogged()")
    public void after(JoinPoint jp) {
        log.debug("Method ended:   {}", jp.toShortString());
    }

    @Pointcut("execution(public * com.feedback..*.*(..))")
    private void methodsToBeLogged() {
        throw new UnsupportedOperationException();
    }
}
