package com.voidking.hibernate.model;

import java.util.HashSet;
import java.util.Set;


public class Course implements java.io.Serializable {

	// Fields
	private Integer id;
	private String cnumber;
	private String cname;
	private Set stus = new HashSet();

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String cnumber) {
		this.cnumber = cnumber;
	}

	/** full constructor */
	public Course(String cnumber, String cname) {
		this.cnumber = cnumber;
		this.cname = cname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnumber() {
		return this.cnumber;
	}

	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStus() {
		return stus;
	}

	public void setStus(Set stus) {
		this.stus = stus;
	}

}