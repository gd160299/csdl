package com.example.csdl.Dto;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "VAN_PHONG")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VanPhongDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "van_phong_seq")
    @SequenceGenerator(name = "van_phong_seq", sequenceName = "van_phong_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TANG")
    private Integer tang;

    @Column(name = "DIEN_TICH")
    private Integer dienTich;

    @Column(name = "MA_CONG_TY")
    private String maCongTy;
}

