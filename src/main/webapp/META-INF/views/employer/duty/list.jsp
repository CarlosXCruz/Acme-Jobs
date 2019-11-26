<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>


<acme:list readonly="true">
	<acme:list-column code="employer.duty.list.label.title" path="title" width="20%"/>
	<acme:list-column code="employer.duty.list.label.description" path="description" width="40%"/>
	<acme:list-column code="employer.duty.list.label.percentage" path="percentage" width="40%"/>
</acme:list>

<acme:message code="employer.duty.message.job"></acme:message>

<acme:form readonly="true">
<acme:form-textbox code="employer.duty.job.form.label.referenceNumber" path="job.referenceNumber[0]"/>
<acme:form-textbox code="employer.duty.job.form.label.title" path="job.title[0]"/>
<acme:form-textbox code="employer.duty.job.form.label.description" path="job.description[0]"/>
<acme:form-double code="employer.duty.job.form.label.salary" path="job.salary[0]"/>

<acme:form-return code="employer.duty.form.button.return"/>
</acme:form>