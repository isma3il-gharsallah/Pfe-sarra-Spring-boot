 
package com.sarra.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Module;

@Transactional

public interface ModuleRepository extends JpaRepository<Module, Long>{


	 @Query("SELECT c FROM Module c where c.projet.id_projet = :id_projet order by id_module ") 
	 public  List<Module> getListeModuls(@Param("id_projet") Long id_projet  ) ;

}