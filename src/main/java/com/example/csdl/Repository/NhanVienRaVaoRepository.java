package com.example.csdl.Repository;

import com.example.csdl.Common.CallStoredProcedureCommon;
import com.example.csdl.Dto.NhanVienRaVaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class NhanVienRaVaoRepository {
    @Autowired
    private CallStoredProcedureCommon storedProcedureUtil;

    public void create(NhanVienRaVaoDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_id_nhan_vien", dto.getIdNhanVien());
        parameters.put("p_Ngay", dto.getNgay());
        parameters.put("p_vi_tri", dto.getViTriRaVao());

        storedProcedureUtil.callStoredProcedure("PKG_QL_THE_RA_VAO.insert_the_ra_vao", parameters);
    }

    public void checkInfo(NhanVienRaVaoDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_id_nhan_vien", dto.getIdNhanVien());
        parameters.put("p_ngay", dto.getNgay());

        storedProcedureUtil.callStoredProcedureWithRefCursor("PKG_QL_THE_RA_VAO.check_info", parameters, NhanVienRaVaoDto.class);
    }
}
