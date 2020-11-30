package com.ty.CRM_Tool.service;

import java.util.List;

import com.ty.CRM_Tool.dao.CustomerDao;
import com.ty.CRM_Tool.dao.CustomerDaoImple;
import com.ty.CRM_Tool.dto.Customer;

public class CustomerServiceImple implements CustomerService {

	CustomerDao customerDao = new CustomerDaoImple();

	public boolean addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	public boolean updateCustomer(int cid, Customer customer) {
		return customerDao.updateCustomer(cid, customer);
	}

	public boolean deleteCustomer(int cid) {
		return customerDao.deleteCustomer(cid);
	}

	public List<Customer> searchCustomer(String name) {
		return customerDao.searchCustomer(name);
	}

	public List<Customer> fetchAllCustomers() {
		return customerDao.fetchAllCustomers();
	}

}
