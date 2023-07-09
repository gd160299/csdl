package com.example.csdl.Service;

import com.example.csdl.Dto.NhanVienCongTyDto;
import com.example.csdl.Repository.NhanVienCongTyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
@Service
public class QuanLyNhanVienCongTyService {
    private final NhanVienCongTyRepository nhanVienCongTyRepository;


    public QuanLyNhanVienCongTyService(NhanVienCongTyRepository nhanVienCongTyRepository) {
        this.nhanVienCongTyRepository = nhanVienCongTyRepository;
    }

    public List<NhanVienCongTyDto> getAllEmp() {
        return nhanVienCongTyRepository.findAll();
    }

    public Optional<NhanVienCongTyDto> getEmpById(Long id) {
        return nhanVienCongTyRepository.findById(id);
    }

    public NhanVienCongTyDto createEmp(NhanVienCongTyDto obj) {
        Optional<NhanVienCongTyDto> detail = nhanVienCongTyRepository.findByNameAndMaCongTy(obj.getName(), obj.getMaCongTy());
        if(detail.isPresent()){
            String errorMessage = String.format("Nhân viên [%s] thuộc công ty [%s] đã tồn tại trong hệ thống!", obj.getName(), obj.getMaCongTy());
            throw new RuntimeException(errorMessage);
        }
        return nhanVienCongTyRepository.save(obj);
    }

    public NhanVienCongTyDto updatedEmp(NhanVienCongTyDto obj) {
        Optional<NhanVienCongTyDto> existingEmp = nhanVienCongTyRepository.findById(obj.getId());
        if (existingEmp.isPresent()) {
            NhanVienCongTyDto updatedEmp = nhanVienCongTyRepository.save(obj);
            return updatedEmp;
        } else {
            String errorMessage = String.format("Nhân viên ID [%s] không tồn tại!", obj.getId());
            throw new EntityNotFoundException(errorMessage);
        }
    }

    public void deleteCompany(Long id) {
        nhanVienCongTyRepository.deleteById(id);
    }
}
