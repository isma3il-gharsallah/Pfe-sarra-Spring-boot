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
	private Long id;
	private String name   ;
	private String start ;
	private String end ;
	private boolean collapsed ;
	
	@OneToOne
	private Utilisateur membre;
     
	@ManyToOne
	private Custom custom ;
	
	 @ManyToOne
	 private Module parent;
	 
	 
	 
	 

	public Tache(String name, String start, String end, boolean collapsed, Utilisateur membre, Custom custom,
			Module module) {
		super();
		this.name = name;
		this.start = start;
		this.end = end;
		this.collapsed = collapsed;
		this.membre = membre;
		this.custom = custom;
		this.parent = module;
	}

	public Tache() {
		super();
	}

	public Long getId_ticket() {
		return id;
	}

	public void setId_ticket(Long id_ticket) {
		this.id = id_ticket;
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

	public Custom getStatut() {
		return custom;
	}

	public void setStatut(Custom custom) {
		this.custom = custom;
	}

	public Utilisateur getMembre() {
		return membre;
	}

	public void setMembre(Utilisateur membre) {
		this.membre = membre;
	}

	public Long getModule() {
		return parent.getId_module();
	}

	public void setModule(Module module) {
		this.parent = module;
	}
	
	
	
}
