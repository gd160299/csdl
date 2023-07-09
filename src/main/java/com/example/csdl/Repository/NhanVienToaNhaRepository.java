package com.example.csdl.Repository;

import com.example.csdl.Common.CallStoredProcedureCommon;
import com.example.csdl.Dto.NhanVienToaNhaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class NhanVienToaNhaRepository {
    @Autowired
    private CallStoredProcedureCommon storedProcedureUtil;

    public void createEmployee(NhanVienToaNhaDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_name", dto.getName());
        parameters.put("p_que_quan", dto.getQueQuan());
        parameters.put("p_so_dien_thoai", dto.getSoDienThoai());
        parameters.put("p_dich_vu", dto.getIdDichVu());
        parameters.put("p_ma_so_thue", dto.getMaSoThue());
        parameters.put("p_luong", dto.getLuong());

        storedProcedureUtil.callStoredProcedure("PKG_EMPLOYEE_BUILDING.INSERT_EMPLOYEE", parameters);
    }

    public void updateEmployee(NhanVienToaNhaDto dto) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_id", dto.getId());
        parameters.put("p_name", dto.getName());
        parameters.put("p_que_quan", dto.getQueQuan());
        parameters.put("p_so_dien_thoai", dto.getSoDienThoai());
        parameters.put("p_dich_vu", dto.getIdDichVu());
        parameters.put("p_ma_so_thue", dto.getMaSoThue());
        parameters.put("p_luong", dto.getLuong());

        storedProcedureUtil.callStoredProcedure("PKG_EMPLOYEE_BUILDING.UPDATE_EMPLOYEE", parameters);
    }

    public void deleteEmployee(Long id) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_id", id);
        storedProcedureUtil.callStoredProcedure("PKG_EMPLOYEE_BUILDING.DELETE_EMPLOYEE", parameters);
    }

    public List<NhanVienToaNhaDto> search(Long id) throws SQLException {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_id", id);
        return storedProcedureUtil.callStoredProcedureWithRefCursor("PKG_EMPLOYEE_BUILDING.SEARCH_EMPLOYEE", parameters, NhanVienToaNhaDto.class);
    }
}
