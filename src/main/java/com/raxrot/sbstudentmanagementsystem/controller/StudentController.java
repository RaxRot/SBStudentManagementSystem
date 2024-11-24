package com.raxrot.sbstudentmanagementsystem.controller;

import com.raxrot.sbstudentmanagementsystem.dto.StudentDto;
import com.raxrot.sbstudentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list student request
    @GetMapping("/students")
    public String listStudents(Model model) {
        List<StudentDto>students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students";
    }
}