<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>


<acme:list readonly="true">
	<acme:list-column code="employer.duty.list.label.title" path="title" width="20%"/>
	<acme:list-column code="employer.duty.list.label.description" path="description" width="40%"/>
	<acme:list-column code="employer.duty.list.label.percentage" path="percentage" width="40%"/>
</acme:list>