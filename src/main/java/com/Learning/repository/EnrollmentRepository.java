package com.Learning.repository;

import com.Learning.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    // Find all enrollments for a specific user
    List<Enrollment> findByUser_UserId(Long userId);

    // Find all enrollments for a specific course
    List<Enrollment> findByCourse_CourseId(Long courseId);
}