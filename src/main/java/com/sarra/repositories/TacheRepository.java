 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Tache;

@Transactional

public interface TacheRepository extends JpaRepository<Tache, Long>{


	 

}