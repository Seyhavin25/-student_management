package com.example.Practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CourseRequest {
    private String title;
    private String description;
    private String teacherName;
    private Long credit;
}
