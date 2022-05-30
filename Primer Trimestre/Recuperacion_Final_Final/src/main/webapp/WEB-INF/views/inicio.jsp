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

				<c:if test="${sessionScope.role =='admin'}">
					<button type="button" class="btn btn-primary">
						<a class="text-white" href="${pageContext.request.contextPath}/Admin/AddCustomer"><fmt:message key="addClient" /></a>

					</button>
				</c:if>


				<table class="table table-striped">
					<thead>
						<tr>
							<th>Número de Cliente</th>
							<th>Nombre del Cliente</th>
							<th>Nombre de Contacto</th>
							<th>Apellidos del Contacto</th>
							<th>Teléfono</th>
							<th>Opciones</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${customers}" var="c">
							<tr>
								<td>${c.customerNumber}</td>
								<td>${c.customerName}</td>
								<td>${c.contactFirstName}</td>
								<td>${c.contactLastName}</td>
								<td>${c.phone}</td>
								<td><c:if test="${sessionScope.role =='admin'}">
										<a
											href="${pageContext.request.contextPath}/Admin/ChangeAssigment?cn=${c.customerNumber }"><i
											class="bi bi-people-fill"></i></a>
									</c:if> <c:if test="${sessionScope.role =='usuario'}">
										<a
											href="${pageContext.request.contextPath}/CustomerReport?cn=${c.customerNumber }"><i
											class="bi bi-eye-fill"></i></a>
									</c:if></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>


				<c:if test="${sessionScope.role =='admin'}">
					<button type="button" class="btn btn-primary">
						<a class="text-white"
							href="${pageContext.request.contextPath}/Admin/AddCustomer"><fmt:message
								key="addClient" /></a>

					</button>
				</c:if>

			</div>
		</div>
	</div>

</body>
</html>