<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crea corso</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<h1>Crea corso</h1>
<form action="ServletInserimento" method="post">
<input type="text" name="idcorso" placeholder="Id corso"/>
<input type="text" name="nomecorso" placeholder="Nome corso"/>
<input type="submit" value="Invia" />
</form>
<form action="HomePage" method="get">
<br>
<input type="submit" value="Indietro">

</form>
</body>
</html>