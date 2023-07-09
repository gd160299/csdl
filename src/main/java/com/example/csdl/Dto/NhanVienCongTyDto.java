package com.example.csdl.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "NHAN_VIEN_CONG_TY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienCongTyDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "nhv_seq")
    @SequenceGenerator(name = "nhv_seq", sequenceName = "nhv_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Que_quan")
    private String queQuan;

    @Column(name = "So_Dien_Thoai")
    private String soDienThoai;

    @Column(name = "Ma_Cong_Ty")
    private String maCongTy;
}

