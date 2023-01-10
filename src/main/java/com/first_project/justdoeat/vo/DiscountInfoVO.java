package com.first_project.justdoeat.vo;

import lombok.Data;

@Data
public class DiscountInfoVO {
  private Long seq;
  private Long storeInfo;
  private Integer minPrice;
  private Integer maxprice;
}
