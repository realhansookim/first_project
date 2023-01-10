package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first_project.justdoeat.entity.MenuCategoryEntity;

public interface MenuCategoryRepository extends JpaRepository<MenuCategoryEntity,Long> {
  public MenuCategoryEntity findByMcaSeq(Long mcaSeq);
}
