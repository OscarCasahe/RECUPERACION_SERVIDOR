package org.iesalixar.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.dao.DAOEmployee;
import org.iesalixar.dao.DAOEmployeeImpl;
import org.iesalixar.model.Employee;

/**
 * Servlet implementation class MostrarEmpleadosServlet
 */
@WebServlet(name = "MostrarEmpleadosServlet", urlPatterns = { "/MostrarEmpleadosServlet" })
public class MostrarEmpleadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarEmpleadosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		DAOEmployee employeeDao = new DAOEmployeeImpl();
		
		List<Employee> empleados = employeeDao.getAllEmployeesOficinaJefe();
		
		
		request.setAttribute("empleados", empleados);

		
		request.getRequestDispatcher("/WEB-INF/views/mostrarEmpleados.jsp").forward(request, response);
	}

}
