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
  <%-- JSP的静态引入, 编译成Servler时静态引入会将文件的内容也加进去 --%>
  <%@include file="includeStatic.jsp" %>
  <%-- jsp的动态引入, 编译成Servler动态引入不会讲其加入进去, 而是方法的调用的方式引入, 动态引入允许声明同名变量 --%>
  <jsp:include page="jspInclude.jsp"></jsp:include>
  </body>
</html>
<%-- JSP的forward转发, 相当于Servlet中的请求转发 request.getRequestDispatcher("forward.jsp").forward(request, response); --%>
<%--<jsp:forward page="forward.jsp"></jsp:forward>--%>
<%--JSP九大内置对象
    pageContext: 管理其他八内置大对象
    request: 客户端的请求信息
    response: 队客户端的响应
    application: 保存在服务器的信息
    session: 用户不同请求的共享数据
    out: 向浏览器内输出信息的缓冲区
    config: 当前JSP的
    page: 代表JSP本身, 类似于this指针
    exception: 显示异常信息, 只有在isErrorPage="true"时使用
--%>