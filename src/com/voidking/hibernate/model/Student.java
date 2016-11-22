package com.voidking.hibernate.model;
import java.util.HashSet;
import java.util.Set;

public class Student implements java.io.Serializable {

	// Fields
	private Integer id;
	private String snumber;
	private String sname;
	private Integer sage;
	private Set courses = new HashSet();

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String snumber) {
		this.snumber = snumber;
	}

	/** full constructor */
	public Student(String snumber, String sname, Integer sage) {
		this.snumber = snumber;
		this.sname = sname;
		this.sage = sage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSnumber() {
		return this.snumber;
	}

	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSage() {
		return this.sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}
	
	public Set getCourses(){
		return courses;
	}
	public void setCourses(Set courses){
		this.courses = courses;
	}

}