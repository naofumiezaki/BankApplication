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

<form:form method="POST" commandName="bankAccount" action="/Ravi_Project/addBankAccount.htm">
	<table>
		<tr>
			<td>Customer ID :</td>
			<td>${customer.customerno}</td>
		</tr>
		<tr>
			<td>Customer Name :</td>
			<td>${customer.customerName}</td>
		</tr>
		<tr>
			<td>City :</td>
			<td>${customer.city}</td>
		</tr>
		<tr>
			<td>Zip :</td>
			<td>${customer.zip}</td>
		</tr>
		<tr>
			<td>Phone :</td>
			<td>${customer.phone}</td>
		</tr>



	</table>
	
	</form:form>
</body>
</html>