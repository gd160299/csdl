package com.example.csdl.Dto;

import com.example.csdl.Common.DbColumnMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienRaVaoDto {
    @DbColumnMapper("ID")
    private BigDecimal id;

    @DbColumnMapper("ID_NHAN_VIEN")
    private BigDecimal idNhanVien;

    @DbColumnMapper("NGAY")
    private Date ngay;

    @DbColumnMapper("STATUS")
    private Long status;

    @DbColumnMapper("VI_TRI_RA_VAO")
    private String viTriRaVao;

}
