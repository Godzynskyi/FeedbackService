package com.feedback.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class TestDto {
    public TestDto(String name) {
        this.name = name;
    }

    @Size(min = 2, max = 5)
    private String name;
}
