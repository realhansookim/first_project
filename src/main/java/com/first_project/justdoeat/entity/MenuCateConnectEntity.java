package com.first_project.justdoeat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_cate_connect")
public class MenuCateConnectEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mcc_seq") private Long mccSeq;
    @Column(name = "mcc_mi_seq") private Long mccMiSeq;
    @Column(name = "mcc_mca_seq") private Long mccMcaSeq;
}