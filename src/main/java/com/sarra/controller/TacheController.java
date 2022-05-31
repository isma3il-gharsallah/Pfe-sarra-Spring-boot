package com.sarra.controller;

 
import com.sarra.model.Tache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.TacheRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Taches" })
public class TacheController {

 
 @Autowired
 private TacheRepository tacheRepository;
 
///////////all Tache
@RequestMapping("/all")
public List<Tache> getTache() {
return   tacheRepository.findAll();
}

//////////get Tache
@RequestMapping("/get")
public Optional<Tache> getTache(Long id){
return tacheRepository.findById(id);
}

/////////save Tache
@RequestMapping("/save")
public Tache saveTache(Tache U ) {
	tacheRepository.save(U);
return U;

}


/////////delete Tache
@RequestMapping("/delete")
public String deleteTache(Long id){
try {
tacheRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Tache
@RequestMapping("/update")
public Tache updateTache(Tache U){
return tacheRepository.saveAndFlush(U);
}


///////////all Tache
@RequestMapping("/getListeTache")
public List<Tache> getListeTache(Long module) {
return   tacheRepository.getListeparModule(module);
}


}