package com.voidking.hibernate.model;

import java.util.HashSet;
import java.util.Set;


public class Room implements java.io.Serializable {

	// Fields
	private Integer id;
	private String address;	
	private Set person = new HashSet();

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** full constructor */
	public Room(String address) {
		this.address = address;
		//this.person = person;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getPerson() {
		return person;
	}

	public void setPerson(Set person) {
		this.person = person;
	}
}