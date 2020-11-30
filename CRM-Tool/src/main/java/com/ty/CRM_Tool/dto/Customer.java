package com.ty.CRM_Tool.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customers")
@NamedQuery(name="Customer.removeById",query="Delete  FROM Customer C WHERE customerId=:id")
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;
	private String name;
	private String address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", Name=" + name + ", address=" + address + "]";
	}
	
}
