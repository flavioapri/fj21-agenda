<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="agenda"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="rsc/css/body.css">
<title>Agenda - Adicionar Funcionário</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	
	<h4>Adicionar Funcionário</h4>
	
	<form:form commandName="funcionario" action="adicionarFuncionario"
		method="post">
		<agenda:campoTexto label="Nome: " id="nome" />
		<br />
		<agenda:campoTexto label="Usuário: " id="usuario" />
		<br />
		<agenda:campoSenha label="Senha: " id="senha" />
		<br />
		<input type="submit" value="Salvar">
	</form:form>

	<c:import url="rodape.jsp" />
</body>
</html>