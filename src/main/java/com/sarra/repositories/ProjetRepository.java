 

package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Projet;

@Transactional

public interface ProjetRepository extends JpaRepository<Projet, Long>{


	 

}