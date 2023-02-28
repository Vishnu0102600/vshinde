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
		<h1 style="color: blue;">facebook</h1>
		<hr>
		<p>
			<b>Log in to Facebook</b>
		</p>
		<form action="LogIn" method="post">
			<table>
				<tr>
					<td><input type="text" placeholder="email
					address"
						name="email" required></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="Enter password"
						name="password" required></td>
				</tr>
			</table>
			<button style="background-color: skyblue;" type="submit"
				class="Log in">
				<b>Log in</b>
			</button>
			<br> <a href="Forget.jsp"> forgotten account?</a> <br> <a
				href="SignUp.jsp"> sign up for Facebook</a>

		</form>
	</center>

</body>
</html>