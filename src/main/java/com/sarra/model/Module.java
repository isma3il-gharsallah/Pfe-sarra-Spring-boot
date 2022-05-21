package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
  
@Entity
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_module ;
	
	private String name ;
 
 		private String start ;
		private String end ;
		private boolean collapsed ;
 
	     
		@ManyToOne
		private Statut statut ;
	 
	 
		 @ManyToOne
		 private Projet projet;


		public Module(String name, String start, String end, boolean collapsed, Statut statut, Projet projet) {
			super();
			this.name = name;
			this.start = start;
			this.end = end;
			this.collapsed = collapsed;
			this.statut = statut;
			this.projet = projet;
		}


		public Module() {
			super();
		}


		public Long getId_module() {
			return id_module;
		}


		public void setId_module(Long id_module) {
			this.id_module = id_module;
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


		public Projet getProjet() {
			return projet;
		}


		public void setProjet(Projet projet) {
			this.projet = projet;
		}
		 
		 
       
}
