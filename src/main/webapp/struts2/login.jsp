<%--
  Created by IntelliJ IDEA.
  User: burning
  Date: 2016/3/21
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="Login" theme="simple">
        用户名:<s:textfield name="userName" label="Username"/><br/>
          密码:<s:password name="passWord" label="Password"/><br/>
        <s:submit/>
    </s:form>
</body>
</html>
