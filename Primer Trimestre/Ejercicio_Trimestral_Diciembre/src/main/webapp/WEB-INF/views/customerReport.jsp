<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Report</title>
<fmt:setBundle basename="interface" />
</head>
<jsp:include page="include/bootstrap.jsp" />

<body>



	<div class="container mt-5">
		<div class="row justify-content-center mt-5">


			<jsp:include page="include/barra.jsp" />

			<div class="col-6">

		
						<h2>Nombre del Cliente: ${customer.customerName}</h2>
						<h2>Total de pagos: ${pagos }€</h2>
						<h2>Número de pedidos: ${pedidos } </h2>
		
						
						
												


			</div>
		</div>
	</div>

</body>
</html>