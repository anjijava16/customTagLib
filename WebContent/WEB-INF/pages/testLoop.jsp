<%@ taglib prefix="l" uri="/WEB-INF/myLoopTest.tld" %>

<%@page import="java.util.*" %>
<HTML>
    <HEAD>
        <TITLE>Supporting Iterating Custom Tags</TITLE>
    </HEAD>

    <BODY>
        <H1>Supporting Iterating Custom Tags</H1>
       

<l:forEach items="${servers}" var="server">
     		${server}
     </l:forEach>


    </BODY>
</HTML>