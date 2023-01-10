package com.first_project.justdoeat.vo;

import java.time.LocalDate;
import java.util.Date;

import com.first_project.justdoeat.entity.UserInfoEntity;

import lombok.Data;

@Data
public class UserInfoVO {
  private Long seq;
  private String id;
  private String pwd;
  private String name;
  private String email;
  private String phone;
  private LocalDate birth;
  private Integer gen; 
  private Integer grade; 
  private Integer status; 

  public UserInfoVO(UserInfoEntity entity){
    this.seq = entity.getUiSeq();
    this.id = entity.getUiId();
    this.pwd = entity.getUiPwd();
    this.name = entity.getUiName();
    this.email = entity.getUiEmail();
    this.phone = entity.getUiPhone();
    this.birth = entity.getUiBrith();
    this.gen = entity.getUiGen();
    this.grade = entity.getUiGrade();
    this.status = entity.getUiStatus();
    
  }

}
