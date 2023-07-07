package com.example.csdl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.csdl.Dto.CongTyDto;

public interface QuanLyToaNhaRepository extends JpaRepository<CongTyDto, String> {
	CongTyDto findById(String maCongTy);

	CongTyDto save(CongTyDto obj);

	void deleteById(String maCongTy);
}
