package com.sarra.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private String privilege;
	private Long id;
 
  
 



	public JwtResponse(String jwttoken, String privilege, Long id) {
		super();
		this.jwttoken = jwttoken;
		this.privilege = privilege;
		this.id = id;
	}

  


	public String getPrivilege() {
		return privilege;
	}
	
	


	public Long getId() {
		return id;
	}



	public String getToken() {
		return this.jwttoken;
	}
}