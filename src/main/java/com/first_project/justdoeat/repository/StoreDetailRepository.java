package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.StoreDetailEntity;

@Repository
public interface StoreDetailRepository extends JpaRepository<StoreDetailEntity,Long>{
  
}
