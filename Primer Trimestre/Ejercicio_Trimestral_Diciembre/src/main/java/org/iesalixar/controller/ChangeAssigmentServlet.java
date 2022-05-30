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
import org.iesalixar.dao.DAOEmployee;
import org.iesalixar.dao.DAOEmployeeImpl;
import org.iesalixar.model.Customer;
import org.iesalixar.model.Employee;

/**
 * Servlet implementation class ChangeAssigmentServlet
 */
@WebServlet("/ChangeAssigmentServlet")
public class ChangeAssigmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeAssigmentServlet() {
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
		
		DAOEmployee daoEmployee = new DAOEmployeeImpl();
		List<Employee> empleados = daoEmployee.getAllEmployees();
		
		request.setAttribute("empleados", empleados);
		request.setAttribute("customer", customer);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/changeAssigment.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String asigment = request.getParameter("asig");
		
		response.sendRedirect(request.getContextPath()+"/Home");
	}

}
