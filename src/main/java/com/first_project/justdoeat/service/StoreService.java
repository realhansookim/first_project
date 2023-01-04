package com.first_project.justdoeat.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.first_project.justdoeat.entity.AdvertisementInfoEntity;
import com.first_project.justdoeat.entity.DeliveryFeeInfoEntity;
import com.first_project.justdoeat.entity.DiscountInfoEntity;
import com.first_project.justdoeat.entity.MenuCateConnectEntity;
import com.first_project.justdoeat.entity.MenuCategoryEntity;
import com.first_project.justdoeat.entity.MenuInfoEntity;
import com.first_project.justdoeat.entity.MenuOptionEntity;
import com.first_project.justdoeat.entity.ReviewImgEntity;
import com.first_project.justdoeat.entity.ReviewInfoEntity;
import com.first_project.justdoeat.entity.ReviewScorePointEntity;
import com.first_project.justdoeat.entity.StoreCategoryConnectEntity;
import com.first_project.justdoeat.entity.StoreCategoryInfoEntity;
import com.first_project.justdoeat.entity.StoreDetailEntity;
import com.first_project.justdoeat.entity.StoreImageEntity;
import com.first_project.justdoeat.entity.StoreInfoEntity;
import com.first_project.justdoeat.entity.UserInfoEntity;
import com.first_project.justdoeat.repository.AdvertisementInfoRepository;
import com.first_project.justdoeat.repository.DeliveryFeeInfoRepository;
import com.first_project.justdoeat.repository.DiscountInfoRepository;
import com.first_project.justdoeat.repository.MenuCateConnectRepository;
import com.first_project.justdoeat.repository.MenuCategoryRepository;
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
public class StoreService {
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
  
  public Map<String, Object> addAdStore(AdvertisementInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    adRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addDelivery(DeliveryFeeInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    deliveryRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addDiscount(DiscountInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    discountRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addMenuConnect(MenuCateConnectEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    mcConnectRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addMenuCategory(MenuCategoryEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    categoryRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addMenu(MenuInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    menuRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addMenuOption(MenuOptionEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    mOptionRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addReviewImg(ReviewImgEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    rImgRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addReview(ReviewInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    rInfoRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addReviewScore(ReviewScorePointEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    rScoreInfoRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addStoreCategoryConnet(StoreCategoryConnectEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    storeCateRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addStoreCategoInfo(StoreCategoryInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    storeCateInfoRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addStoreDetail(StoreDetailEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    sDetailRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addStoreImg(StoreImageEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    sImgRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addStoreInfo(StoreInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    sInfoRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
  public Map<String, Object> addUserInfo(UserInfoEntity data) {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    userRepo.save(data);
    map.put("status", true);
    map.put("code", HttpStatus.CREATED);
    return map;
  }
}
