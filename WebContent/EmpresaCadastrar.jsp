<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--<c:url value="/EmpresaCadastrar" var="linkEmpresaCadastrar" /> -->

<c:url value="/" var="contexto"/>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Cadastrar Empresa</title>
</head>
<body>

	
	<h1>Cadastrar Empresa</h1>
	<form action="${contexto}EmpresaCadastrar" method="post">
		Nome Fantasia: <input type="text" name="nomeFantasia" class="form-control">
		<br/>
		Data abertura: <input type="date" name="dataAbertura" class="form-control">
		<br>
		<button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>

</body>
</html>