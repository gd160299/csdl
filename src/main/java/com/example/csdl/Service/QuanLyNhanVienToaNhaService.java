package com.example.csdl.Service;

import com.example.csdl.Dto.NhanVienToaNhaDto;
//import com.example.csdl.Repository.NhanVienToaNhaRepository;
import com.example.csdl.Repository.NhanVienToaNhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class QuanLyNhanVienToaNhaService {

    @Autowired
    private EntityManager entityManager;
    private final NhanVienToaNhaRepository nhanVienToaNhaRepository;

    public QuanLyNhanVienToaNhaService(NhanVienToaNhaRepository nhanVienToaNhaRepository) {
        this.nhanVienToaNhaRepository = nhanVienToaNhaRepository;
    }


    @Transactional
    public void createEmployee(NhanVienToaNhaDto dto) {
         nhanVienToaNhaRepository.createEmployee(dto);
    }

    @Transactional
    public void updateEmployee(NhanVienToaNhaDto dto) {
        nhanVienToaNhaRepository.updateEmployee(dto);
    }

    public boolean deleteEmployee(Long id) {
        nhanVienToaNhaRepository.deleteEmployee(id);
        return true;
    }

    public List<NhanVienToaNhaDto> search(Long id) throws SQLException {
        return nhanVienToaNhaRepository.search(id);
    }
}
