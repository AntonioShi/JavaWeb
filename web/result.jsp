<%--
  Created by IntelliJ IDEA.
  User: antonio
  Date: 18-3-22
  Time: 下午9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    double result = (double) request.getAttribute("result") ;
    out.println(result);
  %>
  </body>
</html>
