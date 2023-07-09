package com.example.csdl.RestController;

import com.example.csdl.Dto.NhanVienToaNhaDto;
import com.example.csdl.Service.QuanLyNhanVienToaNhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empBuilding")
public class QuanLyNhanVienToaNhaRestController {
    private final QuanLyNhanVienToaNhaService quanLyNhanVienToaNhaService;

    @Autowired
    public QuanLyNhanVienToaNhaRestController(QuanLyNhanVienToaNhaService quanLyNhanVienToaNhaService) {
        this.quanLyNhanVienToaNhaService = quanLyNhanVienToaNhaService;
    }


    @PostMapping("/createEmployee")
    public ResponseEntity<Void> createEmployee(@RequestBody NhanVienToaNhaDto dto) {
        quanLyNhanVienToaNhaService.createEmployee(dto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<Void> updateEmployee(@RequestBody NhanVienToaNhaDto dto) {
        quanLyNhanVienToaNhaService.updateEmployee(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/search")
    public List<NhanVienToaNhaDto> search(Long id) throws SQLException {
        return quanLyNhanVienToaNhaService.search(id);
    }

    @DeleteMapping("/deleteEmployee")
    public boolean deleteEmployee(@RequestParam Long id) throws SQLException {
        return quanLyNhanVienToaNhaService.deleteEmployee(id);
    }

}
