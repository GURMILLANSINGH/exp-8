package com.example.exp_8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.exp_8.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
