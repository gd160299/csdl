package com.example.csdl.Service;

import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Dto.NhanVienRaVaoDto;
import com.example.csdl.Repository.CongTyRepository;
import com.example.csdl.Repository.NhanVienRaVaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class NhanVienRaVaoService {
    private final NhanVienRaVaoRepository nhanVienRaVaoRepository;

    @Autowired
    public NhanVienRaVaoService(NhanVienRaVaoRepository nhanVienRaVaoRepository) {
        this.nhanVienRaVaoRepository = nhanVienRaVaoRepository;
    }

    @Transactional
    public void create(NhanVienRaVaoDto dto) {
        nhanVienRaVaoRepository.create(dto);
    }

    public void checkInfo(NhanVienRaVaoDto dto) {
        nhanVienRaVaoRepository.checkInfo(dto);
    }
}
