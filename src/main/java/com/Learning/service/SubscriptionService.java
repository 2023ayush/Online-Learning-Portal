package com.Learning.service;
import com.Learning.entity.Subscription;
import com.Learning.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    // Save a subscription to the database
    public Subscription saveSubscription(Subscription subscription) {
        // Save the subscription and return the saved entity
        Subscription save = subscriptionRepository.save(subscription);
        return save;
    }
}
