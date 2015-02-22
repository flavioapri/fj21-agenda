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
<title>Agenda - Adicionar Contatos</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<h4>Adicionar Contatos</h4>
	<form:form commandName="contato" action="adicionarContato"
		method="post">
		<agenda:campoTexto label="Nome: " id="nome" />
		<br />
		<agenda:campoTexto label="Email: " id="email" />
		<br />
		<agenda:campoTexto label="Endereço: " id="endereco" />
		<br />
		<agenda:campoData label="Data de Nascimento: " id="dataNascimento" />
		<br />
		<input type="submit" value="Gravar">
	</form:form>
	<br />
	<c:import url="rodape.jsp" />
</body>
</html>