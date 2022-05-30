<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Assigment</title>
<fmt:setBundle basename="interface" />
</head>
<jsp:include page="../include/bootstrap.jsp" />

<body>



	<div class="container mt-5">
		<div class="row justify-content-center mt-5">


			<jsp:include page="../include/barra.jsp" />

			<div class="col-6">

			<form method="post">
		
						<h2>CLIENTE: ${customer.customerName}</h2>
						<h2>CONTACT EN CLIENTE: ${customer.contactFirstName}${customer.contactLastName}</h2>
		
						<label for="employeeAssigned" class="form-label">Empleado Asignado</label>
						<select class="form-control" name="employeeAssigned" id="employeeAssigned">
						
							<c:forEach items="${empleados}" var="e">
							
								<option  value="${e.employeeNumber}">${e.lastName},${e.firstName}</option>
								
								<c:if test=""><option  value="${e.employeeNumber}">${e.LastName},${e.FirstName}</option></c:if>
							
							</c:forEach>
						
						</select><br>
						
												

						<input type="submit" class="btn btn-primary w-100 mt-3"><fmt:message key="add"></fmt:message>
					</form>

			</div>
		</div>
	</div>

</body>
</html>