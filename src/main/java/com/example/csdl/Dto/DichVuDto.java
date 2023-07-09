package com.example.csdl.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DICH_VU")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DichVuDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "dich_vu_seq")
    @SequenceGenerator(name = "dich_vu_seq", sequenceName = "dich_vu_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DICH_VU")
    private String dichVu;

    @Column(name = "PRICE")
    private BigDecimal price;
}
