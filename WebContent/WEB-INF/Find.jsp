<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca impiegato</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<form action="FindServlet" method="post">
<input type="text" name="codFisc" placeholder="codiceFiscale">
<input type="submit" name="button" value="Cerca CodF" />
<br><br>
<input type="text" name="dataIni" placeholder="dataInizio">
<input type="submit" name="button" value="Cerca DataI" />
<br><br>
<input type="text" name="ruoloStip" placeholder="stipendio">
<input type="submit" name="button" value="Cerca Ruolo" />
</form>
<form action="HomePage" method="get">
<br>
<input type="submit" value="Indietro">
</form>
</body>
</html>