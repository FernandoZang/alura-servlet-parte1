<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Cadastradas</title>
</head>
<body>
	<h1>Empresas Cadastradas</h1>
	
	<ol>
		<c:forEach var="empresa" items="${empresas }">
			<li> Nome: <b>${empresa.nomeFantasia}</b> Data Abertura: <b> <fmt:formatDate type="both" dateStyle="full" pattern="dd/MM/yyyy HH:mm:ss" value="${empresa.dataAbertura.time}"/>  </b></li>
		</c:forEach>
	</ol>
	
</body>
</html>