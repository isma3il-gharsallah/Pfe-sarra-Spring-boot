 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Statut;

@Transactional

public interface StatutRepository extends JpaRepository<Statut, Long>{


	 

}