<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="true"%>
<%@ attribute name="value" required="false"%>
<%@ attribute name="dateValue" required="false"%>

<style type="text/css">
/* Estilo do Datepicker. Reduz o tamanho da fonte para
o calend�rio diminuir de tamanho. */
.ui-datepicker {
	font-size: 9pt;
}
</style>

<script>
	// Configura��o do Datepicker.

	$(function() {
		$("#${id}").datepicker(
				{
					changeMonth : true,
					changeYear : true,
					yearRange : "1920:2015",
					dateFormat : 'dd/mm/yy',
					dayNames : [ 'Domingo', 'Segunda', 'Ter�a', 'Quarta',
							'Quinta', 'Sexta', 'S�bado' ],
					dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S', 'D' ],
					dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex',
							'S�b', 'Dom' ],
					monthNames : [ 'Janeiro', 'Fevereiro', 'Mar�o', 'Abril',
							'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro',
							'Outubro', 'Novembro', 'Dezembro' ],
					monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai',
							'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez' ],
					nextText : 'Pr�ximo',
					prevText : 'Anterior'
				});
	});
</script>

<script>
// Para que o valor da data seja exibido de maneira correta no campo, � necess�rio realizar esta convers�o.
// O valor da data do objeto � do tipo String, a tag fmt:formatDate n�o converte datas neste formato.
	var dataConvertida = Date.parseDate("${value}", "dd-mm-yyyy");
</script>

<label for="${id}">${label}</label>
<fmt:formatDate value="${dataConvertida}" pattern="dd-MM-yyyy"
	var="dataFormatada" />
<form:input value="${dataFormatada}" path="${id}" id="${id}" />
<span style="color: red"><form:errors path="${id}" /></span>
