<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UserLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <style>
  td
  {
    font-size:10px
  }
  table 
  {
	border:1px solid blue;
  }
  </style>
  <body> 
    <table height="144" align="center" style="background-color: #ffffff;">
	  <tr align="center">
		<th width="198" height="31" bgcolor="#015890" colspan=2>
		  <strong><font color="#FFFFFF">用户登录</font> </strong>
		</th>
	  </tr> 
	  <tr align="center">
		<td width="42" height="47">		  
		      账号:
		</td>
		<td width="168">
		  <input type="text" name="name"/>
		</td>
	  </tr>
	  <tr align="center">
		<td height="49">
		      密码:
		</td>
		<td>
		  <input type="password" name="password"/>
		</td>
	  </tr>
	  <tr align="center">
		<td colspan="2">
		  <input type="button" name="login" value="登陆" onclick="submitForm()"/>
		  <input type="reset" name="reset" value="取消" />
		</td>
	  </tr>
	</table>
  </body>
</html>
