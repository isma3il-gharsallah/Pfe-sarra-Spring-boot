package com.sarra.controller;

 
import com.sarra.model.Equipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.EquipeRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Equipes" })
public class EquipeController {

 
 @Autowired
 private EquipeRepository equipeRepository;
 
///////////all Equipe
@RequestMapping("/all")
public List<Equipe> getEquipe() {
return   equipeRepository.findAll();
}

//////////get Equipe
@RequestMapping("/get")
public Optional<Equipe> getEquipe(Long id){
return equipeRepository.findById(id);
}

/////////save Equipe
@RequestMapping("/save")
public Equipe saveEquipe(Equipe U ) {
	
	equipeRepository.save(U);
return U;

}


/////////delete Equipe
@RequestMapping("/delete")
public String deleteEquipe(Long id){
try {
equipeRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Equipe
@RequestMapping("/update")
public Equipe updateEquipe(Equipe U){
return equipeRepository.saveAndFlush(U);
}

 ///////////all Equipe By Project
@RequestMapping("/EquipeByProject")
public List<Equipe> EquipeByProject(Long id) {
return   equipeRepository.EquipeByProject(id);
}

}