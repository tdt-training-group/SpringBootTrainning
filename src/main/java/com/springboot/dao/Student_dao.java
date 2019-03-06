package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Student;

@Repository
public interface Student_dao extends JpaRepository<Student, Integer> {


}
