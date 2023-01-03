package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.DeliveryFeeInfoEntity;

@Repository
public interface DeliveryFeeInfoRepository extends JpaRepository<DeliveryFeeInfoEntity, Long> {
    
}