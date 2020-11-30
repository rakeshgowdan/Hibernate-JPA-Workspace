package com.ty.CRM_Tool.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ty.CRM_Tool.config.EntityMangerBeanInstance;
import com.ty.CRM_Tool.dto.Customer;

public class CustomerDaoImple implements CustomerDao{

	EntityManager entityManager;
	public boolean addCustomer(Customer customer) {
		entityManager=EntityMangerBeanInstance.getEntityInstance();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		EntityMangerBeanInstance.closeResources();
		return true;
	}

	public boolean updateCustomer(int cid, Customer customer) {
		entityManager=EntityMangerBeanInstance.getEntityInstance();
		entityManager.getTransaction().begin();
		Customer c=new Customer();
		c.setCustomerId(cid);
		c.setName(customer.getName());
		c.setAddress(customer.getAddress());
		entityManager.merge(c);
		entityManager.getTransaction().commit();
		EntityMangerBeanInstance.closeResources();
		return true;
	}

	public boolean deleteCustomer(int cid) {
		entityManager=EntityMangerBeanInstance.getEntityInstance();
		entityManager.getTransaction().begin();
		/*Customer c=entityManager.getReference(Customer.class, cid);
		entityManager.remove(c);
		entityManager.getTransaction().commit();*/
		Query namedQuery = entityManager.createNamedQuery("Customer.removeById");
	    namedQuery.setParameter("id", cid);
	    System.out.println(namedQuery.executeUpdate());
		EntityMangerBeanInstance.closeResources();
		return true;
	}

	public List<Customer> searchCustomer(String name) {
		entityManager=EntityMangerBeanInstance.getEntityInstance();
		entityManager.getTransaction().begin();
		List<Customer> customerList=new ArrayList<>();
		TypedQuery<Customer> query=entityManager.createQuery("FROM Customer WHERE name=:cname", Customer.class);
		query.setParameter("cname", name);
		customerList=query.getResultList();
		EntityMangerBeanInstance.closeResources();
		return customerList;
	}

	public List<Customer> fetchAllCustomers() {
		entityManager=EntityMangerBeanInstance.getEntityInstance();
		List<Customer> customerList=new ArrayList<>();
		TypedQuery<Customer> query=entityManager.createQuery("FROM Customer", Customer.class);
		customerList=query.getResultList();
		EntityMangerBeanInstance.closeResources();
		return customerList;
	}

	

}
