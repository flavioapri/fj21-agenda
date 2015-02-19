<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ attribute name="id" required="true"%>
<%@ attribute name="label" required="true"%>

<label for="${id}">${label}</label>
<input type="password" name="${id}" />
<span style="color: red"><form:errors path="${id}" /></span>
