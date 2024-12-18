package com.Learning.repository;

import com.Learning.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // Find subscription plan by plan name
    Subscription findByPlanName(String planName);
}