package com.feedback.controller;


import com.feedback.dto.TestDto;
import com.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
        System.out.println(testDto.getName());
        return null;
    }
}