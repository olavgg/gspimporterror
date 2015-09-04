<%--
  User: olav
  Date: 9/4/15
  Time: 5:36 PM
--%>

<%@ page import="no.olavgg.enums.OrganizationType" contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main"/>
	<title><g:message code="sometitle" default="somedefaulttitle"/></title>
</head>

<body>

<g:if test="${orgType.equals(OrganizationType.OPERATOR)}">
	<div>operator</div>
</g:if>
<g:if test="${orgType.equals(OrganizationType.SERVICE) || orgType.equals(OrganizationType.OPERATOR)}">
	<div>service</div>
</g:if>
<g:if test="${orgType.equals(OrganizationType.RIG) || orgType.equals(OrganizationType.OPERATOR)}">
	<div>rig</div>
</g:if>

</body>
</html>