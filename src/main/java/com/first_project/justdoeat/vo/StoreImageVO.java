package com.first_project.justdoeat.vo;

import com.first_project.justdoeat.entity.StoreImageEntity;

import lombok.Data;

@Data
public class StoreImageVO {
  private Long no;
  private String url;
  private Integer order;
  private Integer storeInfo;

  public StoreImageVO(StoreImageEntity data){
    this.no = data.getSimgSeq();
    this.url = data.getSimgUrl();
    this.order = data.getSimgOrder();
   
  }
}
