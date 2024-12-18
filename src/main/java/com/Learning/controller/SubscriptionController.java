package com.Learning.controller;
import com.Learning.entity.Subscription;
import com.Learning.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    // POST request to save a subscription
    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
        // Call the service layer to save the subscription
        Subscription savedSubscription = subscriptionService.saveSubscription(subscription);
        // Return the saved subscription with status CREATED
        return new ResponseEntity<>(savedSubscription,HttpStatus.OK);
    }
}
