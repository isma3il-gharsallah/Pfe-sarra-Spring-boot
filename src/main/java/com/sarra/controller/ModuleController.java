package com.sarra.controller;

 
import com.sarra.model.Module;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.ModuleRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Modules" })
public class ModuleController {

 
 @Autowired
 private ModuleRepository moduleRepository;
 
///////////all Module
@RequestMapping("/all")
public List<Module> getModule() {
return   moduleRepository.findAll();
}

//////////get Module
@RequestMapping("/get")
public Optional<Module> getModule(Long id){
return moduleRepository.findById(id);
}

/////////save Module
@RequestMapping("/save")
public Module saveModule(Module U ) {
	moduleRepository.save(U);
return U;

}


/////////delete Module
@RequestMapping("/delete")
public String deleteModule(Long id){
try {
moduleRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Module
@RequestMapping("/update")
public Module updateModule(Module U){
return moduleRepository.saveAndFlush(U);
}


///////////all Module
@RequestMapping("/getListeModule")
public List<Module> getListeModule(Long projet) {
return   moduleRepository.getListeModuls(projet);
}


}