package com.demo.dao;


import com.demo.model.StudentCourse;

import java.util.List;

public interface StudentCourseDao {

    void insertStudentCourse(StudentCourse studentcourse);
    void updateStudentCourse(StudentCourse studentcourse);
    void deleteStudentCourse(int studentcourseId);
    StudentCourse getStudentCourseById(int studentcourseId);
    List<StudentCourse> getAllStudentsCourse();
    List<StudentCourse> findAll();
}