 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Rapport;

@Transactional

public interface RapportRepository extends JpaRepository<Rapport, Long>{


	 

}