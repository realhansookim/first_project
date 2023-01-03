package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.ReviewInfoEntity;

@Repository
public interface ReviewInfoRepository extends JpaRepository <ReviewInfoEntity, Long> {
  
}
