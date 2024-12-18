package com.Learning.service;

import com.Learning.entity.Subscription;
import com.Learning.entity.User;
import com.Learning.repository.SubscriptionRepository;
import com.Learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    // Get user by email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Get users by role
    public List<User> getUsersByRole(String role) {
        return userRepository.findByRole(role);
    }

    // Create or update user
    /**
     * Saves a User with a SubscriptionPlan.
     * If no subscription plan is provided, assigns a default subscription plan.
     */
    public User saveUser(User user) {
        // Set timestamps
        setTimestamps(user);

        // Assign default subscription plan if not provided
        if (user.getSubscriptionPlan() == null) {
            Subscription defaultPlan = subscriptionRepository.findByPlanName("Premium Plan")
                    .orElseThrow(() -> new RuntimeException("Default subscription plan not found"));
            user.setSubscriptionPlan(defaultPlan);
        }

        // Save the user and return the saved entity
        return userRepository.save(user);
    }

    /**
     * Sets createdAt and updatedAt timestamps.
     */
    private void setTimestamps(User user) {
        if (user.getCreatedAt() == null) {
            user.setCreatedAt(LocalDateTime.now());
        }
        user.setUpdatedAt(LocalDateTime.now());
    }
}

