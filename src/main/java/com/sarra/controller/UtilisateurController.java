package com.sarra.controller;

 

import com.sarra.config.JwtTokenUtil;
import com.sarra.model.JwtRequest;
import com.sarra.model.JwtResponse;
import com.sarra.model.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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

 

 JwtAuthenticationController jwtAuthenticationController;

 @Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;
 
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
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

@RequestMapping("/login")
public ResponseEntity<?> loginUser(String email,String password) throws Exception{
	
 
	if (utilisateurRepository.getuserbylogin(email,password)!=null) {
	JwtRequest jreq= new JwtRequest(email,password);
	final UserDetails userDetails = jwtInMemoryUserDetailsService
			.loadUserByUsername(jreq.getUsername());

	final String token = jwtTokenUtil.generateToken(userDetails);

	return ResponseEntity.ok(new JwtResponse(token,"chef", utilisateurRepository.getuserbylogin(email,password).getId_utilisateur() ));

	}
	else {
		return null;
	}
   
}
}