package com.Learning.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String password;
    private String role;

    @ManyToOne
    @JoinColumn(name = "subscriptionPlanId")
    private Subscription subscriptionPlan;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AssessmentResult> assessmentResults;

    // Getters and Setters
}