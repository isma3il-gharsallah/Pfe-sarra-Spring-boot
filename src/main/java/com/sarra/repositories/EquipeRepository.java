 
package com.sarra.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Equipe;
 
@Transactional

public interface EquipeRepository extends JpaRepository<Equipe, Long>{


//
	
	 @Query("SELECT c FROM Equipe c where c.projet.id_projet  = :projet order by id_equipe desc") 
	 public  List<Equipe> EquipeByProject(@Param("projet") Long projet  ) ;
	 
	 
}