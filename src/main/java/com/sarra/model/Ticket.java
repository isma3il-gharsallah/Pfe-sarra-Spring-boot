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
public class Ticket {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ticket;
	
	private String titre_Ticket;
	private String description;
	
	@ManyToOne
    @JoinColumn(name="projet", nullable=false)
    private Projet projet;
	
	@ManyToMany
	@JoinTable(
	  name = "UtilisateurTicket", 
	  joinColumns = @JoinColumn(name = "id_ticket"), 
	  inverseJoinColumns = @JoinColumn(name = "id_utilisateur"))
	Set<Utilisateur> utilisateurTicket;
	
	@ManyToOne
    @JoinColumn(name="categorie", nullable=false)
    private Categorie categorie;
	
	public Ticket() {
		super();
	}

	public Ticket(String titre_Ticket, String description, Projet projet, Set<Utilisateur> utilisateurTicket,
			Categorie categorie) {
		super();
		this.titre_Ticket = titre_Ticket;
		this.description = description;
		this.projet = projet;
		this.utilisateurTicket = utilisateurTicket;
		this.categorie = categorie;
	}

	public Set<Utilisateur> getUtilisateurTicket() {
		return utilisateurTicket;
	}

	public void setUtilisateurTicket(Set<Utilisateur> utilisateurTicket) {
		this.utilisateurTicket = utilisateurTicket;
	}

	public Categorie getCategorie() {
		return categorie;
	}
 
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
 
	public Projet getProjet() {
		return projet;
	}
 
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
 
	public Long getId_ticket() {
		return id_ticket;
	}
	public void setId_ticket(Long id_ticket) {
		this.id_ticket = id_ticket;
	}
	public String getTitre_Ticket() {
		return titre_Ticket;
	}
	public void setTitre_Ticket(String titre_Ticket) {
		this.titre_Ticket = titre_Ticket;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
