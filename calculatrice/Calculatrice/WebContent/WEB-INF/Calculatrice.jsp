<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Calculatrice</title>
</head>
<body>
	
	<h1>Calculatrice</h1>
	
	<h2>${ resultat }</h2>
	
	<form action="calculatrice" method="post">
		
		<p>
			<label for="nombre1"></label>
			<input type="text" name="nombre1" id="nombre1" value="0">
			
			<label> ${ signe }</label>
			
			<label for="nombre2"></label>
			<input type="text" name="nombre2" id="nombre2" value="0">
			
			<input type="submit" value="Calculer">
			
		</p>
		
		<p>
			<label><input type="radio" name="signe" value="+" />Addtion</label>&nbsp;&nbsp;
			<label><input type="radio" name="signe" value="-"/>Soustraction</label>&nbsp;&nbsp;
			<label><input type="radio" name="signe" value="/"/>Division</label> 
		</p>
		
	
	</form>
	
</body>
</html>