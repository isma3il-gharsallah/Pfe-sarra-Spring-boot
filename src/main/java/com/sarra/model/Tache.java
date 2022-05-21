package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Tache {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tache;
	private String name   ;
	private String start ;
	private String end ;
	private boolean collapsed ;
	
	@OneToOne
	private Utilisateur membre;
     
	@ManyToOne
	private Statut statut ;
	
	 @ManyToOne
	 private Module module;
	 
	 
	 
	 

	public Tache(String name, String start, String end, boolean collapsed, Utilisateur membre, Statut statut,
			Module module) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
		this.collapsed = collapsed;
		this.membre = membre;
		this.statut = statut;
		this.module = module;
	}

	public Tache() {
		super();
	}

	public Long getId_ticket() {
		return id_tache;
	}

	public void setId_ticket(Long id_ticket) {
		this.id_tache = id_ticket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public boolean isCollapsed() {
		return collapsed;
	}

	public void setCollapsed(boolean collapsed) {
		this.collapsed = collapsed;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Utilisateur getMembre() {
		return membre;
	}

	public void setMembre(Utilisateur membre) {
		this.membre = membre;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
	
	
}
