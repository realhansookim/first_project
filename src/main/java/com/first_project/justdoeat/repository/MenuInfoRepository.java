package com.first_project.justdoeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD:src/main/java/com/first_project/justdoeat/repository/MenuInfoRepository.java
import org.springframework.stereotype.Repository;
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> LTH:src/main/java/com/first_project/justdoeat/repository/menuInfoRepository.java

import com.first_project.justdoeat.entity.MenuInfoEntity;

@Repository
public interface MenuInfoRepository extends JpaRepository <MenuInfoEntity, Long> {
  public MenuInfoEntity findByMiName(String miName);
  @Query(value = "select * from menu_info where mi_name like %:keyword%", nativeQuery=true)
    List<MenuInfoEntity> searchMenu(@Param("keyword") String keyword);
}
