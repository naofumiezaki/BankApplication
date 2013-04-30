<%@page import="org.springframework.expression.spel.ast.OpAnd"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	java.text.DateFormat df = new java.text.SimpleDateFormat(
			"dd/MM/yyyy");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script>
	function changeAction(form, name) {
		if (name == "Contact") {
			form.action = "/BankApplication/contact.htm";
		} else if (name == "Transactions") {
			form.action = "/BankApplication/transactions.htm";
		} else if (name == "DepositWithdraw") {
			form.action = "/BankApplication/depositwithdraw.htm";
		} else if (name == "Card") {
			form.action = "/BankApplication/card.htm";
		} else if (name == "Loan") {
			form.action = "/BankApplication/loan.htm";
		} else {
			form.action = "/BankApplication/login.htm";
		}

	}
</script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<%=df.format(new java.util.Date())%><br>
	 Hello ${username }
<table border="1">
		<tr>
			<td>Account type</td>
			<td>Available Balance</td>
		</tr>
			<% out.println("<br>"); %>
	<%
	List list = (List)request.getAttribute("BankList");
	for(int i = 0;i<list.size();i++){
		Object[] obj =(Object[]) list.get(i);
		out.println("<tr>");
		out.println("<td>" + obj[0] + "</td><td>" + obj[1] + "</td>");
		out.println("</tr");
	}

	%>
	<% out.println("<br>"); %>

</table>




	<form:form method="POST" commandName="bankAccount" action="">
		<form:errors path="*" cssClass="errorblock" element="div" />
		
		<br><br>
		<table>
			<tr>
				<td><input type="submit" name="Contact"
					onclick="changeAction(this.form, this.name)"
					value="Contact Information" /></td>
				<td><input type="submit" name="Transactions"
					value="See Transactions" /></td>
				<td><input type="submit" name="DepositWithdraw"
					value="Deposit/Withdraw" /></td>
				<td><input type="submit" name="Card" value="Add Card" /></td>
				<td><input type="submit" name="Loan" value="Get Loan" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>