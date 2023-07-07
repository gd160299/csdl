package com.example.csdl.RestController;

import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Service.QuanLyToaNhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class QuanLyToaNhaRestController {
	private final QuanLyToaNhaService quanLyToaNhaService;

	@Autowired
	public QuanLyToaNhaRestController(QuanLyToaNhaService quanLyToaNhaService) {
		this.quanLyToaNhaService = quanLyToaNhaService;
	}

	@GetMapping
	public List<CongTyDto> getAllCompanies() {
		return quanLyToaNhaService.getAllCompanies();
	}

	@GetMapping("/{maCongTy}")
	public ResponseEntity<CongTyDto> getCompanyById(@PathVariable("maCongTy") String maCongTy) {
		CongTyDto congTyDto = quanLyToaNhaService.getCompanyById(maCongTy);
		if (congTyDto != null) {
			return ResponseEntity.ok(congTyDto);
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{maCongTy}")
	public ResponseEntity<Void> deleteCompany(@PathVariable("maCongTy") String maCongTy) {
		quanLyToaNhaService.deleteCompany(maCongTy);
		return ResponseEntity.noContent().build();
	}
}
