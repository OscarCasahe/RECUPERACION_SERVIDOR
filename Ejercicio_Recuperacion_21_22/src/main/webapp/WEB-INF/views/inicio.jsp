<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt"     uri="http://java.sun.com/jstl/fmt_rt"   %>
<fmt:setBundle basename="interface" />
</head>
<jsp:include page="include/bootstrap.jsp" />

<body>

	
	
		<div class="container mt-5">
		<div class="row justify-content-center mt-5">

			
		<jsp:include page="include/barra.jsp" />
		
		<div class="col-10">	
			
						<c:if test="${sessionScope.role =='admin'}"><button type="button" class="btn btn-primary"><fmt:message key="addClient" /></button></c:if>
			

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Número de Cliente</th>
					<th>Nombre del Cliente</th>
					<th>Número de Contacto</th>
					<th>Apellidos del Contacto</th>
					<th>Teléfono</th>
					<th>Opciones</th>
				</tr>
			</thead>
			<tbody>
			
<%-- 				<c:forEach items="${productos}" var="p"> --%>
<!-- 					<tr> -->
<%-- 						<td>${p.productName}</td> --%>
<%-- 						<td>${p.productDescription}</td> --%>
<%-- 						<td>${p.productVendor}</td> --%>
<%-- 						<td>${p.buyPrice}</td> --%>
<%-- 						<td>${p.quantityInStock}</td> --%>
<!-- 					</tr> -->
<%-- 				</c:forEach> --%>
				
			</tbody>
		</table>
		
		
		<c:if test="${sessionScope.role =='admin'}"><button type="button" class="btn btn-primary"><fmt:message key="addClient" /></button></c:if>
		
		</div>		
		</div>
	</div>	
	
</body>
</html>