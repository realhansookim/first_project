package com.first_project.justdoeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first_project.justdoeat.entity.MenuCategoryEntity;

public interface MenuCategoryRepository extends JpaRepository<MenuCategoryEntity,Long> {
<<<<<<< HEAD
  
=======
  public MenuCategoryEntity findByMcaSeq(Long mcaSeq);
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
}
