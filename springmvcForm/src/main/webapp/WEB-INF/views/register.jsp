<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script language="javascript">
	function chkvalidation() {
		let x = 0;
		
		if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myRegisterForm.email.value))
		  {
		    return (true)
		  }
		    alert("You have entered an invalid email address!")
		    return (false)
		  
	}
</script>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Register User</title>
</head>
<body onload="">
	<div class="container">
		<div class="jumbotron" style="margin: 45px 0px">
			<h2 class="text-center">Register User</h2>
		</div>

		<form name="myRegisterForm" method="POST" action="register"
			onsubmit="return chkvalidation()">

			<div class="form-group">
				<label for="exampleInputUsername">User Name</label> <input
					type="text" class="form-control" id="username"
					aria-describedby="name" placeholder="Enter username"
					name="username" required>
			</div>

			<div class="form-group">
				<label for="exampleInputPassword">Password</label> <input
					type="password" class="form-control" id="password"
					placeholder="Enter Password" name="password" required>
			</div>

			<div class="form-group">
				<label for="exampleInputFirstName">First Name</label> <input
					type="text" class="form-control" id="firstname"
					placeholder="Enter First Name" name="firstname" required>
			</div>

			<div class="form-group">
				<label for="exampleInputLastName">Last Name</label> <input
					type="text" class="form-control" id="lastname"
					placeholder="Enter Last Name" name="lastname" required>
			</div>

			<div class="form-group">
				<label for="exampleInputEmail">Email</label> <input type="email"
					class="form-control" id="email" placeholder="Enter Email"
					name="email" required>
			</div>

			<div class="form-group">
				<label for="exampleInputAddress">Address</label> <input type="text"
					class="form-control" id="address" placeholder="Enter Address"
					name="address">
			</div>

			<div class="form-group">
				<label for="exampleInputPhone">Phone Number</label> <input
					type="text" class="form-control" id="phone"
					placeholder="Enter Phone" name="phone">
			</div>



			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		</head>
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
			integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
			integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
			crossorigin="anonymous"></script>
		<body>

		</body>
</html>
