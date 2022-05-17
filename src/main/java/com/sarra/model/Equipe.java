package com.sarra.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Equipe {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_equipe;
	
	
	private String nom_Equipe;
	private String Nb_Equipe;
	private String Role;
	private String Description;

	@ManyToMany(mappedBy = "ProjetEquipe")
	Set<Projet> projets;

	
	
	public Equipe() {
		super();
	}

	public Long getId_equipe() {
		return id_equipe;
	}

	public void setId_equipe(Long id_equipe) {
		this.id_equipe = id_equipe;
	}

	public String getNom_Equipe() {
		return nom_Equipe;
	}

	public void setNom_Equipe(String nom_Equipe) {
		this.nom_Equipe = nom_Equipe;
	}

	public String getNb_Equipe() {
		return Nb_Equipe;
	}

	public void setNb_Equipe(String nb_Equipe) {
		Nb_Equipe = nb_Equipe;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Set<Projet> getProjets() {
		return projets;
	}

	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}
	
	
	
}
