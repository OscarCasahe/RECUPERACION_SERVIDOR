package org.iesalixar.dao;

import java.util.List;

import org.iesalixar.model.Employee;

public interface DAOEmployee {

	public Employee getEmployee(int employeeNumber);
	public List<Employee> getAllEmployees();
	public boolean insertEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean removeEmployee(int employeeNumber);	
	public int getNumberEmployee();	
	public Employee getDatosNombre(String firstName);
	public List<Employee> getAllEmployeesOficinaJefe();
	public List<Employee> getAllJefes();

}
