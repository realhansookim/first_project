package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first_project.justdoeat.entity.MenuCategoryEntity;

public interface menuCategoryRepository extends JpaRepository<MenuCategoryEntity,Long> {
  
}
