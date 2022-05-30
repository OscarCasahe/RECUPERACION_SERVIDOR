<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Empleados</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<jsp:include page="include/bootstrap.jsp" />

<body>

	
	
		<div class="container mt-5">
		<div class="row justify-content-center mt-5">

			
		<jsp:include page="include/barra.jsp" />
		<button><a href="${pageContext.request.contextPath}/Admin/AddEmpleado">Add Empleado</a></button>
		<div class="col-10">	
			
		<h1>Empleados</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Número</th>
					<th>Apellidos</th>
					<th>Nombre</th>
					<th>Puesto</th>
					<th>Oficina</th>
					<th>Jefe</th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${empleados}" var="e">
					<tr>
						<td>${e.employeeNumber}</td>
						<td>${e.lastName}</td>
						<td>${e.firstName}</td>
						<td>${e.jobTitle}</td>
						<td>${e.oficina}</td>
						<td>${e.jefe}</td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
		</div>		
		</div>
	</div>	
	
</body>
</html>