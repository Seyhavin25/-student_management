package com.example.Practice.service;

import com.example.Practice.dto.StudentResponse;
import com.example.Practice.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentResponse> findAll();

    List<StudentResponse> getStudents();

    StudentResponse getStudentById(Long id);
    StudentResponse getStudentByName(String name);

}
