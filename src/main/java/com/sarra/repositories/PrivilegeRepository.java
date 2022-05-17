 

package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Privilege;

@Transactional

public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{


	 

}