package com.Learning.repository;

import com.Learning.entity.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {

    // Find all assessments for a specific course
    List<Assessment> findByCourse_CourseId(Long courseId);
}