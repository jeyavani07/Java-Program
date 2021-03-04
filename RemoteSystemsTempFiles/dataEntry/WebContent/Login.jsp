<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<style>
table {
	border: 1px solid black;
	border-radius: 15px;
	border-width: 2px;
}

td {
	padding: 20px;
}

a {
	text-decoration: none;
}
</style>
<script>
function validate(){
	var pass = document.forms["login"]["pass"].value;
	var uname = document.forms["login"]["uname"].value;

	if(uname == null || uname == "" ){
	    alert("User Name cannot be empty");
	    return false;
	}
	if(pass == null || pass == ""){
	    alert("Password cannot be empty");
	    return false;
	}
	return true;
	
}

</script>
</head>
<body>
	<br>
	<br>
	<form name="login"
		action="Login"
		method="post" onsubmit="return validate()">
		<table align="center">
			<tr>
				<td colspan=2><h1 align="center">Sign in</h1></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit"
					value="Sign in"></td>
			</tr>
		</table>
	</form>
	<p align="center">
		Not having an account? click to <span><a href="SignUp.jsp"
			style="color: red"> Sign up</a></span>
	</p>
</body>
</html>