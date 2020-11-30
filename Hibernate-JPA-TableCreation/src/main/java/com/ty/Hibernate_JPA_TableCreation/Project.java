package com.ty.Hibernate_JPA_TableCreation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	private int projectId;
	private String projectDescription;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	
}
