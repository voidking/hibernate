package com.voidking.hibernate.model;

public class Login implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Detail detail;		

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** full constructor */
	public Login(String username, String password, Detail detail) {
		this.username = username;
		this.password = password;
		this.detail = detail;	
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Detail getDetail(){
		return this.detail;
	}
	public void setDetail(Detail detail){
		this.detail = detail;
	}

}