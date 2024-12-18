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

    public Long getSubscriptionPlanId() {
        return subscriptionPlanId;
    }

    public void setSubscriptionPlanId(Long subscriptionPlanId) {
        this.subscriptionPlanId = subscriptionPlanId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
