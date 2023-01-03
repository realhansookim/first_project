package com.first_project.justdoeat.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="user_info")
public class UserInfoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="ui_seq") private Long siSeq;
  @Column(name ="ui_id") private String siId;
  @Column(name ="ui_pwd") private String siPwd;
  @Column(name ="ui_email") private String siEmail;
  @Column(name ="ui_phone") private String siPhone;
  @Column(name ="ui_birth") private LocalDate siBrith;
  @Column(name ="ui_gen") private Integer siGen;
  @Column(name ="ui_grade") private Integer siGrade;
  @Column(name ="ui_status") private Integer siStatus;
}
