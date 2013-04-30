<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>${error}</div>
	<form:form method="POST" action="/BankApplication/welcome.htm">

		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" />
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" />
			</tr>


			<tr>
				<td><input type="submit" name="submit" value="Login" /></td>
			</tr>

		</table>
	</form:form>



	<form:form method="GET" action="/BankApplication/createnewaccount.htm">

		<table>
			<tr>
				<td><input type="submit" name="submit"
					value="Create New Account" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>