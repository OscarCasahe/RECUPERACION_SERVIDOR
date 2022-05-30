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


				<h1>Orders Table</h1>

				<table class="table table-striped">
					<thead>
						<tr>
							<th>Order Number</th>
							<th>Order Date</th>
							<th>Shipped Date</th>
							<th>Status</th>
							<th></th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${orders}" var="o">
							<tr>
								<td>${o.orderNumber}</td>
								<td>${o.orderDate}</td>
								<td>${o.shippedDate}</td>
								<td>${o.status}</td>
								<td><c:if test="${sessionScope.role =='admin'}">
										<a
											href="${pageContext.request.contextPath}/Admin/ChangeOrderCustomer?on=${o.orderNumber }"><i
											class="bi bi-people-fill"></i></a>
									</c:if> <c:if test="${sessionScope.role =='usuario'}">
										<a
											href="${pageContext.request.contextPath}/OrderReport?on=${o.orderNumber }"><i
											class="bi bi-eye-fill"></i></a>
									</c:if></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>




			</div>
		</div>
	</div>

</body>
</html>