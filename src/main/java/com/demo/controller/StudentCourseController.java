package com.demo.controller;


import com.demo.dao.StudentCourseDao;
import com.demo.model.StudentCourse;
import com.demo.service.user.StudentCourseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {

    @Resource
    private StudentCourseService studentcourseService;

    @Resource
    private StudentCourseDao studentcourseDao;

    @GetMapping("/add")
    public String showAddStudentCourseForm(Model model) {
        model.addAttribute("studentcourse", new StudentCourse());
        return "add-studentcourse";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllStudentCourse(Model model) {
        return studentcourseService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showCourseFromDao(Model model) {
        return studentcourseDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
