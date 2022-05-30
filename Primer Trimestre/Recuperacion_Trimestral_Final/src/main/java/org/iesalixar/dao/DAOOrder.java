package org.iesalixar.dao;

import java.util.ArrayList;

import org.iesalixar.model.Order;

public interface DAOOrder {
	
	public Order getOrder(int orderNumber);
	public ArrayList<Order> getAllOrders();
	public boolean insertOrder(Order order);
	public boolean updateOrder(Order order);
	public boolean removeOrder(int orderNumber);
	public boolean updateSalesRepEmployeeNumber( int customerNumber, int orderNumber);
	public boolean updateOrderCustomer(int orderNumber, int customerNumber);


}
