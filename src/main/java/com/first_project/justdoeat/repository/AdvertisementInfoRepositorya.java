package com.first_project.justdoeat.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.advertisementInfoEntity;

@Repository
public interface AdvertisementInfoRepository extends JpaAttributeConverter<advertisementInfoEntity, Long> {

}