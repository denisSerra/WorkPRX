<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista storico</title>
<h1>Storico</h1>
</head>
<body>
<%=request.getSession().getAttribute("Storico") %>
<form action="HomePage" method="get">
<br>
<input type="submit" value="Indietro">
</form>
</body>
</html>