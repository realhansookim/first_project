package com.first_project.justdoeat.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.first_project.justdoeat.entity.MenuImageInfoEntity;
import com.first_project.justdoeat.repository.AdvertisementInfoRepository;
import com.first_project.justdoeat.repository.DeliveryFeeInfoRepository;
import com.first_project.justdoeat.repository.DiscountInfoRepository;
import com.first_project.justdoeat.repository.MenuCateConnectRepository;
import com.first_project.justdoeat.repository.MenuCategoryRepository;
import com.first_project.justdoeat.repository.MenuImageInfoRepository;
import com.first_project.justdoeat.repository.MenuInfoRepository;
import com.first_project.justdoeat.repository.MenuOptionRepository;
import com.first_project.justdoeat.repository.ReviewImgRepository;
import com.first_project.justdoeat.repository.ReviewInfoRepository;
import com.first_project.justdoeat.repository.ReviewScorePointRepository;
import com.first_project.justdoeat.repository.StoreCategoryConnectRepository;
import com.first_project.justdoeat.repository.StoreCategoryInfoRepository;
import com.first_project.justdoeat.repository.StoreDetailRepository;
import com.first_project.justdoeat.repository.StoreImageRepository;
import com.first_project.justdoeat.repository.StoreInfoRepository;
import com.first_project.justdoeat.repository.UserInfoRepository;

@Service
public class MenuService {
  @Autowired AdvertisementInfoRepository adRepo;
  @Autowired DeliveryFeeInfoRepository deliveryRepo;
  @Autowired DiscountInfoRepository discountRepo;
  @Autowired MenuCateConnectRepository mcConnectRepo;
  @Autowired MenuCategoryRepository categoryRepo;
  @Autowired MenuInfoRepository menuRepo;
  @Autowired MenuOptionRepository mOptionRepo;
  @Autowired ReviewImgRepository rImgRepo;
  @Autowired ReviewInfoRepository rInfoRepo;
  @Autowired ReviewScorePointRepository rScoreInfoRepo;
  @Autowired StoreCategoryConnectRepository storeCateRepo;
  @Autowired StoreCategoryInfoRepository storeCateInfoRepo;
  @Autowired StoreDetailRepository sDetailRepo;
  @Autowired StoreImageRepository sImgRepo;
  @Autowired StoreInfoRepository sInfoRepo;
  @Autowired UserInfoRepository userRepo;
  @Autowired MenuImageInfoRepository imageRepo;

  public Map<String, Object> addmenuimageInfo(MenuImageInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    imageRepo.save(data);
    return map;
  }

  public String getIiFileNameByUri (String mimgUri) {
    List<MenuImageInfoEntity> data = imageRepo.findByMimgUri(mimgUri);
    return data.get(0).getMimgFilename();
  }
}