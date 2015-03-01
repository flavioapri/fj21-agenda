<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="rsc/css/displaytag.css" rel="stylesheet">
<link href="rsc/css/body.css" rel="stylesheet">
<title>Agenda - Listar Funcionários</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	
	<display:table name="funcionarios" class="displaytag" decorator="br.com.caelum.agenda.decorator.AgendaDecorator">
		<display:setProperty name="basic.msg.empty_list" value="Não há funcionários para exibir" />
		<display:column property="id" title="ID" />
		<display:column property="nome" title="Nome" />
		<display:column property="usuario" title="Usuario" />
		<display:column property="senha" title="Senha" />
		<display:column style="text-align:center" property="funcionarioIdEditar" title="Alterar" />
		<display:column style="text-align:center" property="funcionarioIdRemover" title="Remover" />
	</display:table>
	
	<c:import url="rodape.jsp" />
</body>
</html>