package com.ty.Hibernate_JPA_TableCreation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
    	EntityManager entityManager = factory.createEntityManager();
    	entityManager.getTransaction().begin();
    	
    	System.out.println("--->Connected");
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    	System.out.println("--->Disconnected");
    }
}
