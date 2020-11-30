package com.ty.Hibernate_JPA_OneToMany;

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
    	Teacher foundTeacher = entityManager.find(Teacher.class, 1);
    	System.out.println(foundTeacher);
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    }
}
