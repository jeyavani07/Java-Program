<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<style>
table {
	border: 1px solid black;
	border-width: 2px;
	border-radius: 15px;
}

td {
	padding: 20px;
}

input {
	border-radius: 2px;
}
</style>
<script>
function validate(){
	var pass = document.forms["signUp"]["pass"].value;
	var cpass = document.forms["signUp"]["cpass"].value;
	var uname = document.forms["signUp"]["uname"].value;

	if(uname == null || uname == "" ){
	    alert("User Name cannot be empty");
	    return false;
	}
	if(pass == null || pass == ""){
	    alert("Password cannot be empty");
	    return false;
	}
	if (pass != cpass) {
	    alert("Password and Confirm Password do not match");
	    return false;
	}
}
</script>
</head>
<body>
	<br>
	<br>
	<br>
	<form name="signUp" action="SignUp" method="post"
		onsubmit="return validate()">
		<table align=center>
			<tr>
				<td colspan=2><h1 align="center">Sign Up</h1></td>
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
				<td>Confirm Password</td>
				<td><input type="password" name="cpass"></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit"
					value="Sign Up"></td>
			</tr>
		</table>
	</form>
</body>
</html>