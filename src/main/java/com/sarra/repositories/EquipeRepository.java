 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Equipe;

@Transactional

public interface EquipeRepository extends JpaRepository<Equipe, Long>{


	 

}