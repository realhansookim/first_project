package com.first_project.justdoeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.first_project.justdoeat.entity.MenuInfoEntity;

public interface MenuInfoRepository extends JpaRepository <MenuInfoEntity, Long> {
  public MenuInfoEntity findByMiName(String miName);
  @Query(value = "select * from menu_info where mi_name like %:keyword%", nativeQuery=true)
    List<MenuInfoEntity> searchMenu(@Param("keyword") String keyword);
}
