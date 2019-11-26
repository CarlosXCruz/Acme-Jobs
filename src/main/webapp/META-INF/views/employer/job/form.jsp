<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
<acme:form-integer code="employer.job.form.label.referenceNumber" path="referenceNumber"/>
<acme:form-textbox code="employer.job.form.label.status" path="status"/>
<acme:form-textbox code="employer.job.form.label.title" path="title"/>
<acme:form-moment code="employer.job.form.label.deadline" path="deadline"/>
<acme:form-double code="employer.job.form.label.salary" path="salary"/>
<acme:form-textbox code="employer.job.form.label.moreInfo" path="moreInfo"/>
<acme:form-textarea code="employer.job.form.label.description" path="descriptor.description"/>

<acme:form-return code="autheticated.job.form.button.return"/>
</acme:form>