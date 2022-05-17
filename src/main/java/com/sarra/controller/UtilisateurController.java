package com.sarra.controller;

 

import com.sarra.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.UserRepository;

 

@CrossOrigin()
@RestController
@RequestMapping({ "/Utilisateurs" })
public class UtilisateurController {
 
 
 @Autowired
 private UserRepository utilisateurRepository;
 
///////////all Utilisateur
@RequestMapping("/all")
public List<Utilisateur> getUtilisateur() {
return   utilisateurRepository.findAll();
}

//////////get Utilisateur
@RequestMapping("/get")
public Optional<Utilisateur> getUtilisateur(Long id){
return utilisateurRepository.findById(id);
}

/////////save Utilisateur
@RequestMapping("/save")
public Utilisateur saveUtilisateur(Utilisateur U ) {
 
 utilisateurRepository.save(U);
return U;

}


/////////delete Utilisateur
@RequestMapping("/delete")
public String deleteUtilisateur(Long id){
try {
utilisateurRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Utilisateur
@RequestMapping("/update")
public Utilisateur updateUtilisateur(Utilisateur U){
return utilisateurRepository.saveAndFlush(U);
}

 
}