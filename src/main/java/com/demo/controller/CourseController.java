package com.demo.controller;


import com.demo.dao.CourseDao;
import com.demo.model.Course;
import com.demo.service.user.CourseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    @Resource
    private CourseDao courseDao;

    @GetMapping("/add")
    public String showAddCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "add-course";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllCourse(Model model) {
        return courseService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showCourseFromDao(Model model) {
        return courseDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
