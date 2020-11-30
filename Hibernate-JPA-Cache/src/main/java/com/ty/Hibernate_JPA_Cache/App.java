package com.ty.Hibernate_JPA_Cache;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
    	EntityManager entityManager = factory.createEntityManager();
    	entityManager.getTransaction().begin();
    	System.out.println("--->Connected---Transaction Started");
    	String sql = "SELECT u from User u where u.email = 'bill.joy@gmail.com'";
    	Query query = entityManager.createQuery(sql);
    	List<User>li=  (List<User>) query.getResultList();
    	 
    	for(User u:li) {
    		System.out.println(u.getEmail()+" "+u.getFullname()+" "+u.getPassword());
    	}
    
    	entityManager.getTransaction().commit();
    	System.out.println("--->Transaction Commited");
    	
    	entityManager.close();
    	factory.close();
    	System.out.println("--->Disconnected");
    }
}
