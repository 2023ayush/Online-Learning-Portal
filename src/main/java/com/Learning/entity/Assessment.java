package com.Learning.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Assessments")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assessmentId;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    private String title;
    private String description;

    @OneToMany(mappedBy = "assessment", cascade = CascadeType.ALL)
    private List<AssessmentResult> assessmentResults;

    // Getters and Setters
}
