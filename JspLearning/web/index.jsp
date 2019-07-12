<%--
  Created by IntelliJ IDEA.
  User: zhoubo
  Date: 2019-07-12
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- jsp会被编译成Java的Servlet类, 然后被服务器加载 --%>

<%! private String data = "This is a JSP  test."; // 这儿为Java中的全局代码块, 写类的变量或者方法 %>
<% String title = "jsp学习"; // 这写的是Servlet中的代码 %>
<html>
  <head>
    <title><%= title%><%--这儿写的是Java脚本块, 相当于把这个变量输出到HTML文本中--%></title>
  </head>
  <body>
  <%= data %>
  <%-- JSP的静态引入 --%>
  <%@include file="includeStatic.jsp" %>
  </body>
</html>
