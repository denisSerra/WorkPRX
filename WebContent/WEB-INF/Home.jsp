<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<a class="navbar-brand" href="#">Gestionale</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="http://example.com"
					id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Menù Gestionale</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="#">Impiegato</a> <a
							class="dropdown-item" href="#">Ruolo</a> <a class="dropdown-item"
							href="#">Storico</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="/ServletCorsiEJB/ServletInserimento">Corsi</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Contocorrente</a>
				</li>
			</ul>
		<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
		</div>
	</nav>
	<div class="jumbotron text-center">
		<h1>Gestionale</h1>
	</div>
	<div class="row justify-content-md-center">
		<div class="col-6 col-md-4">
			<div class="list-group">
				<form action="HomePage" method="post">
					<button class="list-group btn btn-primary list-group-item-warning"
						type="submit" name="pulsante" value="Impiegato">Impiegato</button>
				</form>
				<br>
				<form action="InserimentoServlet" method="get">
					<button class="list-group btn btn-primary list-group-item-warning"
						type="submit" name="Inserisci" value="Inserisci">Inserisci</button>
				</form>
				<br>
				<form action="FindServlet" method="get">
					<button class="list-group btn btn-primary list-group-item-warning"
						type="submit" name="Find" value="Cerca">Cerca</button>
				</form>
				<form action="DeleteServlet" method="get">
					<br>
					<button class="list-group btn btn-primary list-group-item-warning"
						type="submit" name="Delete" value="Cancella">Cancella</button>
				</form>
			</div>
		</div>
		<div class="col-6 col-md-4">
			<div class="list-group">
				<form action="HomePage" method="post">
					<button class="list-group btn btn-primary list-group-item-info"
						type="submit" name="pulsante" value="Storico">Storico</button>
				</form>
				<br>
				<form action="FindServlet" method="get">
					<button class="list-group btn btn-primary list-group-item-info"
						type="submit" name="Find" value="Cerca">Cerca</button>
				</form>
				<form action="DeleteServlet" method="get">
					<br>
					<button class="list-group btn btn-primary list-group-item-info"
						type="submit" name="Delete" value="Cancella">Cancella</button>
				</form>
			</div>
		</div>
		<div class="col-6 col-md-4">
			<div class="list-group">
				<form action="HomePage" method="post">
					<button class="list-group btn btn-primary list-group-item-dark"
						type="submit" name="pulsante" value="Ruolo">Ruolo</button>
				</form>
				<br>
				<form action="FindServlet" method="get">
					<button class="list-group btn btn-primary list-group-item-dark"
						type="submit" name="Find" value="Cerca">Cerca</button>
				</form>
				<form action="DeleteServlet" method="get">
					<br>
					<button class="list-group btn btn-primary list-group-item-dark"
						type="submit" name="Delete" value="Cancella">Cancella</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>