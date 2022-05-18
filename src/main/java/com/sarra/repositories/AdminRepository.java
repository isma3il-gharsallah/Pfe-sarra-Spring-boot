package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Admin;
 
@Transactional

public interface AdminRepository extends JpaRepository<Admin, Long>{

 
	 @Query("SELECT c FROM Admin c where login= :login  and motdepasse= :password ") 
	 public  Admin getadminbylogin(@Param("login") String login , @Param("password") String password  );

}
