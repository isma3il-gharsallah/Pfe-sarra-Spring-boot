package com.sarra.controller;

 
import com.sarra.config.JwtTokenUtil;
import com.sarra.model.Admin;
import com.sarra.model.JwtRequest;
import com.sarra.model.JwtResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
 import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

 import java.util.Optional;
import com.sarra.repositories.AdminRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Admins" })
public class AdminController {

 
 @Autowired
 private AdminRepository adminRepository;

 JwtAuthenticationController jwtAuthenticationController;

 @Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;
 
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
//////////login Admin
@RequestMapping("/login")
public ResponseEntity<?> loginAdmin(String email,String password) throws Exception{
	
 
	if (adminRepository.getadminbylogin(email,password)!=null) {
	JwtRequest jreq= new JwtRequest(email,password);
	final UserDetails userDetails = jwtInMemoryUserDetailsService
			.loadUserByUsername(jreq.getUsername());

	final String token = jwtTokenUtil.generateToken(userDetails);

	return ResponseEntity.ok(new JwtResponse(token,"Admin",new Long(1) ));

	}
	else {
		return null;
	}
   
}

//////////get Admin
@RequestMapping("/get")
public Optional<Admin> getAdmin(Long id){
return adminRepository.findById(id);
}

/////////save Admin
@RequestMapping("/save")
public Admin saveAdmin(Admin U ) {
	
	adminRepository.save(U);
return U;

}
 
}