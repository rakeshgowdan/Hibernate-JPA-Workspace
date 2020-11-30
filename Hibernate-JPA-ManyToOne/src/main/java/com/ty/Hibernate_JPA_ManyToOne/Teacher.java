package com.ty.Hibernate_JPA_ManyToOne;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId;
    private String firstName;
    private String lastName;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Teacher(int teacherId, String firstName, String lastName) {
		
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Teacher() {
	
	
	}
    
	
}