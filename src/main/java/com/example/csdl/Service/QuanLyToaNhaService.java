package com.example.csdl.Service;

import com.example.csdl.repository.QuanLyToaNhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuanLyToaNhaService {
	private final QuanLyToaNhaRepository quanLyToaNhaRepository;

	@Autowired
	public QuanLyToaNhaService(QuanLyToaNhaRepository quanLyToaNhaRepository) {
		this.quanLyToaNhaRepository = quanLyToaNhaRepository;
	}
}
