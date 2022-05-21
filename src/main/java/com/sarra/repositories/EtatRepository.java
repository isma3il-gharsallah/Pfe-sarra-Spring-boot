 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Etat;
 
@Transactional
public interface EtatRepository extends JpaRepository<Etat, Long>{


}