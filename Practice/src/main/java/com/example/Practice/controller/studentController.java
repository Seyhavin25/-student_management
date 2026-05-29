package com.example.Practice.controller;

import com.example.Practice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {


    @GetMapping("/api/courses")
    public ResponseEntity<?> getCourses(){
        return new ResponseEntity<>("Courses", HttpStatus.OK);
    }

}
