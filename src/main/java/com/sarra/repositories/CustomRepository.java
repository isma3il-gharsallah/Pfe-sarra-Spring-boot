 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Custom;

@Transactional

public interface CustomRepository extends JpaRepository<Custom, String>{


	 

}