package com.first_project.justdoeat.repository;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first_project.justdoeat.entity.UserInfoEntity;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long>{
<<<<<<< HEAD
public List<UserInfoEntity> findAllByUiSeq(Long uiSeq);
 UserInfoEntity findByUiSeq(Long uiSeq);
 UserInfoEntity findByUiId(String uiId);
 public UserInfoEntity findByUiNameAndUiEmail(String name, String email);
 public Integer countByUiId(String uiId);
 public UserInfoEntity findByUiIdAndUiPwd(String uiid, String uipwd);
=======
  
>>>>>>> 20386c7bc4538f07ea545fa7505d4ee1a4dc7c10
}
