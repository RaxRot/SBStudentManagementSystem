package com.raxrot.sbstudentmanagementsystem.repository;

import com.raxrot.sbstudentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
