package com.raxrot.sbstudentmanagementsystem.controller;

import com.raxrot.sbstudentmanagementsystem.dto.StudentDto;
import com.raxrot.sbstudentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    //handler method to handle new student request
    @GetMapping("/students/new")
    public String newStudent(Model model) {
        //student model to store student
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student", studentDto);
        return "create_student";
    }

    //handler method to save student from submitForm
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return "redirect:/students";
    }
}
