package com.sarra.controller;

 
import com.sarra.model.Projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.ProjetRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Projets" })
public class ProjetController {

 
 @Autowired
 private ProjetRepository projetRepository;
 
///////////all Projet
@RequestMapping("/all")
public List<Projet> getProjet() {
return   projetRepository.findAll();
}

//////////get Projet
@RequestMapping("/get")
public Optional<Projet> getProjet(Long id){
return projetRepository.findById(id);
}

/////////save Projet
@RequestMapping("/save")
public Projet saveProjet(Projet U ) {
	
	projetRepository.save(U);
return U;

}


/////////delete Projet
@RequestMapping("/delete")
public String deleteProjet(Long id){
try {
projetRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Projet
@RequestMapping("/update")
public Projet updateProjet(Projet U){
return projetRepository.saveAndFlush(U);
}
}