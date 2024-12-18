package com.Learning.repository;

import com.Learning.entity.AssessmentResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssessmentResultRepository extends JpaRepository<AssessmentResult, Long> {

    // Find results for a specific user
    List<AssessmentResult> findByUser_UserId(Long userId);

    // Find results for a specific assessment
    List<AssessmentResult> findByAssessment_AssessmentId(Long assessmentId);
}