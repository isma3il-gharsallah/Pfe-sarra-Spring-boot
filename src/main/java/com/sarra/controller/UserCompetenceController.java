package com.sarra.controller;

 
import com.sarra.model.UserCompetence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.UserCompetenceRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/UserCompetence" })
public class UserCompetenceController {

 
 @Autowired
 private UserCompetenceRepository userCompetenceRepository;
 
///////////all UserCompetence
@RequestMapping("/all")
public List<UserCompetence> getUserCompetence() {
return   userCompetenceRepository.findAll();
}

//////////get UserCompetence
@RequestMapping("/get")
public Optional<UserCompetence> getUserCompetence(Long id){
return userCompetenceRepository.findById(id);
}

/////////save UserCompetence
@RequestMapping("/save")
public UserCompetence saveUserCompetence(UserCompetence U ) {
	
	userCompetenceRepository.save(U);
return U;

}


/////////delete UserCompetence
@RequestMapping("/delete")
public String deleteUserCompetence(Long id){
try {
userCompetenceRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update UserCompetence
@RequestMapping("/update")
public UserCompetence updateUserCompetence(UserCompetence U){
return userCompetenceRepository.saveAndFlush(U);
}

//////////get By User
@RequestMapping("/getByUser")
public List<UserCompetence> getByUser(Long id_utilisateur){
return userCompetenceRepository.getuser_competence(id_utilisateur);
}
//getcompetence_user

@RequestMapping("/getByCompetence")
public List<UserCompetence> getByCompetence(Long id_competence){
return userCompetenceRepository.getcompetence_user(id_competence);
}
}