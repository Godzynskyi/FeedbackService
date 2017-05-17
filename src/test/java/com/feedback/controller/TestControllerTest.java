package com.feedback.controller;

import org.junit.Test;
import utils.Json;
import com.feedback.controller.config.RestTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TestControllerTest extends RestTest {

    @Test
    public void shouldReturnTestDto() throws Exception {
        doGet("/test")
                .andExpect(status().is(200))
                .andExpect(content().json(Json.OUTPUT_1.content));
    }

    @Test
    public void shouldReturnStatusOkWhenNameLessThen5() throws Exception {
        doPost("/test", Json.INPUT_1.content)
                .andExpect(status().isOk());

    }

    @Test
    public void shouldReturnBadRequestWhenValidationFailed() throws Exception {
        doPost("/test", Json.INPUT_2.content)
                .andExpect(status().isBadRequest());

    }
}