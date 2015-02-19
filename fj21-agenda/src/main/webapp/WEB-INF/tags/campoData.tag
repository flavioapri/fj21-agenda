<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="true"%>

<style type="text/css">
.ui-datepicker {
	font-size: 9pt;
}
</style>

<script>
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

<label for="${id}">${label}</label>
<form:input path="${id}" id="${id}" />
<span style="color: red"><form:errors path="${id}" /></span>
