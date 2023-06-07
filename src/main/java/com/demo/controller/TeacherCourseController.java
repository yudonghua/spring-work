package com.demo.controller;


import com.demo.dao.TeacherCourseDao;
import com.demo.model.TeacherCourse;
import com.demo.service.user.TeacherCourseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/teachercourse")
public class TeacherCourseController {

    @Resource
    private TeacherCourseService teachercourseService;

    @Resource
    private TeacherCourseDao teachercourseDao;

    @GetMapping("/add")
    public String showAddCourseForm(Model model) {
        model.addAttribute("teachercourse", new TeacherCourse());
        return "add-teachercourse";
    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute("student") Student student) {
//        studentService.addStudent(student);
//        return "redirect:/student/all";
//    }

    @GetMapping("/all")
    public Object showAllTeacherCourse(Model model) {
        return teachercourseService.findAll();
    }


    @GetMapping("/all/dao")
    public Object showTeacherCourseFromDao(Model model) {
        return teachercourseDao.findAll();
    }

    // Add other methods for updating, deleting, and retrieving students
}
