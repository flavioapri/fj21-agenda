<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="agenda"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="rsc/js/jquery.js" type="text/javascript"></script>
<script src="rsc/js/jquery-ui.js" type="text/javascript"></script>
<link rel="stylesheet" href="rsc/css/jquery-ui.css">
<link href="rsc/css/body.css" rel="stylesheet">
<title>Agenda - Exibir Contato</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />

	<h4>Editar Contato</h4>
	
	<form:form commandName="contato" action="editarContato" method="post">
		<form:hidden path="id"/>
		<agenda:campoTexto value="${contato.nome}" label="Nome: " id="nome" />
		<br />
		<agenda:campoTexto value="${contato.email}" label="Email: " id="email" />
		<br />
		<agenda:campoTexto value="${contato.endereco}" label="Endereço: "
			id="endereco" />
		<br />
		<agenda:campoData value="${contato.dataNascimento.time}"
			label="Data de Nascimento: " id="dataNascimento" />
		<br />
		<input type="submit" value="Alterar">
	</form:form>

	<c:import url="rodape.jsp" />
</body>
</html>