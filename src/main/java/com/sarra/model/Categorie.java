package com.sarra.model;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Categorie;
	
	private String nom_Categorie;
	private String type_Categorie;
 
 
 


	public Categorie() {
		super();
	}


	public Categorie(String nom_Categorie, String type_Categorie ) {
		super();
		this.nom_Categorie = nom_Categorie;
		this.type_Categorie = type_Categorie;
 	}


	public Long getId_Categorie() {
		return id_Categorie;
	}


	public void setId_Categorie(Long id_Categorie) {
		this.id_Categorie = id_Categorie;
	}


	public String getNom_Categorie() {
		return nom_Categorie;
	}


	public void setNom_Categorie(String nom_Categorie) {
		this.nom_Categorie = nom_Categorie;
	}


	public String getType_Categorie() {
		return type_Categorie;
	}


	public void setType_Categorie(String type_Categorie) {
		this.type_Categorie = type_Categorie;
	}
 
	
	
	
}
