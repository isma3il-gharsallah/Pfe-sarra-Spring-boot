 

package com.sarra.repositories;


import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Projet;
 
@Transactional

public interface ProjetRepository extends JpaRepository<Projet, Long>{

 
	 @Query("SELECT c FROM Projet  c where  chefde_projet.id_utilisateur= :chefde_projet and  etat_projet=111  order by id_projet desc ") 
	 public  List<Projet> getNewProjet(@Param("chefde_projet") Long chefde_projet  ) ;

	 
	 @Modifying
	 @Query("UPDATE Projet SET etat_projet = 222, id_projet = :id_projet , dateDebutprojet = :dateDebutprojet , dateFinprojet = :dateFinprojet , description = :description ") 
	 void  updateDate(@Param("id_projet") Long id_projet ,@Param("dateDebutprojet") String dateDebutprojet ,@Param("dateFinprojet") String dateFinprojet ,@Param("description") String description  ) ;
 	 

}