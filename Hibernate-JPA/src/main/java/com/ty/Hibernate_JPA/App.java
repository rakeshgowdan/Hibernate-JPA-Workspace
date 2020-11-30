package com.ty.Hibernate_JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
    	//Persistence.createEntityManagerFactory will provide EntityManagerFactory instance
    	//using the persistence-unit that we have provided in the persistence.xml file
    	EntityManager entityManager = factory.createEntityManager();
    	//entityManagerFactory.createEntityManager() will create EntityManager instance 
    	//for us to use. Every time we call createEntityManager() method, it will return 
    	//a new instance of EntityManager. 
    	entityManager.getTransaction().begin();
    	//entityManager.getTransaction().begin() method first pulls the transaction 
    	//from current persistence context and then begins the transaction using begin() method
    	TypedQuery<User> query=entityManager.createQuery("FROM User", User.class);
    	List<User>userList=query.getResultList();
    	for(User u:userList) {
    		System.out.println(u.getFullname()+"--"+u.getEmail());
    	}
    	System.out.println("----------------------------------");
   
    	User u=entityManager.find(User.class, 1);
    	System.out.println(u);
    	//entityManager.getTransaction.commit() method is used to fetch the transaction and 
    	//then to commit the same transaction. This will commit all the changes to database.
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    }
}
