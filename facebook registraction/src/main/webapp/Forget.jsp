<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
body {
	background-color: rgb(210, 64, 210);
}

#form {
	background-color: white;
	width: 30%;
	height: 400px;
	margin-left: 480px;
	margin-top: 120px;
	border-radius: 10px;
	text-align: center;
}

#lab {
	text-align: left;
	padding-left: 50px;
	padding-right: 50px;
	color: darkgrey;
}

.but {
	text-align: center;
	margin-left: 10px;
	padding-left: 135px;
	padding-right: 135px;
	padding-top: 10px;
	padding-bottom: 10px;
	color: white;
	background-color: rgb(77, 77, 139);
	border-radius: 25px;
}

#fab {
	color: darkgray;
}
</style>
</head>
<body>
	<form action="ForgetExp" method="post">
		<div id="form">
			<h1>FORGET PASSWORD</h1>
			<hr>
			<br>
			<br>
			<div id="lab">
				
				<hr>
				<br>
				<input type="text" name="email" placeholder="email"
					style="border: 0ch;">
				<hr>
				<br>
				<input type="text" name="password" placeholder="NewPassword"
					" style="border: 0ch;">
				<hr>
				<br>
			</div>
			<b><input type="submit" value="forget" class="but"></b><br>
			<br>
		</div>
</body>
</html>