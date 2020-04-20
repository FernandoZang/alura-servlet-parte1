<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Empresas Cadastradas</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<h1>Empresas Cadastradas</h1>
	
	<c:if test="${empresa != null }">
		<div class="card bg-success">
			A empresa ${empresa.nomeFantasia} foi cadastrada! <!-- pegando da session -->
			<%request.getSession().setAttribute("empresa", null); %>
		</div>
	</c:if>
	
	
	<ol>
		<c:forEach var="empresa" items="${empresas }">
			<li> Nome: <b>${empresa.nomeFantasia}</b> Data Abertura: <b> <fmt:formatDate type="both" dateStyle="full" pattern="dd/MM/yyyy HH:mm:ss" value="${empresa.dataAbertura.time}"/>  </b></li>
		</c:forEach>
	</ol>
	
</body>
</html>