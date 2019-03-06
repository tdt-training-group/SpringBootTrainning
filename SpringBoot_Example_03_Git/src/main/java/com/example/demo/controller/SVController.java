package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SinhVien;
import com.example.demo.service.SVService;

@RestController
@RequestMapping("/sv")
public class SVController {

	@Autowired
	SVService svservice;

	@GetMapping("/listAllSV")
	public List<SinhVien> listAllSV() {
		return svservice.findAll();
	}

	@PostMapping("/addSV")
	public SinhVien addSV(@Valid @RequestBody SinhVien sv) {
		return svservice.save(sv);
	}

	@PutMapping("/editSV") // post&put:ok
	public SinhVien editSV(@Valid @RequestBody SinhVien sv) {
		return svservice.save(sv);
	}

	@DeleteMapping("/deleteSV/{sid}")
	public void deleteSV(@PathVariable("sid") int sid) {
		SinhVien sv = svservice.getOne(sid);
		svservice.delete(sv);
	}

}
