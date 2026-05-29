package com.example.Practice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 180)
    private String title;

    @Column(name = "description", length = 180)
    private String description;

    @Column(name = "teacherName", nullable = false, length = 50)
    private String teacherName;

    @Column(name = "credit", nullable = false)
    @Min(value = 1)
    private Long credit;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}
