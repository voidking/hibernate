package com.voidking.hibernate.model;

public class Detail implements java.io.Serializable {

	// Fields

	private Integer id;
	private String truename;
	private String email;
	private Login login;		

	// Constructors

	/** default constructor */
	public Detail() {
	}

	/** full constructor */
	public Detail(String truename, String email, Login login) {
		this.truename = truename;
		this.email = email;
		this.login = login;		
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Login getLogin(){
		return this.login;
	}
	public void setLogin(Login login){
		this.login = login;
	}

}