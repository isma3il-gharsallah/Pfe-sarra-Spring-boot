package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.sarra.model.Competence;
 
@Transactional
public interface CompetenceRepository extends JpaRepository<Competence, Long>{

 
	 

}

