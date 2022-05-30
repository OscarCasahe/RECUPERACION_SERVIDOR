package org.iesalixar.dao;

import java.util.ArrayList;

import org.iesalixar.model.Customer;


public interface DAOCustomer {
	
	public Customer getCustomer(int customerNumber);
	public ArrayList<Customer> getAllCustomers();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean removeCustomer(int customerNumber);
	public int getNumberCustomer();
	public int getCountCustomer(int customerNumber);
	public Double getSumCustomer(int customerNumber);
	

}



