<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.unifip.veiculos.servlet.Veiculo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" type="text/css" href="Style.css">
<c:url value="FormNovoVeiculo.jsp" var="linkFormCadastrarVeiculo"/>
<c:url value="Home.jsp" var="linkHomeVeiculo"/>
<c:url value="removeVeiculo" var="linkServletRemoveVeiculo"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java standard taglib</title>
</head>
<body>

	<div class=textos> 
		<c:if test="${not empty veiculo}">
			Veiculo ${ veiculo } cadastrado com sucesso!
		</c:if>
		Lista de Veiculos: <br /> 
		<ul>
			<li class="intem"> ID NOME MARCA</li>
			<c:forEach items="${veiculos}" var="veiculo">
				
				<li class="intem">
					${veiculo.id}
					${veiculo.nome}
					${veiculo.marca}
					<a class="remove" href="${linkServletRemoveVeiculo}?id=${veiculo.id}">❌</a> 
				</li>
			</c:forEach>
		</ul>
		<a class="cadastro" href=${linkFormCadastrarVeiculo}>Cadastrar Veiculo</a>
		<a class="cadastro" href=${linkHomeVeiculo}>HOME</a>
	</div>
	
</body>
</html>