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
@Table(name = "review_score_point")
@Entity
@DynamicInsert
public class ReviewScorePointEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rsp_seq") private Long rspSeq;
  @Column(name = "rsp_ri_seq") private Long rspRiSeq;
  @Column(name = "rsp_all_score") private Double rspAllScore;
  @Column(name = "rsp_taste_score") private Double rspTasteScore;
  @Column(name = "rsp_quantity_score") private Double rspQuantityScore;
  @Column(name = "rsp_delivery_score") private Double rspDeliveryScore;
}
