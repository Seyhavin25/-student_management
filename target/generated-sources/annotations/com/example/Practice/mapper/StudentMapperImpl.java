package com.example.Practice.mapper;

import com.example.Practice.dto.StudentResponse;
import com.example.Practice.entity.Student;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-01T00:14:29+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentResponse toStudentResponse(Student student) {
        if ( student == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;
        LocalDateTime createdAt = null;

        StudentResponse studentResponse = new StudentResponse( id, name, email, phone, createdAt );

        return studentResponse;
    }
}
