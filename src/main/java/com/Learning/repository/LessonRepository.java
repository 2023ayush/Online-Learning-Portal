package com.Learning.repository;

import com.Learning.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {


    // Find all lessons for a specific course
    List<Lesson> findByCourse_CourseId(Long courseId);
}