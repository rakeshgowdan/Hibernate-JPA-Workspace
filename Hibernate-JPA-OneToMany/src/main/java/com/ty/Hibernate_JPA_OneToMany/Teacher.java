package com.ty.Hibernate_JPA_OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	private int teacherId;
    private String firstName;
    private String lastName;
    @OneToMany
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "teacherId")
    private List<Course> courses;
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
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Teacher [firstName=" + firstName + ", lastName=" + lastName + ", courses=" + courses + "]";
	}
    
    
}