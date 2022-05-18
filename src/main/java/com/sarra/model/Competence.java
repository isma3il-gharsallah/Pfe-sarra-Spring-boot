package com.sarra.model;

 
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
  
@Entity
public class Competence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_competence;
	
	private String description;
 	private String titre;
	
 
 

	public Competence() {
		super();
	}

	
	public Competence(String description, String titre) {
		super();
		this.description = description;
 		this.titre = titre;
	}

 
 

	public Long getId_competence() {
		return id_competence;
	}

	public void setId_competence(Long id_competence) {
		this.id_competence = id_competence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

 

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

 
	
	
	
}
