<%@ taglib prefix="l" uri="/WEB-INF/myEmp.tld" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.*" %>
<HTML>
    <HEAD>
        <TITLE>Supporting Iterating Custom Tags</TITLE>
    </HEAD>

    <BODY>
        <H1>Supporting Iterating Custom Tags</H1>
       
<form:form action="jaga123" commandName="employee">
<form:select path="id">
<l:for items="${servers}" var="server">
	<form:option value="${server.id}">${server.name}</form:option>
 </l:for>
</form:select>
</form:form>

<select>
<l:for items="${servers}" var="server">
	<option value="${server.id}">${server.name}</option>
 </l:for>
</select>

<select>
<l:for items="${servers}" var="server">
	<option value="${server.id}">${server.name}</option>
 </l:for>
</select>

    </BODY>
</HTML>