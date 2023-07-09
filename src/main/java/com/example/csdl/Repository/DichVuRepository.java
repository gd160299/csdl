package com.example.csdl.Repository;

import com.example.csdl.Dto.DichVuDto;
import com.example.csdl.Dto.NhanVienCongTyDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface DichVuRepository extends JpaRepository<DichVuDto, Long> {
    DichVuDto save(DichVuDto obj);
    void deleteById(Long id);

    Optional<DichVuDto> findByDichVu(String dichVu);
}
