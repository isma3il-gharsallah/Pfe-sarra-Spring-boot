package com.sarra.controller;

 
import com.sarra.model.Privilege;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.PrivilegeRepository;

@CrossOrigin 
@RestController
@RequestMapping({ "/Privileges" })
public class PrivilegeController {

 
@Autowired
private PrivilegeRepository privilegeRepository;
 
///////////all Privilege
@RequestMapping("/all")
public List<Privilege> getPrivilege() {
return   privilegeRepository.findAll();
}

//////////get Privilege
@RequestMapping("/get")
public Optional<Privilege> getPrivilege(Long id){
return privilegeRepository.findById(id);
}

/////////save Privilege
@RequestMapping("/save")
public Privilege savePrivilege(Privilege U ) {
	
	privilegeRepository.save(U);
return U;

}


/////////delete Privilege
@RequestMapping("/delete")
public String deletePrivilege(Long id){
try {
privilegeRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Privilege
@RequestMapping("/update")
public Privilege updatePrivilege(Privilege U){
return privilegeRepository.saveAndFlush(U);
}
}