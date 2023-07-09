package com.example.csdl.RestController;

import com.example.csdl.Dto.NhanVienRaVaoDto;
import com.example.csdl.Dto.NhanVienToaNhaDto;
import com.example.csdl.Service.NhanVienRaVaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ra_vao_info")
public class NhanVienRaVaoRestController {

    private final NhanVienRaVaoService nhanVienRaVaoService;

    @Autowired
    public NhanVienRaVaoRestController(NhanVienRaVaoService nhanVienRaVaoService) {
        this.nhanVienRaVaoService = nhanVienRaVaoService;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody NhanVienRaVaoDto dto) {
        nhanVienRaVaoService.create(dto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/checkInfo")
    public void checkInfo(@RequestBody  NhanVienRaVaoDto dto) throws SQLException {
        nhanVienRaVaoService.checkInfo(dto);
    }
}
