<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="cadastrarVeiculo" var="linkServletCadastrarVeiculo"/>
<c:url value="Home.jsp" var="linkHomeVeiculo"/>
<c:url value="alterarVeiculos" var="linkServletAlterarVeiculo"/>

<link rel="stylesheet" type="text/css" href="Style.css">
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Form Novo Veiculo</title>
	<head>
    <script src="Prova02/src/main/webapp/WEB-INF/inedex.js"></script>
</head>
</head>
<body>
	<form action="${linkServletAlterarVeiculo}" method="post">
		<div id="textos">
			<div class="entrada"> 
				Nome: <input type="text" name="nome" value="${veiculo.nome}"> 
				Marca: <input type="text" name="marca" value="${veiculo.marca}">
				<input type="hidden" name="id" value="${veiculo.id}">
			</div> 
			<input type="submit" id="envio" value="cadastrar">
		</div>
	</form>
	<div id="textos">
		<a class="cadastro" href=${linkServletMostrarVeiculo}>Listar Veiculos</a>
		<a class="cadastro" href=${linkHomeVeiculo}>HOME</a>
	</div>
	
</body>
</html>