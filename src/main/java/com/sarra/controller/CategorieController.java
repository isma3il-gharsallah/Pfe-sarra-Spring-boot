package com.sarra.controller;

 
import com.sarra.model.Categorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.sarra.repositories.CategorieRepository;

@CrossOrigin()
@RestController
@RequestMapping({ "/Categories" })
public class CategorieController {

 
 @Autowired
 private CategorieRepository categorieRepository;
 
///////////all Categorie
@RequestMapping("/all")
public List<Categorie> getCategorie() {
return   categorieRepository.findAll();
}

//////////get Categorie
@RequestMapping("/get")
public Optional<Categorie> getCategorie(Long id){
return categorieRepository.findById(id);
}

/////////save Categorie
@PostMapping("/save")
public Categorie saveCategorie(Categorie U ) {
	System.out.println(U.toString());
	categorieRepository.save(U);
return U;

}


/////////delete Categorie
@RequestMapping("/delete")
public String deleteCategorie(Long id){
try {
categorieRepository.deleteById(id);
return "true";
}
catch(Exception e) {

return "false";
}
}


/////////update Categorie
@RequestMapping("/update")
public Categorie updateCategorie(Categorie U){
return categorieRepository.saveAndFlush(U);
}
}