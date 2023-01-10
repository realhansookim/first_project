package com.first_project.justdoeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.StoreImageInfoEntity;
@Repository
public interface StoreImageInfoRepository extends JpaRepository<StoreImageInfoEntity,Long>{
  public List<StoreImageInfoRepository> findBySiiSeq(Long siiSeq);
  public List<StoreImageInfoEntity> findTopBySiiUriOrderBySiiSeqDesc(String uri);
}
