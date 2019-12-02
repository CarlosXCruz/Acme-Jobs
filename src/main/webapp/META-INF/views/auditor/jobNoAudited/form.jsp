<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
<acme:form-integer code="auditor.job.form.label.referenceNumber" path="referenceNumber"/>
<acme:form-textbox code="auditor.job.form.label.status" path="status"/>
<acme:form-textbox code="auditor.job.form.label.title" path="title"/>
<acme:form-moment code="auditor.job.form.label.deadline" path="deadline"/>
<acme:form-double code="auditor.job.form.label.salary" path="salary"/>
<acme:form-textbox code="auditor.job.form.label.moreInfo" path="moreInfo"/>
<acme:form-textarea code="auditor.job.form.label.description" path="description"/>
</acme:form>

<acme:form>
<acme:form-return code="auditor2.job.form.button.return"/>
</acme:form>