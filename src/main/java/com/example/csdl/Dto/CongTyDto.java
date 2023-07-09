package com.example.csdl.Dto;

import com.example.csdl.Common.DbColumnMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CongTyDto {

    @DbColumnMapper("MA_CONG_TY")
    @NotNull
    @Size(max = 255)
    private String maCongTy;

    @DbColumnMapper("TEN")
    @Size(max = 255)
    private String tenCongTy;

    @DbColumnMapper("DIA_CHI")
    @Size(max = 255)
    private String diaChi;

    @DbColumnMapper("SO_DIEN_THOAI")
    @Size(max = 20)
    private String soDienThoai;

    @DbColumnMapper("NGAY_DANG_KY")
    private Date ngayDangKy;

    @DbColumnMapper("TANG")
    private Long tang;

    @DbColumnMapper("DIEN_TICH")
    private Long dienTich;

    @DbColumnMapper("MA_DICH_VU")
    private Long maDichVu;

    @DbColumnMapper("THANG")
    private String thang;

    @DbColumnMapper("TONG_TIEN")
    private BigDecimal tongTien;
}
