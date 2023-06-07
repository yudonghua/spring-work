package com.demo.dao;


import com.demo.model.TeacherCourse;

import java.util.List;

public interface TeacherCourseDao {
    void insertTeacherCourse(TeacherCourse teachercourse);
    void updateTeacherCourse(TeacherCourse teachercourse);
    void deleteTeacherCourse(int teachercourseId);
    TeacherCourse getTeacherCourseById(int teachercourseId);
    List<TeacherCourse> getAllTeacherCourse();
    List<TeacherCourse> findAll();
}
