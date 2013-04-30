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

	<form:form method="POST" commandName="c1"
		action="/BankApplication/createUsernamePassword.htm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Customer name :</td>
				<td><form:input path="customerName" /></td>
				<td><form:errors path="customerName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Zip Code :</td>
				<td><form:input path="zip" maxlength="5"/></td>
				<td><form:errors path="zip" cssClass="error"  /></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><form:input path="phone" maxlength="10" /></td>
				<td><form:errors path="phone" cssClass="error" /></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="Previous" /></td>
				<td><input type="submit" name="submit" value="Next" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>