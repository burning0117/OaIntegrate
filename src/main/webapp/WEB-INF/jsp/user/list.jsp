<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/css/images/title_arrow.gif"/> 用户管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id="TableTitle">
                <td width="100">用户名</td>
                <td width="100">所属部门</td>
                <td>岗位</td>
                <td>相关操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="userList">
        	<s:iterator>
	            <tr class="TableDetail1 template">
	                <td><s:property value="username"/></td>
	                <s:hidden name="uid"></s:hidden>
	                <td><s:property value="department.dname"/></td>
	                <td>
						<s:iterator value="posts">
							<s:property value="pname"/>
						</s:iterator>
					</td>
	                <td>
	                	<s:a action="userAction_delete?uid=%{uid}">删除</s:a>
	                    <s:a action="userAction_updateUI?uid=%{uid}">修改</s:a>
						<s:a>设置权限</s:a>
	                </td>
	            </tr>
            </s:iterator>
        </tbody>
    </table>
     <div id="TableTail">
        <div id="TableTail_inside">
            <a href="userAction_addUI.action"><img src="${pageContext.request.contextPath}/css/images/createNew.png" /></a>
        </div>
    </div>
   </div>

</body>
</html>
