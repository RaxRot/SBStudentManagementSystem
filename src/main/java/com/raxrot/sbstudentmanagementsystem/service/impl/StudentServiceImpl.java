package com.raxrot.sbstudentmanagementsystem.service.impl;

import com.raxrot.sbstudentmanagementsystem.dto.StudentDto;
import com.raxrot.sbstudentmanagementsystem.entity.Student;
import com.raxrot.sbstudentmanagementsystem.mapper.StudentMapper;
import com.raxrot.sbstudentmanagementsystem.repository.StudentRepository;
import com.raxrot.sbstudentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = students.stream()
                .map(x-> StudentMapper.mapToStudentDto(x)).collect(Collectors.toList());
        return studentDtos;
    }
}