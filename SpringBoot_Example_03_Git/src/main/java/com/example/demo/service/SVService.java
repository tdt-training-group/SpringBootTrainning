package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SinhVien;
	
	@Repository
	public interface SVService extends JpaRepository<SinhVien, Integer> {

	}

