<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<fmt:setBundle basename="interface" />
</head>
<jsp:include page="../include/bootstrap.jsp" />

<body>



	<div class="container mt-5">
		<div class="row justify-content-center mt-5">


			<jsp:include page="../include/barra.jsp" />

			<div class="col-6">

			<form method="post">
						 <label for="customerNumber" class="form-label">Número de Cliente</label>
						 <input type="number" class="form-control" id="customerNumber" name="customerNumber" required>

						 <label for="customerName" class="form-label">Nombre de Cliente</label>
						 <input type="text" class="form-control" id="customerName" name="customerName" required>

						 <label for="contactFirstName" class="form-label">Nombre de la persona de contacto</label>
						 <input type="text" class="form-control" id="contactFirstName" name="contactFirstName" required>
						 
						 <label for="contactLastName" class="form-label">Apellido de la persona de contacto</label>
						 <input type="text" class="form-control" id="contactLastName" name="contactLastName" required>
						 
						 <label for="phone" class="form-label">Teléfono</label>
						 <input type="text" class="form-control" id="phone" name="phone" required>
						 

						 <label for="dir1" class="form-label">Dirección 1</label>
						 <input type="text" class="form-control" id="dir1" name="dir1" required>
						 
						 <label for="dir2" class="form-label">Dirección 2</label>
						 <input type="text" class="form-control" id="dir2" name="dir2" required>

						 <label for="ciudad" class="form-label">Ciudad</label>
						 <input type="text" class="form-control" id="ciudad" name="ciudad" required>
						 
						 <label for="estado" class="form-label">Estado</label>
						 <input type="text" class="form-control" id="estado" name="estado" required>
						 
						 <label for="cp" class="form-label">CP</label>
						 <input type="text" class="form-control" id="cp" name="cp" required>
						 
						 <label for="pais" class="form-label">País</label>
						 <input type="text" class="form-control" id="pais" name="pais" required>
						 
						<label for="employee" class="form-label">Empleado</label>
						<select class="form-control" name="employee" id="employee">
						
							<c:forEach items="${empleados}" var="e">
							
								<option  value="${e.employeeNumber}">${e.lastName}, ${e.firstName}</option>
							
							</c:forEach>
						
						</select><br>
						
						
						<label for="creditLimit" class="form-label">Límite de Crédito</label>
						 <input type="number" class="form-control" id="creditLimit" name="creditLimit" required>
						
						

						<input type="submit" class="btn btn-primary w-100 mt-3"><fmt:message key="add"></fmt:message>
					</form>

			</div>
		</div>
	</div>

</body>
</html>