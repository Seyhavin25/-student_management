package com.example.Practice.service;

import com.example.Practice.dto.StudentResponse;
import com.example.Practice.mapper.StudentMapper;
import com.example.Practice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;



    @Override
    public List<StudentResponse> findAll() {
        return studentRepository.findAll().stream().map(studentMapper::toStudentResponse).toList();
    }

    @Override
    public List<StudentResponse> getStudents() {
        return List.of();
    }

    public StudentResponse getStudentById(Long id) {
        return null;
    }

    public StudentResponse getStudentByName(String name) {
        return null;
    }


}
