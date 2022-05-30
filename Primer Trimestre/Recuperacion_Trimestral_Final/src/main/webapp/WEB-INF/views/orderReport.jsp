<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<fmt:setBundle basename="interface" />
</head>
<jsp:include page="include/bootstrap.jsp" />

<body>



	<div class="container mt-5">
		<div class="row justify-content-center mt-5">


			<jsp:include page="include/barra.jsp" />

			<div class="col-10">



				<h1>Order Report</h1>
				
				<h2>Order Code: ${order.orderNumber}</h2>
				

				<table class="table table-striped">
					<thead>
						<tr>
							<th>Product Name</th>
							<th>Quantity</th>
							<th>Price Each</th>

						</tr>
					</thead>
					<tbody>

						<c:forEach items="${orderDetails}" var="o">
							<tr>
								<td>${o.productName}</td>
								<td>${o.quantityOrdered}</td>
								<td>${o.priceEach}</td>

						</c:forEach>

					</tbody>
				</table>



			</div>
		</div>
	</div>

</body>
</html>