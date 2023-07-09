package com.example.csdl.Repository;

import com.example.csdl.Dto.NhanVienCongTyDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface NhanVienCongTyRepository extends JpaRepository<NhanVienCongTyDto, Long> {
    Optional<NhanVienCongTyDto> findById(Long id);

    Optional<NhanVienCongTyDto> findByNameAndMaCongTy(String name, String maCongTy);

    NhanVienCongTyDto save(NhanVienCongTyDto obj);

    void deleteById(Long id);


}

