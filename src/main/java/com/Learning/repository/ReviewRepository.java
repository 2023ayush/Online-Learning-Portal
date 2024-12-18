package com.Learning.repository;

import com.Learning.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // Find all reviews for a specific course
    List<Review> findByCourse_CourseId(Long courseId);

    // Find all reviews by a specific user
    List<Review> findByUser_UserId(Long userId);
}