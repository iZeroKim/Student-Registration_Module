package com.example.student_reg.repository;

import com.example.student_reg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * No need to add @Repository annotation with classes that
 * implement JpaRepository - it is auto added.
 *  
 * JpaRepository takes two  parameters
 *  - Database table and Primary key data type
 * */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
