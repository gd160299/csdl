package com.example.csdl.Service;

import com.example.csdl.Dto.DichVuDto;
import com.example.csdl.Repository.DichVuRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class QuanLyDichVuService {
    private final DichVuRepository dichVuRepository;


    public QuanLyDichVuService(DichVuRepository dichVuRepository) {
        this.dichVuRepository = dichVuRepository;
    }

    public List<DichVuDto> findAllDichVu() {
        return dichVuRepository.findAll();
    }

    public DichVuDto createDichVu(DichVuDto obj) {
        Optional<DichVuDto> detail = this.dichVuRepository.findByDichVu(obj.getDichVu());
        if (detail.isPresent()) {
            String errorMessage = String.format("Dich vụ [%s] đã tồn tại!", obj.getDichVu());
            throw new RuntimeException(errorMessage);
        }
        return dichVuRepository.save(obj);
    }

    public DichVuDto updateDichVu(DichVuDto obj) {
        Optional<DichVuDto> existingDichVu = dichVuRepository.findById(obj.getId());
        if (existingDichVu.isPresent()) {
            DichVuDto updateDichVu = dichVuRepository.save(obj);
            return updateDichVu;
        } else {
            String errorMessage = String.format("Dịch vụ [%s] không tồn tại!", obj.getId());
            throw new EntityNotFoundException(errorMessage);
        }
    }

    public void deleteDichVu(Long id) {
        dichVuRepository.deleteById(id);
    }
}
