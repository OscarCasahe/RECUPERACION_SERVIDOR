package org.iesalixar.dao;

import java.util.ArrayList;

import org.iesalixar.model.OrderDetail;

public interface DAOOrderDetails {
	
	public ArrayList<OrderDetail> getDetailsFromOrder(int orderNumber);
	public ArrayList<OrderDetail> getAllOrderDetailsFromOrder(int orderNumber);
}
