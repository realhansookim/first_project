package com.first_project.justdoeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.MenuImageInfoEntity;

@Repository
public interface MenuImageInfoRepository extends JpaRepository<MenuImageInfoEntity, Long> {
  public List<MenuImageInfoEntity> findByMimgUri(String mimgUri);
}
