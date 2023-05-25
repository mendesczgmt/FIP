<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="FormNovoVeiculo.jsp" var="linkFormCadastrarVeiculo"/>
<c:url value="listaVeiculos" var="linkServletMostrarVeiculo"/>
<link rel="stylesheet" type="text/css" href="Style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prova 02

</title>
</head>
<body>
 	<div id="textos">
		<a class="links" href=${linkFormCadastrarVeiculo}>Cadastrar Veiculo</a>
		<a class="links" href=${linkServletMostrarVeiculo}>Listar Veiculos</a>
	</div>
</body>
</html>