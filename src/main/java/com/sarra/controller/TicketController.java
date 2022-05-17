package com.sarra.controller;

 
import com.sarra.model.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.TicketRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Tickets" })
public class TicketController {

 
 @Autowired
 private TicketRepository ticketRepository;
 
///////////all Ticket
@RequestMapping("/all")
public List<Ticket> getTicket() {
return   ticketRepository.findAll();
}

//////////get Ticket
@RequestMapping("/get")
public Optional<Ticket> getTicket(Long id){
return ticketRepository.findById(id);
}

/////////save Ticket
@RequestMapping("/save")
public Ticket saveTicket(Ticket U ) {
	ticketRepository.save(U);
return U;

}


/////////delete Ticket
@RequestMapping("/delete")
public String deleteTicket(Long id){
try {
ticketRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Ticket
@RequestMapping("/update")
public Ticket updateTicket(Ticket U){
return ticketRepository.saveAndFlush(U);
}
}