<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

.hiding {
	display: none;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="POST" commandName="usernamePassword"
		action="/BankApplication/createBankAccount.htm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Username :</td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>ReenterPassword :</td>
				<td><form:input path="rePassword" /></td>
				<td><form:errors path="rePassword" cssClass="error" /></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="Previous" /></td>
				<td><input type="submit" name="submit" value="Next" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>