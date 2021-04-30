package Entities;

public class User {
	int id;
	String firstName;
	String lastName;
	int identicalNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getIdenticalNumber() {
		return identicalNumber;
	}
	public void setIdenticalNumber(int identicalNumber) {
		this.identicalNumber = identicalNumber;
	}
} 