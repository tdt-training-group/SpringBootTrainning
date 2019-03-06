package com.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.Student_dao;
import com.springboot.model.Student;

@RestController
public class studentContronller {
	@Autowired
	private Student_dao std;

	@GetMapping(value = "")
	public List<Student> getAllStudent() {
		return std.findAll();
	}

	@PostMapping(value = "")
	public Student addStudent(@RequestBody Student st) {
		return std.save(st);
	}

	@DeleteMapping(value = "/{studentID}")
	public void deleteStudent(@PathVariable(value = "studentID") Integer stID) {
		Student st = std.getOne(stID);
		std.delete(st);
	}
	@PutMapping(value = "/{studentID}")
	public Student updateStudent(@PathVariable(value="studentID") Integer stID,@Valid @RequestBody Student st) {
		Student stone = std.getOne(stID);
		stone.setStudenName(st.getStudenName());
		stone.setStudentID(st.getStudentID());
		stone.setStudentClass(st.getStudentClass());
		return std.save(stone);
	}

}
