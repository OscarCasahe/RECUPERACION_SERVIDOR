<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Empleado</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<jsp:include page="include/bootstrap.jsp" />
<body>

	
	
		<div class="container mt-5">
		<div class="row justify-content-center mt-5">
		
			<div class="col-6">
			
					<form method="post">
						 <label for="employeeNumber" class="form-label">Número de Empleado</label>
						 <input type="number" class="form-control" id="employeeNumber" name="employeeNumber" required>

						 <label for="lastName" class="form-label">Apellidos</label>
						 <input type="text" class="form-control" id="lastName" name="lastName" required>

						 <label for="firstName" class="form-label">Nombre</label>
						 <input type="text" class="form-control" id="firstName" name="firstName" required>
						 
						 <label for="email" class="form-label">Email</label>
						 <input type="text" class="form-control" id="email" name="email" required>
						 

						 <label for="extension" class="form-label">Extensión</label>
						 <input type="text" class="form-control" id="extension" name="extension" required>

						 <label for="jobTitle" class="form-label">Puesto</label>
						 <input type="text" class="form-control" id="jobTitle" name="jobTitle" required>
						 
						<label for="oficina" class="form-label">Oficina</label>
						<select class="form-control" name="oficina" id="oficina">
						
							<c:forEach items="${oficinas}" var="o">
							
								<option  value="${o.officeCode}">${o.city}</option>
							
							</c:forEach>
						
						</select><br>
						
						
						<label for="jefe" class="form-label">Jefe</label>
						<select class="form-control" name="jefe" id="jefe">
						
							<c:forEach items="${jefes}" var="j">
							
								<option  value="${j.employeeNumber}">${j.lastName}</option>
							
							</c:forEach>
						
						</select><br>
						 

						 
						
						

						<input type="submit" class="btn btn-primary w-100 mt-3" value="Add Empleado">
					</form>


			</div>
			

		</div>
	</div>	
	
</body>
</html>