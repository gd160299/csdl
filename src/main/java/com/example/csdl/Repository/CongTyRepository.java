package com.example.csdl.Repository;

import com.example.csdl.Common.CallStoredProcedureCommon;
import com.example.csdl.Dto.CongTyDto;
import com.example.csdl.Dto.NhanVienToaNhaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class CongTyRepository {

    @Autowired
    private CallStoredProcedureCommon storedProcedureUtil;

    public void createCompany(CongTyDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_ma_cong_ty", dto.getMaCongTy());
        parameters.put("p_ten", dto.getTenCongTy());
        parameters.put("p_dia_chi", dto.getDiaChi());
        parameters.put("p_so_dien_thoai", dto.getSoDienThoai());
        parameters.put("p_tang", dto.getTang());
        parameters.put("p_dien_tich", dto.getDienTich());
        parameters.put("p_thang", dto.getThang());
        parameters.put("p_ma_dich_vu", dto.getMaDichVu());
        parameters.put("p_ngay_dang_ky", dto.getNgayDangKy());

        storedProcedureUtil.callStoredProcedure("PKG_QL_CONG_TY.INSERT_CONG_TY", parameters);
    }

    public void updateCompany(CongTyDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_ma_cong_ty", dto.getMaCongTy());
        parameters.put("p_ten", dto.getTenCongTy());
        parameters.put("p_dia_chi", dto.getDiaChi());
        parameters.put("p_so_dien_thoai", dto.getSoDienThoai());
        parameters.put("p_tang", dto.getTang());
        parameters.put("p_dien_tich", dto.getDienTich());
        parameters.put("p_thang", dto.getThang());
        parameters.put("p_ma_dich_vu", dto.getMaDichVu());
        parameters.put("p_ngay_dang_ky", dto.getNgayDangKy());

        storedProcedureUtil.callStoredProcedure("PKG_QL_CONG_TY.UPDATE_CONG_TY", parameters);
    }

    public void deleteCompany(String maCongTy) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_ma_cong_ty", maCongTy);
        storedProcedureUtil.callStoredProcedure("PKG_QL_CONG_TY.DELETE_CONG_TY", parameters);
    }

    public List<CongTyDto> search(String maCongTy) throws SQLException {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_ma_cong_ty", maCongTy);
        return storedProcedureUtil.callStoredProcedureWithRefCursor("PKG_QL_CONG_TY.SEARCH_CONG_TY", parameters, CongTyDto.class);
    }
}
