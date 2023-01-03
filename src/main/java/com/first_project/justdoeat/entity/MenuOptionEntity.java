package com.first_project.justdoeat.entity;

import org.hibernate.annotations.DynamicInsert;

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
@Table(name = "menu_option")
@Entity
@DynamicInsert
public class MenuOptionEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mo_seq") private Long moSeq;
  @Column(name = "mo_mi_seq") private Long moMiSeq;
  @Column(name = "mo_name") private String moName;
  @Column(name = "mo_price") private Integer moPrice;
}
