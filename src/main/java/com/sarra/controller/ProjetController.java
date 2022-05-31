package com.sarra.controller;

 
import com.sarra.model.Projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
 
 
 @Autowired
 private JavaMailSender emailSender;
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
	////
	 SimpleMailMessage message = new SimpleMailMessage(); 
     message.setFrom("sarra.pfe.pringboot@gmail.com");
     message.setTo(U.getChefde_projet().getEmail()); 
     message.setSubject("Nouveau Projet"); 
     message.setText("L'admin a affecté un nouveau projet pour vous. \n Le nom de projet: "+U.getTitre_projet()+" \n Merci de connecter à notre platform pour terminer la création de projet.");
     emailSender.send(message);
	////
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


/////////update Projet
@RequestMapping("/updateDate")
public boolean updateDate(Long id_projet, String dateDebutprojet, String dateFinprojet, String description ){
 projetRepository.updateDate(id_projet , dateDebutprojet, dateFinprojet, description);
 return true ;
}

//////////get new Projet
@RequestMapping("/getNew")
public   Projet getNewProjet(Long chefde_projet){
	if(projetRepository.getNewProjet(chefde_projet).size()>0)
	return projetRepository.getNewProjet(chefde_projet).get(0) ;
	else
	return null;
}


//////////get new Projet
@RequestMapping("/allByChef")
public  List<Projet> getListeProjetChef(Long chefde_projet){
 return projetRepository.getListeProjetChef(chefde_projet)  ;
 
}
}