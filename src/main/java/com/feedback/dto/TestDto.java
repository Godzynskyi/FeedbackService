package com.feedback.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestDto {
    public TestDto(String name) {
        this.name = name;
    }

    private String name;
}
