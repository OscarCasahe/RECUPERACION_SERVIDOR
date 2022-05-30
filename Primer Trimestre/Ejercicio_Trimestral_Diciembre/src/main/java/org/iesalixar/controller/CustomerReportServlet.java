package org.iesalixar.controller;

import java.io.IOException;
import java.security.KeyStore.Entry.Attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOCustomer;
import org.iesalixar.dao.DAOCustomerImpl;
import org.iesalixar.model.Customer;

/**
 * Servlet implementation class CustomerReportServlet
 */
@WebServlet("/CustomerReportServlet")
public class CustomerReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String customerNumber = request.getParameter("cn");
		
		DAOCustomer daoCustomer = new DAOCustomerImpl();
		
		Customer customer = daoCustomer.getCustomer(Integer.parseInt(customerNumber));
		double pagos = daoCustomer.getSumCustomer(Integer.parseInt(customerNumber));
		int pedidos = daoCustomer.getCountCustomer(Integer.parseInt(customerNumber));
		
		request.setAttribute("customer", customer);
		request.setAttribute("pagos", pagos);
		request.setAttribute("pedidos", pedidos);
	
		request.getRequestDispatcher("/WEB-INF/views/customerReport.jsp").forward(request, response);

	}



}
