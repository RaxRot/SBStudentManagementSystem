package com.raxrot.sbstudentmanagementsystem.mapper;

import com.raxrot.sbstudentmanagementsystem.dto.StudentDto;
import com.raxrot.sbstudentmanagementsystem.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setEmail(student.getEmail());
        return studentDto;
    };
    public static Student mapToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
        return student;
    };
}
