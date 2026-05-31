package com.example.Practice.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseRequest {


    @NotBlank(message = "title is required")
    private String title;
    private String description;
    @NotBlank(message = "Teacher name is required")
    private String teacherName;
    @Min(value = 1, message = "Credit must be at least 1")
    private Long credit;
}
