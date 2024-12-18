package com.Learning.repository;

import com.Learning.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Find all courses by category ID
    List<Course> findByCategory_CategoryId(Long categoryId);

    // Find all courses taught by a specific instructor
    List<Course> findByInstructor_InstructorId(Long instructorId);
}