 
package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Ticket;
 
@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Long>{


}