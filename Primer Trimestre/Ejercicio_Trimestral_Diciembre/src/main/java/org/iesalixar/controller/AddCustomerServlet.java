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
 * Servlet implementation class AddCustomerServlet
 */
@WebServlet("/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DAOEmployee daoEmployee = new DAOEmployeeImpl();
		
		List<Employee> empleados = daoEmployee.getAllEmployees();
		
		request.setAttribute("empleados", empleados);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/addCustomer.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String customerNumber = request.getParameter("customerNumber");
		String customerName = request.getParameter("customerName");
		String contactLastName = request.getParameter("contactLastName");
		String contactFirstName = request.getParameter("contactFirstName");
		String phone = request.getParameter("phone");
		String dir1 = request.getParameter("dir1");
		String dir2 = request.getParameter("dir2");
		String ciudad = request.getParameter("ciudad");
		String estado = request.getParameter("estado");
		String cp = request.getParameter("cp");
		String pais = request.getParameter("pais");
		String employee = request.getParameter("employee");
		String creditLimit = request.getParameter("creditLimit");
		
		DAOCustomer daoCustomer = new DAOCustomerImpl();
		
		Customer customer = new Customer();
		
		customer.setCustomerNumber(Integer.parseInt(customerNumber));
		customer.setCustomerName(customerName);
		customer.setContactLastName(contactLastName);
		customer.setContactFirstName(contactFirstName);
		customer.setPhone(phone);
		customer.setAddressLine1(dir1);
		customer.setAddressLine2(dir2);
		customer.setCity(ciudad);
		customer.setState(estado);
		customer.setPostalCode(cp);
		customer.setCountry(pais);
		customer.setSalesRepEmployeeNumber(Integer.parseInt(employee));
		customer.setCreditLimit(Double.parseDouble(creditLimit));
		
		daoCustomer.insertCustomer(customer);
		
		response.sendRedirect(request.getContextPath()+"/Home");

		
	}

}
