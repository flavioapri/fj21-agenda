<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="true"%>
<%@ attribute name="value" required="false"%>
<%@ attribute name="dateValue" required="false"%>

<style type="text/css">
/* Estilo do Datepicker. Reduz o tamanho da fonte para
o calendário diminuir de tamanho. */
.ui-datepicker {
	font-size: 9pt;
}
</style>

<script>
	// Configuração do Datepicker.

	$(function() {
		$("#${id}").datepicker(
				{
					changeMonth : true,
					changeYear : true,
					yearRange : "1920:2015",
					dateFormat : 'dd/mm/yy',
					dayNames : [ 'Domingo', 'Segunda', 'Terça', 'Quarta',
							'Quinta', 'Sexta', 'Sábado' ],
					dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S', 'D' ],
					dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex',
							'Sáb', 'Dom' ],
					monthNames : [ 'Janeiro', 'Fevereiro', 'Março', 'Abril',
							'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro',
							'Outubro', 'Novembro', 'Dezembro' ],
					monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai',
							'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez' ],
					nextText : 'Próximo',
					prevText : 'Anterior'
				});
	});
</script>

<script>
// Para que o valor da data seja exibido de maneira correta no campo, é necessário realizar esta conversão.
// O valor da data do objeto é do tipo String, a tag fmt:formatDate não converte datas neste formato.
	var dataConvertida = Date.parseDate("${value}", "dd-mm-yyyy");
</script>

<label for="${id}">${label}</label>
<fmt:formatDate value="${dataConvertida}" pattern="dd-MM-yyyy"
	var="dataFormatada" />
<form:input value="${dataFormatada}" path="${id}" id="${id}" />
<span style="color: red"><form:errors path="${id}" /></span>
