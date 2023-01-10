package com.first_project.justdoeat.entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@Table(name = "menu_image_info")
public class MenuImageInfoEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mimg_seq") private Long mimgSeq;
  @Column(name = "mimg_filename") private String mimgFilename;
  @Column(name = "mimg_uri") private String mimgUri;
  // @Column(name = "mimg_mi_seq") private Long mimgMiSeq;
  // @OneToOne
  // @JoinColumn(name = "mimg_mi_seq") private MenuInfoEntity menuImg;
}
