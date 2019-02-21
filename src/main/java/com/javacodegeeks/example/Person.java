package com.javacodegeeks.example;

public class Person {
	
	private String personId;
	private String name;

	//standard getters and setters
	public String getPersonId() {
		return personId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Person{personId='%s', name='%s'_}",personId, name);
	}
}
