<%@ taglib prefix="l" uri="/WEB-INF/myTest.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*" %>
<HTML>
    <HEAD>
        <TITLE>Supporting Iterating Custom Tags</TITLE>
    </HEAD>

    <BODY>
        <H1>Supporting Iterating Custom Tags</H1>
        <%
            String[] names = new String[]{ "A", "B", "C", "D" };
            pageContext.setAttribute("names", names);
            
            List<String> jj = (List<String>) request.getAttribute("test");
            System.out.println(jj.size()+"this is jj");
            pageContext.setAttribute("listTest",jj);
        %>

     <l:iterate var2="test123">
     		<c:out value="${test123 }">${test123 }</c:out>
     </l:iterate>


    </BODY>
</HTML>

