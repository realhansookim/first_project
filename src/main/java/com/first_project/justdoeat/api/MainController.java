package com.first_project.justdoeat.api;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.first_project.justdoeat.repository.StoreInfoRepository;
import com.first_project.justdoeat.repository.UserInfoRepository;
import com.first_project.justdoeat.service.StoreService;

@RestController
public class MainController {
  @Autowired StoreService service;
  @Autowired UserInfoRepository userRepo;
  @Autowired StoreInfoRepository storeRepo;

  @PutMapping("/add/ad")
  public ResponseEntity<Object> AddAd(@RequestBody AdvertisementInfoEntity data) {
      Map<String, Object> map = service.addAdStore(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }
  @PutMapping("/add/delivery")
  public ResponseEntity<Object> AddDelivery(@RequestBody DeliveryFeeInfoEntity data) {
      Map<String, Object> map = service.addDelivery(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/discount")
  public ResponseEntity<Object> AddDiscount(@RequestBody DiscountInfoEntity data) {
      Map<String, Object> map = service.addDiscount(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/menuconnect")
  public ResponseEntity<Object> AddMenuConnect(@RequestBody MenuCateConnectEntity data) {
      Map<String, Object> map = service.addMenuConnect(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/menuCate")
  public ResponseEntity<Object> AddMenuCate(@RequestBody MenuCategoryEntity data) {
      Map<String, Object> map = service.addMenuCategory(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/menu")
  public ResponseEntity<Object> AddMenu(@RequestBody MenuInfoEntity data) {
      Map<String, Object> map = service.addMenu(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/menuOption")
  public ResponseEntity<Object> AddMenuOption(@RequestBody MenuOptionEntity data) {
      Map<String, Object> map = service.addMenuOption(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/reviewImg")
  public ResponseEntity<Object> AddReviewImg(@RequestBody ReviewImgEntity data) {
      Map<String, Object> map = service.addReviewImg(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/review")
  public ResponseEntity<Object> AddReview(@RequestBody ReviewInfoEntity data) {
      Map<String, Object> map = service.addReview(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/reviewScore")
  public ResponseEntity<Object> AddReivewScore(@RequestBody ReviewScorePointEntity data) {
      Map<String, Object> map = service.addReviewScore(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/storeCategoryConnect")
  public ResponseEntity<Object> AddStoreCategoryConnect(@RequestBody StoreCategoryConnectEntity data) {
      Map<String, Object> map = service.addStoreCategoryConnet(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/sotreCategory")
  public ResponseEntity<Object> AddStoreCategory(@RequestBody StoreCategoryInfoEntity data) {
      Map<String, Object> map = service.addStoreCategoInfo(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/storeDetail")
  public ResponseEntity<Object> AddStoreDetail(@RequestBody StoreDetailEntity data) {
      Map<String, Object> map = service.addStoreDetail(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/storeImg")
  public ResponseEntity<Object> AddStoreImg(@RequestBody StoreImageEntity data) {
      Map<String, Object> map = service.addStoreImg(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/store")
  public ResponseEntity<Object> AddStore(@RequestBody StoreInfoEntity data) {
      Map<String, Object> map = service.addStoreInfo(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }@PutMapping("/add/user")
  public ResponseEntity<Object> AddUser(@RequestBody UserInfoEntity data) {
      Map<String, Object> map = service.addUserInfo(data);
      return new ResponseEntity<>(map, (HttpStatus)map.get("code"));
  }
  @GetMapping("/list/user")
  public ResponseEntity<Object> listUser(Pageable pageable) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    resultMap.put("list", userRepo.findAll());
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
  }
  @GetMapping("/list/store")
  public ResponseEntity<Object> listStore(Pageable pageable) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    resultMap.put("list", storeRepo.findAll());
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
  }

}
