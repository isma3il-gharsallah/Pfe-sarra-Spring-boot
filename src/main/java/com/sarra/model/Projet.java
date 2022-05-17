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
	private String DateDebut_projet;
	private String DateFin_projet;
	private String description;
 
 
	@ManyToOne
	private Utilisateur chefde_projet;
	
	
	@ManyToMany
	@JoinTable(
	  name = "ProjetEquipe", 
	  joinColumns = @JoinColumn(name = "id_projet"), 
	  inverseJoinColumns = @JoinColumn(name = "id_equipe"))
	  Set<Equipe> ProjetEquipe;
 

	@OneToOne
	private Rapport rapport;
	 
	 
	public Projet() {
		super();
	}


	public Projet(String titre_projet, String dateDebut_projet, String dateFin_projet, String description,
			Utilisateur chefde_projet, Set<Equipe> projetEquipe , Rapport rapport) {
		super();
		this.titre_projet = titre_projet;
		DateDebut_projet = dateDebut_projet;
		DateFin_projet = dateFin_projet;
		this.description = description;
		this.chefde_projet = chefde_projet;
		ProjetEquipe = projetEquipe;
 		this.rapport = rapport;
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

	public String getDateDebut_projet() {
		return DateDebut_projet;
	}

	public void setDateDebut_projet(String dateDebut_projet) {
		DateDebut_projet = dateDebut_projet;
	}

	public String getDateFin_projet() {
		return DateFin_projet;
	}

	public void setDateFin_projet(String dateFin_projet) {
		DateFin_projet = dateFin_projet;
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
		return ProjetEquipe;
	}



	public void setProjetEquipe(Set<Equipe> projetEquipe) {
		ProjetEquipe = projetEquipe;
	}

 

	public Rapport getRapport() {
		return rapport;
	}


	public void setRapport(Rapport rapport) {
		this.rapport = rapport;
	}


	
}
