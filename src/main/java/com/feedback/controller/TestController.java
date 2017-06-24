package com.feedback.controller;


import com.feedback.dto.TestDto;
import com.feedback.repository.FeedbackRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    FeedbackRepository feedbackRepository;

    @RequestMapping(method = RequestMethod.GET)
    public TestDto testDto() {
        return new TestDto("testName");

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public TestDto testDto(@Valid @RequestBody TestDto testDto) {
        log.debug(testDto.getName());
        return null;
    }
}