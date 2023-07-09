package com.example.csdl.RestController;

import com.example.csdl.Dto.DichVuDto;
import com.example.csdl.Service.QuanLyDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/service")
public class QuanLyDichVuRestController {
    private final QuanLyDichVuService quanLyDichVuService;

    @Autowired
    public QuanLyDichVuRestController(QuanLyDichVuService quanLyDichVuService) {
        this.quanLyDichVuService = quanLyDichVuService;
    }

    @GetMapping("/getAllDichVu")
    public List<DichVuDto> getAllDichVu() {
        return quanLyDichVuService.findAllDichVu();
    }

    @PostMapping("/createDichVu")
    public ResponseEntity<?> createDichVu(@RequestBody DichVuDto obj) {
        try {
            DichVuDto createDichVu = quanLyDichVuService.createDichVu(obj);
            return ResponseEntity.ok(createDichVu);
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }

    @PutMapping("/updateDichVu")
    public ResponseEntity<Object> updateDichVu(@RequestBody DichVuDto companyDto) {
        try {
            DichVuDto updatedCompany = quanLyDichVuService.updateDichVu(companyDto);
            return ResponseEntity.ok(updatedCompany);
        } catch (EntityNotFoundException e) {
            String errorMessage = e.getMessage();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        }
    }

    @DeleteMapping("/deleteServiceById")
    public ResponseEntity<Void> deleteServiceById(@RequestParam Long id) {
        quanLyDichVuService.deleteDichVu(id);
        return ResponseEntity.noContent().build();
    }
}
