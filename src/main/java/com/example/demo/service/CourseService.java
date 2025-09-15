package com.example.demo.service;

import com.example.demo.model.Course;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void saveCourse(Course course);
    Course getCourseById(Long id);
    void deleteCourseById(Long id);
    Page<Course> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);
}
