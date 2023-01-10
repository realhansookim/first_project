package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.StoreInfoEntity;

@Repository
public interface StoreInfoRepository extends JpaRepository<StoreInfoEntity,Long>{
<<<<<<< HEAD
  
=======
  public StoreInfoEntity findBySiName(String SiName);
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
}
