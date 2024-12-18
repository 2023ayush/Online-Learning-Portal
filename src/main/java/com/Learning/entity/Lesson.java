package com.Learning.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lessonId;

    private String title;
    private String contentURL;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    // Getters and Setters
}