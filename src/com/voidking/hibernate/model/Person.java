package com.voidking.hibernate.model;

public class Person implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Room room;			

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(String name) {
		this.name = name;
	}

	/** full constructor */
	public Person(String name, Room room) {
		this.name = name;
		//this.roomId = roomId;
		this.room = room;		
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Room getRoom(){
		return this.room;
	}
	public void setRoom(Room room){
		this.room = room;
	}
}