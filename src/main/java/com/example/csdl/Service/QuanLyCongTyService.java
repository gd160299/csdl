package com.example.csdl.Service;

import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Dto.NhanVienToaNhaDto;
import com.example.csdl.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class QuanLyCongTyService {

    private final CongTyRepository congTyRepository;

    @Autowired
    public QuanLyCongTyService(CongTyRepository congTyRepository) {
        this.congTyRepository = congTyRepository;
    }

    @Transactional
    public void createCompany(CongTyDto dto) {
        congTyRepository.createCompany(dto);
    }

    @Transactional
    public void updateCompany(CongTyDto dto) {
        congTyRepository.updateCompany(dto);
    }

    public boolean deleteCompany(String maCongTy) {
        congTyRepository.deleteCompany(maCongTy);
        return true;
    }

    public List<CongTyDto> search(String maCongTy) throws SQLException {
        return congTyRepository.search(maCongTy);
    }
}
