 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Categorie;

@Transactional

public interface CategorieRepository extends JpaRepository<Categorie, Long>{


	 

}