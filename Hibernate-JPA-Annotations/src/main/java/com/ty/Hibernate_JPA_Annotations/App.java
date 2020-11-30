package com.ty.Hibernate_JPA_Annotations;

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
    	Student s2=new Student();
    	s2.setName("ARJUN");
    	s2.setAddress("BENGALURU");
    	s2.setMobile(123456789);
    	entityManager.persist(s2);
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    	System.out.println("--->Disconnected");
    }
}
