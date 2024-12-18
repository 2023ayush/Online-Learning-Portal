package com.Learning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Lessons")
@Setter
@Getter
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