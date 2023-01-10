package com.first_project.justdoeat.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD:src/main/java/com/first_project/justdoeat/repository/MenuInfoRepository.java
import org.springframework.stereotype.Repository;
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> LTH:src/main/java/com/first_project/justdoeat/repository/menuInfoRepository.java
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10

import com.first_project.justdoeat.entity.MenuInfoEntity;

@Repository
public interface MenuInfoRepository extends JpaRepository <MenuInfoEntity, Long> {
<<<<<<< HEAD
  
=======
  public MenuInfoEntity findByMiName(String miName);
  @Query(value = "select * from menu_info where mi_name like %:keyword%", nativeQuery=true)
    List<MenuInfoEntity> searchMenu(@Param("keyword") String keyword);
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
}
