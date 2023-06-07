package com.demo.service.user.impl;
import com.demo.dao.TeacherCourseDao;
import com.demo.model.TeacherCourse;
import com.demo.service.user.TeacherCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "teacherCourseService")
public class TeacherCourseServiceImpl implements TeacherCourseService {
    @Resource
    TeacherCourseDao teachercourseDao;
    @Override
    public List<TeacherCourse> findAll() {
        return teachercourseDao.findAll();
    }
}
