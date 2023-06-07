package com.demo.service.user.impl;
import com.demo.dao.CourseDao;
import com.demo.model.Course;
import com.demo.service.user.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    CourseDao courseDao;
    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }
}
