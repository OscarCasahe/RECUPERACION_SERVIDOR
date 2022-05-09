<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fmt:setBundle basename="interface" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Headliner</title>
</head>
<jsp:include page="../include/bootstrap.jsp" />

<body>



	<div class="container mt-5">
		<div class="row justify-content-center mt-5">


			<jsp:include page="../include/barra.jsp" />

			<div class="col-6">

			<c:if test="${error != null }">${error}</c:if>
			
			
			<c:if test="${error == null }">
			<form method="post" action="${pageContext.request.contextPath}/Admin/ChangeOrderCustomer">
		
						<h2>Order Code: ${order.orderNumber}</h2>
		
						<label for="customer" class="form-label">CUSTOMER</label>
						<select class="form-control" name="customer" id="customer">
						
							<c:forEach items="${customers}" var="c">
							
								
								<c:if test="${order.customerNumber != c.customerNumber}"><option  value="${c.customerNumber}" >${c.customerName}</option></c:if>
								<c:if test="${order.customerNumber == c.customerNumber}"><option  value="${c.customerNumber}" selected>${c.customerName}</option></c:if>
							
							</c:forEach>
						
						</select><br>
						
						 <input type="hidden" class="form-control" id="orderId" name="orderId" value="${order.orderNumber}">
												

						<input type="submit" class="btn btn-primary w-100 mt-3" value="<fmt:message key="changeC"></fmt:message>">
					</form>
			</c:if>
			

			</div>
		</div>
	</div>

</body>
</html>