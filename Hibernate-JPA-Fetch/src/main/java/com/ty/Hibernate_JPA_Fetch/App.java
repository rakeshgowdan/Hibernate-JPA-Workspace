package com.ty.Hibernate_JPA_Fetch;

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
    	Student student=entityManager.find(Student.class, 1);
    	//Passport passport=student.getPassport();
    	//String passportNumber=passport.getPassportNumber();
    	//System.out.println("Passport Number is "+passportNumber);
    	System.out.println(student.getName());
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    	
    }
}
