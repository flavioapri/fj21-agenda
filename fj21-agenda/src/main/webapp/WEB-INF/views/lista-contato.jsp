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
<title>Agenda - Listar Contatos</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<display:table name="${contatos}" class="displaytag" decorator="br.com.caelum.agenda.decorator.AgendaDecorator">
		<display:setProperty name="basic.msg.empty_list" value="Não há contatos para exibir" />
		<display:column property="id" title="ID" />
		<display:column property="nome" title="Nome" />
		<display:column property="endereco" title="Endereço" />
		<display:column autolink="true" property="email" title="Email" />
		<display:column property="dataNascimento.time"
			format="{0,date,dd-MM-yyyy}" title="Data de Nascimento" />
		<display:column style="text-align:center" property="contatoIdEditar" title="Alterar" />
		<display:column style="text-align:center" property="contatoIdRemover" title="Remover" />
	</display:table>
	<c:import url="rodape.jsp" />
</body>
</html>