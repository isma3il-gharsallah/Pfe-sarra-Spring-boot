package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rapport {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Rapport;
	
	private String titre_Rapport;
	private String src_Rapport;

	 @OneToOne
	 private Projet projet;

	public Long getId_Rapport() {
		return id_Rapport;
	}

	public void setId_Rapport(Long id_Rapport) {
		this.id_Rapport = id_Rapport;
	}

	public String getTitre_Rapport() {
		return titre_Rapport;
	}

	public void setTitre_Rapport(String titre_Rapport) {
		this.titre_Rapport = titre_Rapport;
	}

	public String getSrc_Rapport() {
		return src_Rapport;
	}

	public void setSrc_Rapport(String src_Rapport) {
		this.src_Rapport = src_Rapport;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	 
	 

}
