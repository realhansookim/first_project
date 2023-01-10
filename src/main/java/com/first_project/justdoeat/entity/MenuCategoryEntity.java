package com.first_project.justdoeat.entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
=======
import lombok.Builder;
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_category")
@DynamicInsert
<<<<<<< HEAD
public class MenuCategoryEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mca_seq") private Long mcaSeq;;
=======
@Builder
public class MenuCategoryEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mca_seq") private Long mcaSeq;
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
  @Column(name = "mca_name")private  String mcaName;
}
