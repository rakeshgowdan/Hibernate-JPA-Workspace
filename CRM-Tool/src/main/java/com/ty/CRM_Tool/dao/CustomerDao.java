package com.ty.CRM_Tool.dao;

import java.util.List;

import com.ty.CRM_Tool.dto.Customer;

public interface CustomerDao {
	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(int cid,Customer Customer);
	public boolean deleteCustomer(int cid);
	public List<Customer> searchCustomer(String name);
	public List<Customer> fetchAllCustomers();
}
