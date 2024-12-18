package com.Learning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Users")
@Setter
@Getter
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Subscription getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(Subscription subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Review> reviews;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Enrollment> enrollments;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<AssessmentResult> assessmentResults;

    // Getters and Setters
}