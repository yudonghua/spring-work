package com.demo.service.user.impl;
import com.demo.dao.StudentCourseDao;
import com.demo.model.StudentCourse;
import com.demo.service.user.StudentCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "studentcourseService")
public class StudentCourseServiceImpl implements StudentCourseService {
    @Resource
    StudentCourseDao studentcourseDao;
    @Override
    public List<StudentCourse> findAll() {
        return studentcourseDao.findAll();
    }
}