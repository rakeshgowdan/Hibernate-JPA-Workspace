package com.ty.CRM_Tool;

import java.util.List;
import java.util.Scanner;

import com.ty.CRM_Tool.dto.Customer;
import com.ty.CRM_Tool.service.CustomerService;
import com.ty.CRM_Tool.service.CustomerServiceImple;

public class CrmDriver 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       Customer c=new Customer();
       CustomerService cs=new CustomerServiceImple();
       //Adding
		/*
		 * System.out.println("Enter the Name"); c.setName(sc.next());
		 * System.out.println("Enter the address"); c.setAddress(sc.next());
		 * System.out.println(cs.addCustomer(c));
		 */
     //  delete
		/*
		 * System.out.println("Enter the ID"); int cid=sc.nextInt();
		 * System.out.println(cs.deleteCustomer(cid));
		 */
       
      // search
		/*
		 * System.out.println("Enter the name of customer to search"); String
		 * name=sc.next(); List<Customer>listOfCustomers=cs.searchCustomer(name);
		 * System.out.println(listOfCustomers);
		 */
      // update
        System.out.println("enter the id to update");
       int cid=sc.nextInt();
       Customer newCustomer=new Customer();
       System.out.println("enter the updated Name");
       newCustomer.setName(sc.next());
       System.out.println("enter the Updated address");
       newCustomer.setAddress(sc.next());
       System.out.println(cs.updateCustomer(cid, newCustomer));
       
       sc.close();
    }
}
