package org.iesalixar.controller;

import java.io.Console;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOEmployee;
import org.iesalixar.dao.DAOEmployeeImpl;
import org.iesalixar.dao.DAOOffice;
import org.iesalixar.dao.DAOOfficeImpl;
import org.iesalixar.model.Employee;
import org.iesalixar.model.Office;

/**
 * Servlet implementation class AddEmpleadoServlet
 */
@WebServlet("/AddEmpleadoServlet")
public class AddEmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DAOOffice daoOfice = new DAOOfficeImpl();
		DAOEmployee daoEmployee = new DAOEmployeeImpl();
		
		List<Office> oficinas =  daoOfice.getAllOffices();
		List<Employee> jefes = daoEmployee.getAllEmployees();
		
		request.setAttribute("oficinas", oficinas);
		request.setAttribute("jefes", jefes);
				
		
		request.getRequestDispatcher("/WEB-INF/views/addEmpleado.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeNumber = request.getParameter("employeeNumber");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String extension = request.getParameter("extension");
		String email = request.getParameter("email");
		String jobTitle = request.getParameter("jobTitle");
		String oficina = request.getParameter("oficina");
		String jefe = request.getParameter("jefe");
		
		
		
		DAOEmployee daoEmployee = new DAOEmployeeImpl();
		
		Employee empleado = new Employee();
		
		empleado.setEmployeeNumber(Integer.parseInt(employeeNumber));
		empleado.setLastName(lastName);
		empleado.setFirstName(firstName);
		empleado.setEmail(email);
		empleado.setExtension(extension);		
		empleado.setJobTitle(jobTitle);
		empleado.setOfficeCode(oficina);
		empleado.setReportsTo(Integer.parseInt(jefe));
		
		
		daoEmployee.insertEmployee(empleado);
		
		
		response.sendRedirect(request.getContextPath()+"/Admin/MostrarEmpleados");

		}
	}
