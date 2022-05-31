 
package com.sarra.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

 import com.sarra.model.Tache;

@Transactional

public interface TacheRepository extends JpaRepository<Tache, Long>{

//getListeparModule
	 
 
	 @Query("SELECT c FROM Tache c where c.parent.id_module  = :id_module order by start ") 
	 public  List<Tache> getListeparModule(@Param("id_module") Long id_module  ) ;
}