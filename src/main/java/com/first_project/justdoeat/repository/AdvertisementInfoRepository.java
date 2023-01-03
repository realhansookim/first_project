package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.AdvertisementInfoEntity;

@Repository
public interface AdvertisementInfoRepository extends JpaRepository<AdvertisementInfoEntity, Long> {

}