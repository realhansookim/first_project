package com.first_project.justdoeat.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountInfoRepository extends JpaAttributeConverter<DiscountInfoRepository, Long> {
    
}