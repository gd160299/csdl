package com.example.csdl.Dto;

import com.example.csdl.Common.DbColumnMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienToaNhaDto {

    @DbColumnMapper("ID")
    private BigDecimal id;

    @DbColumnMapper("NAME")
    @Size(max = 255)
    private String name;

    @DbColumnMapper("QUE_QUAN")
    @Size(max = 255)
    private String queQuan;

    @DbColumnMapper("SO_DIEN_THOAI")
    @Size(max = 20)
    private String soDienThoai;

    @DbColumnMapper("ID_DICH_VU")
    private BigDecimal idDichVu;

    @DbColumnMapper("DICH_VU")
    private String tenDichVu;

    @DbColumnMapper("MA_SO_THUE")
    @NotNull
    private String maSoThue;

    @DbColumnMapper("LUONG")
    private BigDecimal luong;


}


