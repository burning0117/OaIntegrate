<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
${requestScope.username}<br/>
${sessionScope.username}<br/>
${applicationScope.username}<br/>
<s:property value="#request.username"/>
<s:select list="#deparmentList"/>
<s:form action="userAction_*" method="post">
    <table width="100%" align="center">
        <tr> <td>name : <s:textfield name="loginForm.name"/> </td> </tr>
        <tr> <td>password : <s:password name="loginForm.password"/> </td> </tr>
        <tr> <td> <s:submit name="login" value="submit" method="login"/> </td> </tr>
    </table>
</s:form>
</body>
</html>
