package com.first_project.justdoeat.service;

<<<<<<< HEAD
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.first_project.justdoeat.entity.StoreImageEntity;
import com.first_project.justdoeat.entity.StoreImageInfoEntity;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
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
<<<<<<< HEAD
import com.first_project.justdoeat.repository.StoreImageInfoRepository;
=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
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
<<<<<<< HEAD
  @Autowired StoreImageInfoRepository siiRepo; 

  public Map<String,Object> addSajangImage(StoreImageInfoEntity data, Long siImg){
    Map<String,Object> map = new LinkedHashMap<String,Object>();
    data.setSiiSeq(siImg);
    siiRepo.save(data);
    map.put("status", true);
    map.put("msg", "이미지가 저장되었습니다.");
    map.put("code", HttpStatus.OK);

    return map;
  }
  public String getFilenameByUri(String uri){
    List<StoreImageInfoEntity> data = siiRepo.findTopBySiiUriOrderBySiiSeqDesc(uri);
    return data.get(0).getSiiFileName();
  }
=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10

}