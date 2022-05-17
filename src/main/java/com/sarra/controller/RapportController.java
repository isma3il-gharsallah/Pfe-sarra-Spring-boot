package com.sarra.controller;

 
import com.sarra.model.Rapport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.RapportRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Rapports" })
public class RapportController {

 
 @Autowired
 private RapportRepository rapportRepository;
 
///////////all Rapport
@RequestMapping("/all")
public List<Rapport> getRapport() {
return   rapportRepository.findAll();
}

//////////get Rapport
@RequestMapping("/get")
public Optional<Rapport> getRapport(Long id){
return rapportRepository.findById(id);
}

/////////save Rapport
@RequestMapping("/save")
public Rapport saveRapport(Rapport U ) {
	
	rapportRepository.save(U);
return U;

}


/////////delete Rapport
@RequestMapping("/delete")
public String deleteRapport(Long id){
try {
rapportRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Rapport
@RequestMapping("/update")
public Rapport updateRapport(Rapport U){
return rapportRepository.saveAndFlush(U);
}
}