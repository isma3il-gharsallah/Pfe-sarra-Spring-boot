package com.sarra.controller;

 
import com.sarra.model.Competence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.CompetenceRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Competences" })
public class CompetenceController {

 
 @Autowired
 private CompetenceRepository competenceRepository;
 
///////////all Competence
@RequestMapping("/all")
public List<Competence> getCompetence() {
return   competenceRepository.findAll();
}

//////////get Competence
@RequestMapping("/get")
public Optional<Competence> getCompetence(Long id){
return competenceRepository.findById(id);
}

/////////save Competence
@RequestMapping("/save")
public Competence saveCompetence(Competence U ) {
	
	competenceRepository.save(U);
return U;

}


/////////delete Competence
@RequestMapping("/delete")
public String deleteCompetence(Long id){
try {
competenceRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Competence
@RequestMapping("/update")
public Competence updateCompetence(Competence U){
return competenceRepository.saveAndFlush(U);
}
}