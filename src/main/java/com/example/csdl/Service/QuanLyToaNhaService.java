package com.example.csdl.Service;

import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Repository.QuanLyToaNhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuanLyToaNhaService {
//	private final QuanLyToaNhaRepositoryTest quanLyToaNhaRepository;
//
//	@Autowired
//	public QuanLyToaNhaService(QuanLyToaNhaRepositoryTest quanLyToaNhaRepository) {
//		this.quanLyToaNhaRepository = quanLyToaNhaRepository;
//	}

	private final QuanLyToaNhaRepository quanLyToaNhaRepository;

	@Autowired
	public QuanLyToaNhaService(QuanLyToaNhaRepository quanLyToaNhaRepository) {
		this.quanLyToaNhaRepository = quanLyToaNhaRepository;
	}

	public List<CongTyDto> getAllCompanies() {
		return quanLyToaNhaRepository.findAll();
	}

	public CongTyDto getCompanyById(String maCongTy) {
		return quanLyToaNhaRepository.findById(maCongTy);
	}

	public CongTyDto createCompany(CongTyDto obj) {
		return quanLyToaNhaRepository.save(obj);
	}

	public void deleteCompany(String maCongTy) {
		quanLyToaNhaRepository.deleteById(maCongTy);
	}
}
