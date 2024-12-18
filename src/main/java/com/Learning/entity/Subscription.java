package com.Learning.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionPlanId;

    private String planName;
    private double price;
    private String duration;

    @OneToMany(mappedBy = "subscriptionPlan", cascade = CascadeType.ALL)
    private List<User> users;

    // Getters and Setters
}
