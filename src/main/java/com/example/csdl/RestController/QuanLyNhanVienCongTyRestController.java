package com.example.csdl.RestController;

import com.example.csdl.Dto.NhanVienCongTyDto;
import com.example.csdl.Service.QuanLyCongTyService;
import com.example.csdl.Service.QuanLyNhanVienCongTyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empCompany")
public class QuanLyNhanVienCongTyRestController {
    private final QuanLyNhanVienCongTyService quanLyNhanVienCongTyService;

    @Autowired
    public QuanLyNhanVienCongTyRestController(QuanLyNhanVienCongTyService quanLyNhanVienCongTyService) {
        this.quanLyNhanVienCongTyService = quanLyNhanVienCongTyService;
    }

    @GetMapping("/getAllEmp")
    public List<NhanVienCongTyDto> getAllEmps() {
        return quanLyNhanVienCongTyService.getAllEmp();
    }

    @PostMapping("/createEmp")
    public ResponseEntity<?> createEmp(@RequestBody NhanVienCongTyDto obj) {
        try {
            NhanVienCongTyDto createEmp = quanLyNhanVienCongTyService.createEmp(obj);
            return ResponseEntity.ok(createEmp);
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    @PutMapping("/updateEmp")
    public ResponseEntity<Object> updateEmp(@RequestBody NhanVienCongTyDto companyDto) {
        try {
            NhanVienCongTyDto updatedCompany = quanLyNhanVienCongTyService.updatedEmp(companyDto);
            return ResponseEntity.ok(updatedCompany);
        } catch (EntityNotFoundException e) {
            String errorMessage = e.getMessage();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @GetMapping("/findEmpById")
    public ResponseEntity<NhanVienCongTyDto> getEmpById(@RequestParam Long id) {
        Optional<NhanVienCongTyDto> empDto = quanLyNhanVienCongTyService.getEmpById(id);
        if (empDto.isPresent()) {
            NhanVienCongTyDto obj = empDto.get();
            return ResponseEntity.ok(obj);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteEmpById")
    public ResponseEntity<Void> deleteEmpById(@RequestParam Long id) {
        quanLyNhanVienCongTyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}
