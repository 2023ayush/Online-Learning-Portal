package com.Learning.repository;

import com.Learning.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // Find subscription plan by plan name
    Optional<Subscription> findByPlanName(String planName);
}