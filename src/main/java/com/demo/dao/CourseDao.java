package com.demo.dao;


import com.demo.model.Course;

import java.util.List;

public interface CourseDao {
    void insertCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    Course getCourseById(int courseId);
    List<Course> getAllCourse();
    List<Course> findAll();
}
