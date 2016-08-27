<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addProduct.jsp' starting page</title>
    
  </head>
  
  <body>
    <h1>添加商品</h1>
	<s:form action="product_save.action" method="post" namespace="/" theme="simple">
    	<table>
    		<tr>
    			<td>商品名称</td>
    			<td><s:textfield name = "pname" /></td>
    		</tr>
    		<tr>
    			<td>商品价格</td>
    			<td><s:textfield name = "price" /></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="添加"/></td>
    		</tr>
    	</table>
	</s:form>
  </body>
</html>
