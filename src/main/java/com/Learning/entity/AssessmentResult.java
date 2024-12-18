package com.Learning.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "AssessmentResults")
public class AssessmentResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    @ManyToOne
    @JoinColumn(name = "assessmentId")
    private Assessment assessment;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private double score;
    private LocalDateTime attemptDate;

    // Getters and Setters
}