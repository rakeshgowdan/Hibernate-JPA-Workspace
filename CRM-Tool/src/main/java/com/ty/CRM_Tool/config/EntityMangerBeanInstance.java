package com.ty.CRM_Tool.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMangerBeanInstance  {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	public static EntityManager getEntityInstance() {
		
		factory = Persistence.createEntityManagerFactory("UsersDB");
	 	entityManager = factory.createEntityManager();
	 	return entityManager;
	 	
	}


	public static void closeResources()  {
		entityManager.close();
		factory.close();
		
	}
}
