package org.iesalixar.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOCustomer;
import org.iesalixar.dao.DAOCustomerImpl;
import org.iesalixar.dao.DAOOrder;
import org.iesalixar.dao.DAOOrderImpl;
import org.iesalixar.model.Customer;
import org.iesalixar.model.Order;

/**
 * Servlet implementation class ChangeOrderCustomerServlet
 */

public class ChangeOrderCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeOrderCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderNumber = request.getParameter("on");

		if(orderNumber == null) {
			
			request.setAttribute("error", "No se ha recibido ningún dato");
			
		}else {
			
			DAOCustomer daoCustomer = new DAOCustomerImpl();
			DAOOrder daoOrder = new DAOOrderImpl();
			
			Order order = daoOrder.getOrder(Integer.parseInt(orderNumber));
			List<Customer> customers = daoCustomer.getAllCustomers();
			
			request.setAttribute("order", order);
			request.setAttribute("customers", customers);
		}
		
		
		request.getRequestDispatcher("/WEB-INF/views/admin/changeOrderCustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String orderNumber = (String) request.getParameter("orderId");
		String customerNumber = (String) request.getParameter("customer");
		
	
		
		
		DAOOrder daoOrder = new DAOOrderImpl();
		daoOrder.updateOrderCustomer(Integer.parseInt(orderNumber), Integer.parseInt(customerNumber));
		
		response.sendRedirect(request.getContextPath()+"/Home");

		
	}

}
