 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Module;

@Transactional

public interface ModuleRepository extends JpaRepository<Module, Long>{


	 

}