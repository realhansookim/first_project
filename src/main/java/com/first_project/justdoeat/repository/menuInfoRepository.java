package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first_project.justdoeat.entity.MenuInfoEntity;

public interface MenuInfoRepository extends JpaRepository <MenuInfoEntity, Long> {
  
}
