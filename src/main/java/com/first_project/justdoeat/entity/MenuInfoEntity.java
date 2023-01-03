package com.first_project.justdoeat.entity;

import jakarta.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_info")
public class MenuInfoEntity {
  @Column(name = "mi_seq") private Long miSeq;
  @Column(name = "mi_name") private String miName;
  @Column(name = "mi_additional_ex") private String miAdditionalEx;
  @Column(name = "mi_price") private Integer miPrice;
  @Column(name = "mi_img") private String miImg;
  @Column(name = "mi_si_seq") private Long miSiSeq;
  
}
