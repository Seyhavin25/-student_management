package com.example.Practice.mapper;

import com.example.Practice.dto.StudentResponse;
import com.example.Practice.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudentMapper {
    StudentResponse toStudentResponse(Student student);
}
