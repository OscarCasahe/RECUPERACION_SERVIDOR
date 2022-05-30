<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<jsp:include page="include/bootstrap.jsp" />
<body>

	
	
		<div class="container mt-5">
		<div class="row justify-content-center mt-5">
						<jsp:include page="include/barra.jsp" />
		
			<div class="col-6">
			<c:if test="${sessionScope.role =='usuario'}">
			
			<h1 class="p-5">Categorías disponibles</h1>
			
			<ul>
			
				<c:forEach items="${productLines}" var="p">
					<li><a class="text-blue" href="${pageContext.request.contextPath}/MostrarProductos?tipo=${p.productLine}"> ${p.productLine}</a></li>
				</c:forEach>
			</ul>
			

			
			</c:if>

			<c:if test="${sessionScope.role =='admin'}">
			
						<h1 class="p-5">Operaciones disponibles</h1>
			
			
			<ul>
				<li><a class="text-blue" href="${pageContext.request.contextPath}/Admin/MostrarEmpleados"> Mostrar Empleados</a></li>
				<li><a class="text-blue" href="${pageContext.request.contextPath}/Admin/AddEmpleado"> Add Empleado</a></li>
			</ul>

			</c:if>


			</div>
			

		</div>
	</div>	
	
</body>
</html>