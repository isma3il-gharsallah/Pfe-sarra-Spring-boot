package com.sarra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class UserCompetence {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		
		 @ManyToOne
		 @JoinColumn(name="id_utilisateur", nullable=false)
		 private Utilisateur utilisateur;
	     
		 @ManyToOne
		 @JoinColumn(name="id_competence", nullable=false)
		 private Competence competence;	

		 private int experience;



		public UserCompetence(Utilisateur utilisateur, Competence competence, int experience) {
			super();
			this.utilisateur = utilisateur;
			this.competence = competence;
			this.experience = experience;
		}


		public UserCompetence() {
			super();
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public Utilisateur getUtilisateur() {
			return utilisateur;
		}


		public void setUtilisateur(Utilisateur utilisateur) {
			this.utilisateur = utilisateur;
		}


		public Competence getCompetence() {
			return competence;
		}


		public void setCompetence(Competence competence) {
			this.competence = competence;
		}


		public int getExperience() {
			return experience;
		}


		public void setExperience(int experience) {
			this.experience = experience;
		}	
		 
		 
		 

	
		 
}
