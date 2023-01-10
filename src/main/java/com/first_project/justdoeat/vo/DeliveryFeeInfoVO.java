package com.first_project.justdoeat.vo;

import lombok.Data;

@Data
public class DeliveryFeeInfoVO {
  private Long seq;
  private Long storeInfo;
  private Integer minFee;
  private Integer maxFee;
  private Integer deliveryFee;
}
