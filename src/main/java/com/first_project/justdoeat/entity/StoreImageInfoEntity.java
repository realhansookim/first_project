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
@Table(name = "store_image_info")
@Entity
public class StoreImageInfoEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "sii_seq") private Long siiSeq;
  @Column(name = "sii_simg_seq") private Long siiSimgSeq;
  @Column(name = "sii_file_name") private String siiFileName;
  @Column(name = "sii_uri") private String siiUri;
}
