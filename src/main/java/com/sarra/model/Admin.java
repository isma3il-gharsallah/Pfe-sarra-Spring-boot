package com.sarra.model;

import javax.persistence.Entity;
 
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
 	private String login;
	private String motdepasse;
	
	
	
	
	public Admin() {
		super();
	}




	public Admin(String login, String motdepasse) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
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
	
	
	
	
}
