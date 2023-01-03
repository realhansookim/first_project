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
@Table(name = "store_category_connect")
@Entity
@DynamicInsert
public class StoreCategoryConnectEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sc_seq") private Long scSeq;
  @Column(name = "sc_si_seq") private Long scSiSeq;
  @Column(name = "sc_ci_seq") private Long scCiSeq;
  
}
