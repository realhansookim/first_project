package com.first_project.justdoeat.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
import com.first_project.justdoeat.utils.ASEAlgorithm;
import com.first_project.justdoeat.vo.LoginVo;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
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

  public UserInfoEntity getUserUiNameAndUiEmail(String uiName,String uiEmail){
    return userRepo.findByUiNameAndUiEmail(uiName, uiEmail);
  }
  public  UserInfoEntity getUserByUiId(String uiId){
    return userRepo.findByUiId(uiId);
  }

  public Map<String, Object> getUserList(HttpSession session) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    UserInfoEntity loginUser = (UserInfoEntity) session.getAttribute("loginUser");
    if (loginUser == null) {
      resultMap.put("status", false);
      resultMap.put("msg", "로그인이 필요합니다.");
      resultMap.put("code", HttpStatus.FORBIDDEN);
    } else {
      resultMap.put("status", true);
      resultMap.put("msg", "조회되었습니다.");
      resultMap.put("code", HttpStatus.OK);
      resultMap.put("list", userRepo.findAllByUiSeq(loginUser.getUiSeq()));
    }
    return resultMap;
  }



}