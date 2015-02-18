<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="true"%>

<script>
	$(function() {
		$("#${id}").datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});
</script>

<label for="${id}">${label}</label>
<form:input path="${id}" id="${id}" />
<span style="color: red"><form:errors path="${id}" /></span>
