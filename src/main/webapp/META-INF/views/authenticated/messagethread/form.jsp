<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="autheticated.messagethread.form.label.title" path="title" />
	<acme:form-moment 
		code="autheticated.messagethread.form.label.creationMoment" 
		path="creationmoment"
		readonly="true"/>
	<acme:form-textbox code="autheticated.messagethread.form.label.users" path="users" />
	
	<acme:form-return code="autheticated.messagethread.form.button.return"/>
</acme:form>