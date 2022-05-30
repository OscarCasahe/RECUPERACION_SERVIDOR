package org.iesalixar.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOCustomer;
import org.iesalixar.dao.DAOCustomerImpl;
import org.iesalixar.model.Customer;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/InicioServlet")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		DAOCustomer daoCustomer = new DAOCustomerImpl();
		
		ArrayList<Customer> customers = daoCustomer.getAllCustomers();
		
		request.setAttribute("customers", customers);
		
		request.getRequestDispatcher("/WEB-INF/views/inicio.jsp").forward(request, response);
	}

}
