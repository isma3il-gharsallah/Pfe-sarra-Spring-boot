package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

 import com.sarra.model.Utilisateur;
 
@Transactional

public interface UserRepository extends JpaRepository<Utilisateur, Long>{

	
	 
	 
	 @Query("SELECT c FROM Utilisateur c where login= :login  and motdepasse= :password ") 
	 public  Utilisateur getuserbylogin(@Param("login") String login , @Param("password") String password  );
}
