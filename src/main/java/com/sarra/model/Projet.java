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
import javax.persistence.OneToOne;

@Entity
public class Projet {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_projet;
	
	private String titre_projet;
	private String dateDebutprojet;
	private String dateFinprojet;
	private String description;
 
 
	@ManyToOne
	private Utilisateur chefde_projet;
	
	
	
	@ManyToMany
	@JoinTable(
	  name = "ProjetEquipe", 
	  joinColumns = @JoinColumn(name = "id_projet"), 
	  inverseJoinColumns = @JoinColumn(name = "id_equipe"))
	  Set<Equipe> projetEquipe;
 

	@OneToOne
	private Rapport rapport;
	 
 
	
	@ManyToOne
	private Etat  etat_projet ;
	 
	public Projet() {
		super();
	}


 
  




	public Projet(String titre_projet, String dateDebutprojet, String dateFinprojet, String description,
			Utilisateur chefde_projet, Set<Equipe> projetEquipe, Rapport rapport, Etat etat_projet) {
		super();
		this.titre_projet = titre_projet;
		this.dateDebutprojet = dateDebutprojet;
		this.dateFinprojet = dateFinprojet;
		this.description = description;
		this.chefde_projet = chefde_projet;
		this.projetEquipe = projetEquipe;
		this.rapport = rapport;
		this.etat_projet = etat_projet;
	}








	public Long getId_projet() {
		return id_projet;
	}

	public void setId_projet(Long id_projet) {
		this.id_projet = id_projet;
	}

	public String getTitre_projet() {
		return titre_projet;
	}

	public void setTitre_projet(String titre_projet) {
		this.titre_projet = titre_projet;
	}

 

  

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public Utilisateur getChefde_projet() {
		return chefde_projet;
	}



	public void setChefde_projet(Utilisateur chefde_projet) {
		this.chefde_projet = chefde_projet;
	}

 
 

	public Set<Equipe> getProjetEquipe() {
		return projetEquipe;
	}






	public String getDateDebutprojet() {
		return dateDebutprojet;
	}








	public void setDateDebutprojet(String dateDebutprojet) {
		this.dateDebutprojet = dateDebutprojet;
	}








	public String getDateFinprojet() {
		return dateFinprojet;
	}








	public void setDateFinprojet(String dateFinprojet) {
		this.dateFinprojet = dateFinprojet;
	}








	public Etat getEtat_projet() {
		return etat_projet;
	}








	public void setEtat_projet(Etat etat_projet) {
		this.etat_projet = etat_projet;
	}








	public void setProjetEquipe(Set<Equipe> projetEquipe) {
		this.projetEquipe = projetEquipe;
	}






	public Rapport getRapport() {
		return rapport;
	}


	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}


	public Etat getEtat() {
		return this.etat_projet ;
	}


	public void setEtat(Etat etat_projet) {
		this.etat_projet  = etat_projet;
	}


	
}
