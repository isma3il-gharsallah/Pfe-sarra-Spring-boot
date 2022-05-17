package com.sarra.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Competence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_competence;
	
	private String description;
	private String experience;
	private String titre;
	
	@ManyToMany
	@JoinTable(
	  name = "UtilisateurCompetence", 
	  joinColumns = @JoinColumn(name = "id_competence"), 
	  inverseJoinColumns = @JoinColumn(name = "id_utilisateur"))
	Set<Utilisateur> UtilisateurCompetence;

	public Competence() {
		super();
	}

	
	public Competence(String description, String experience, String titre) {
		super();
		this.description = description;
		this.experience = experience;
		this.titre = titre;
	}


	public Competence(String description, String experience, String titre, Set<Utilisateur> utilisateurCompetence) {
		super();
		this.description = description;
		this.experience = experience;
		this.titre = titre;
		UtilisateurCompetence = utilisateurCompetence;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Set<Utilisateur> getUtilisateurCompetence() {
		return UtilisateurCompetence;
	}

	public void setUtilisateurCompetence(Set<Utilisateur> utilisateurCompetence) {
		UtilisateurCompetence = utilisateurCompetence;
	}

	
	
	
}
