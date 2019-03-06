package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Human;
import com.example.model.HumanService;

@RestController
public class Controller {
	
	@Autowired
	HumanService humanService;
	
	@GetMapping("/getAll")
	public List<Human> getAll() {
		return humanService.findAll();
	}
	
	@PostMapping("/upload")
	public boolean upload(@RequestBody Human human) {
		try {
			humanService.save(human);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Integer id) {
		try {
			humanService.deleteById(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}