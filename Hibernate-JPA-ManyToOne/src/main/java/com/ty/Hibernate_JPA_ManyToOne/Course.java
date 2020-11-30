package com.ty.Hibernate_JPA_ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private int courseId;
    private String title;
    @ManyToOne(optional = false,cascade=CascadeType.ALL)
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "teacherId")
    private Teacher teacher;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", teacher=" + teacher + "]";
	}
	public Course(int courseId, String title) {
		this.courseId = courseId;
		this.title = title;

	}
	public Course() {
		
	}
    
    
    
}
