package com.ty.Hibernate_JPA_ManyToOne;

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
    	Teacher teacher = new Teacher();
    	Course course = new Course();
    	course.setCourseId(101);
    	course.setTitle("JAVA");
    	teacher.setLastName("Jhon");
    	teacher.setFirstName("Will");    	
    	course.setTeacher(teacher);

    	entityManager.persist(course);
    	System.out.println("Stored");
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	factory.close();
    }
}
