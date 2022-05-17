package com.sarra.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
 
@Entity
public class Utilisateur {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_utilisateur;
	
	private String nom;
	private String prenom;
	private String telephone;
 	private String login;
	private String motdepasse;
	private String email;
	private String disponibilite;
 	
	@ManyToMany(mappedBy = "UtilisateurCompetence")
	Set<Competence> competences;
	
	@ManyToOne
    @JoinColumn(name="privilege", nullable=false)
    private Privilege privilege;
	
	
 
	
 
	
	public Utilisateur() {
		super();
	}

	
	public Utilisateur(String nom, String prenom, String telephone, String login, String motdepasse, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.login = login;
		this.motdepasse = motdepasse;
		this.email = email;
	}


	public Utilisateur(String nom, String prenom, String telephone , String login, String motdepasse,
			String email, String disponibilite, Set<Competence> competences, Privilege privilege, Set<Ticket> tickets) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
 		this.login = login;
		this.motdepasse = motdepasse;
		this.email = email;
		this.disponibilite = disponibilite;
		this.competences = competences;
		this.privilege = privilege;
 	}


	public Utilisateur(String nom, String prenom, String telephone,   String login, String motdepasse,
			String email, String disponibilite, Set<Competence> competences, Privilege privilege ) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
 		this.login = login;
		this.motdepasse = motdepasse;
		this.email = email;
		this.disponibilite = disponibilite;
		this.competences = competences;
		this.privilege = privilege;
 
	}
 

 

	public Privilege getPrivilege() {
		return privilege;
	}
 
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
 
	public Set<Competence> getCompetences() {
		return competences;
	}
	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}

	public Long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
 
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	

 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (id_utilisateur == null) {
			if (other.id_utilisateur != null)
				return false;
		} else if (!id_utilisateur.equals(other.id_utilisateur))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
	 
		return true;
	}
}

