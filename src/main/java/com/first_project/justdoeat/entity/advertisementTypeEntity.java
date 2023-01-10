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
@Table(name = "advertisement_type")
public class advertisementTypeEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "at_seq") Long atSeq;
  @Column(name = "at_type") Long atType;
}
