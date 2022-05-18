package com.sarra.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

 import com.sarra.model.UserCompetence;
 
@Transactional
public interface UserCompetenceRepository extends JpaRepository<UserCompetence, Long>{
 
	 @Query("SELECT c FROM UserCompetence c where id_utilisateur= :id_utilisateur  ") 
	 public   List<UserCompetence>  getuser_competence(@Param("id_utilisateur") Long id_utilisateur  );
	 
	 
	 @Query("SELECT c FROM UserCompetence c where id_competence= :id_competence  ") 
	 public   List<UserCompetence>  getcompetence_user(@Param("id_competence") Long id_competence  );
}

