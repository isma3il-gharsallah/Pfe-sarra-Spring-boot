package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etat {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_etat;
	
	private String label;

	public Etat(String label) {
		super();
		this.label = label;
	}

	public Etat() {
		super();
	}

	public Long getId_etat() {
		return id_etat;
	}

	public void setId_etat(Long id_etat) {
		this.id_etat = id_etat;
	}

	public String getNom() {
		return label;
	}

	public void setNom(String label) {
		this.label = label;
	}
	
	

}
