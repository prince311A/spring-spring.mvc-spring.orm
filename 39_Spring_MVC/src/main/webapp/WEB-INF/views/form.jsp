<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- 	This library is used to show the error of BindingResult -->
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Form Page</title>
</head>
<body>
	<h1>This is Form Input Page</h1>
	<h2>Sending data from view to Controller Dynamically</h2>
	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Registration Page</h4>
						<!-- To show error -->
						<h3><form:errors path="user.*"></form:errors></h3>
						
						
						<form action="submit-form" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Enter Full Name*</label> <input
									type="text" class="form-control" id="name"
									aria-describedby="emailHelp" placeholder="Enter Name"
									required="required" name="name">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address*</label> <input
									type="email" class="form-control" id="email"
									aria-describedby="emailHelp" placeholder="Enter email"
									required="required" name="email">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Phone*</label> <input
									type="number" class="form-control" id="phone"
									aria-describedby="emailHelp" placeholder="Enter Phone Number"
									required="required" name="phone">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="password"
									placeholder="Enter Password" required="required"
									name="password">
							</div>
							<div class="text-center p-2">
								<button type="submit"
									class="btn btn-primary btn-block btn-sm p-2">Register</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>