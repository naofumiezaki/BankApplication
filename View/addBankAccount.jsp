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

	<form:form method="POST" commandName="bankAccount"
		action="/Ravi_Project/addBankAccount.htm">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Account Type:</td>
				<td><form:radiobutton path="acct_type" value="Checking" />Checking
					Account</td>
				<td><form:radiobutton path="acct_type" value="Saving" />Saving
					Account</td>
				<td><form:errors path="acct_type" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Balance_available :</td>
				<td><form:input path="balance_available" /></td>
				<td><form:errors path="balance_available" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Previous" /></td>
				<td><input type="submit" name="submit" value="Finish" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>