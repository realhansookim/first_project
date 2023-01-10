package com.first_project.justdoeat.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
<<<<<<< HEAD
@Builder
=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
@Entity
@Table(name ="user_info")
public class UserInfoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="ui_seq") private Long uiSeq;
  @Column(name ="ui_id") private String uiId;
  @Column(name ="ui_pwd") private String uiPwd;
<<<<<<< HEAD
  @Column(name = "ui_name") private String uiName;
=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
  @Column(name ="ui_email") private String uiEmail;
  @Column(name ="ui_phone") private String uiPhone;
  @Column(name ="ui_birth") private LocalDate uiBrith;
  @Column(name ="ui_gen") private Integer uiGen;
  @Column(name ="ui_grade") private Integer uiGrade;
  @Column(name ="ui_status") private Integer uiStatus;
}
