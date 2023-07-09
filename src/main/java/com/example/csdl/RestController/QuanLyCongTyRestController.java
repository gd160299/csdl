package com.example.csdl.RestController;

import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Dto.NhanVienToaNhaDto;
import com.example.csdl.Service.QuanLyCongTyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class QuanLyCongTyRestController {
	private final QuanLyCongTyService quanLyCongTyService;

	@Autowired
	public QuanLyCongTyRestController(QuanLyCongTyService quanLyCongTyService) {
		this.quanLyCongTyService = quanLyCongTyService;
	}


	@PostMapping("/createCompany")
	public ResponseEntity<Void> createCompany(@RequestBody CongTyDto dto) {
		quanLyCongTyService.createCompany(dto);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/updateCompany")
	public ResponseEntity<Void> updateEmployee(@RequestBody CongTyDto dto) {
		quanLyCongTyService.updateCompany(dto);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/deleteCompany")
	public boolean deleteCompany(@RequestParam String maCongTy) throws SQLException {
		return quanLyCongTyService.deleteCompany(maCongTy);
	}

	@GetMapping("/search")
	public List<CongTyDto> search(String maCongTy) throws SQLException {
		return quanLyCongTyService.search(maCongTy);
	}
}
