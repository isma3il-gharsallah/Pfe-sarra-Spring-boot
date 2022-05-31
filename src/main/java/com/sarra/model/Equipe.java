package com.sarra.model;

 
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
 
@Entity
public class Equipe {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_equipe;


	private String nom_Equipe;
	private String Nb_Equipe;
	private String Role;
	private String Description;

	@ManyToOne
    @JoinColumn(name="projet", nullable=false)
    private Projet projet;
	
	
	@ManyToMany
	@JoinTable(
	  name = "MembresEquipe", 
	  joinColumns = @JoinColumn(name = "id_equipe"), 
	  inverseJoinColumns = @JoinColumn(name = "id_utilisateur"))
	  Set<Utilisateur> membresEquipe;
	
	public Equipe() {
		super();
	}
	
	

	public Equipe(String nom_Equipe, String nb_Equipe, String role, String description, Projet projet) {
		super();
		this.nom_Equipe = nom_Equipe;
		Nb_Equipe = nb_Equipe;
		Role = role;
		Description = description;
		this.projet = projet;
	}



	public Equipe(String nom_Equipe, String nb_Equipe, String role, String description, Projet projet,
			Set<Utilisateur> membresEquipe) {
		super();
		this.nom_Equipe = nom_Equipe;
		Nb_Equipe = nb_Equipe;
		Role = role;
		Description = description;
		this.projet = projet;
		this.membresEquipe = membresEquipe;
	}



	public Set<Utilisateur> getMembresEquipe() {
		return membresEquipe;
	}



	public void setMembresEquipe(Set<Utilisateur> membresEquipe) {
		this.membresEquipe = membresEquipe;
	}



	public Projet getProjet() {
		return projet;
	}



	public void setProjet(Projet projet) {
		this.projet = projet;
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
 
}
