<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<jsp:include page="include/bootstrap.jsp" />
<body>

	
	
		<div class="container mt-5">
		<div class="row justify-content-center mt-5">
		
			<div class="col-6">
				<h1>LOGIN</h1>
			
					<form method="post">
						<label for="email" class="form-label">Email</label>
						 <input type="text" class="form-control" id="email" name="email" required>
						 
						<label for="password" class="form-label mt-3">Password</label>
						<input type="password" class="form-control" id="password" name="password" required>
						
						

						<input type="submit" class="btn btn-primary w-100 mt-3" value="LOGIN">
					</form>


			</div>
			

		</div>
	</div>	
	
</body>
</html>