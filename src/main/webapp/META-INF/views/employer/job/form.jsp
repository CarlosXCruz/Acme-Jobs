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
<acme:form-textarea code="employer.job.form.label.description" path="description"/>
</acme:form>

<a href = app-48b914aa-d9d0-4c66-bf07-da88f4d7a1ba.cleverapps.io/employer/duty/list?idJob=<jstl:out value="${id}"></jstl:out>>
<acme:message code="employer.job.message.duties"/>
</a>
</br>
<a href = app-48b914aa-d9d0-4c66-bf07-da88f4d7a1ba.cleverapps.io/authenticated/audit-record/list?idJob=<jstl:out value="${id}"></jstl:out>>
<acme:message code="employer.job.message.audit-record"/>
</a>
<acme:form>
<acme:form-return code="autheticated.job.form.button.return"/>
</acme:form>