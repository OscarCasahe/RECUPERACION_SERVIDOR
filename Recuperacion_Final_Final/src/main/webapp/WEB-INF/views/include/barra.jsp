<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<fmt:setBundle basename="interface" />

<c:if test="${sessionScope.usuario!=null}">
	<div class="row bg-primary justify-content-between mb-3" >
		<div class="col-4 text-start">
			
			<p class="text-white p-2">
			<a class="text-white mr-3" href="${pageContext.request.contextPath}/Home">Inicio</a>
			<c:if test="${sessionScope.role =='admin'}"><a class="text-white" href="${pageContext.request.contextPath}/Admin/AddCustomer"><fmt:message key="addClient" /></a></c:if>
			</p>  
		</div>
		
		<div class="col-4 text-middle">			
			<p class=" text-white p-2">

			<c:if test="${sessionScope.role =='usuario'}"><c:out value="ZONA DE USUARIO" /></c:if>
			<c:if test="${sessionScope.role =='admin'}"><c:out value="ZONA DE ADMIN" /></c:if>

			</p>  
		</div>	
		
		<div class="col-4 text-end">			
			<p class=" text-white p-2">

				<a class="text-white" href="${pageContext.request.contextPath}/Logout">Salir</a>
			</p>  
		</div>	
	</div>
</c:if>