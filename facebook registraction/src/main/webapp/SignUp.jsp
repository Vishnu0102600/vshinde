<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1 style="color: blue;">SignUp</h1>
		<h2>create a new account.</h2>
		<p>It's quick and easy</p>

		<form action="SignUp" method="post">
			<table>
				<tr>
					<td><input type="text" placeholder="Enter email
					address"
						name="email" required></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="New password"
						name="password" required></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Enter name" name="name"
						required></td>
					<td><input type="text" placeholder=" Enter surname"
						name="surname" required></td>
				</tr>




				<tr>
					<td>Date of birth: <br> <input type="DOB" name="DOB"
						required></td>
				</tr>
			</table>
			Gender: <input type="radio" id="female" name="gender" value="Female">
			  <label for="female">Female</label> <input type="radio" id="male"
				name="gender" value="Male"> <label for="male">Male</label> <input
				type="radio" id="custom" name="gender"Custom"> <label
				for="custom">Custom</label><br> <br>
			<button style="background-color: green;" type="submit" class="signup">Sign
				Up</button>
			<br> <a href="LogIn.jsp"> Already have an account ? </a>


		</form>

	</center>
</body>
</html>