package com.sarra.model;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Privilege {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_privilege;
	
	private String titre;

 

	public Privilege() {
		super();
	}

	public Privilege(String titre ) {
		super();
		this.titre = titre;
 	}

	public Long getId_privilege() {
		return id_privilege;
	}

	public void setId_privilege(Long id_privilege) {
		this.id_privilege = id_privilege;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
 

 
	 
	 
	 
}
