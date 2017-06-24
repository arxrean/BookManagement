<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'UserRegister.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style>
td {
	font-size: 10px
}
body{
margin:0;
background:url(image/bg.jpg) no-repeat;
background-size:100% 100%;
}
</style>


</head>

<body>
	<h2 align=center>用户注册</h2>
	<table cellpadding="0" cellspacing="0" border="0" align=center
		width=300px style="border-collapse:separate; border-spacing:0px 20px;">
		<tr>
			<td width=100px>用 户 名</td>
			<td><input name="txt_username" id="txt_username" MaxLength="40"
				value="" type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>密 码</td>
			<td><input name="txt_password" id="txt_password" MaxLength="20"
				value="" type="password" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>确 认 密 码</td>
			<td><input name="txt_repassword" id="txt_repassword"
				MaxLength="20" value="" type="password" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>真 实 姓 名</td>
			<td><input name="txt_name" id="txt_name" MaxLength="20" value=""
				type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>身 份 证 号</td>
			<td><input name="txt_id" id="txt_id" MaxLength="20" tabindex="5"
				value="" type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>性 别</td>
			<td><select name="sel_sex" id="sel_sex" style="width: 200px; ">
					<option selected="selected">男</option>
					<option>女</option>
			</select></td>
		</tr>
		<tr>
			<td width=100px>邮 箱</td>
			<td><input name="txt_email" id="txt_email" MaxLength="40"
				value="" type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>手 机 号 码</td>
			<td><input name="txt_phone" id="txt_phone" MaxLength="20"
				value="" type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td width=100px>家 庭 地 址</td>
			<td><input name="txt_address" id="txt_address" MaxLength="20"
				value="" type="text" style="width: 200px; " /></td>
		</tr>
		<tr>
			<td colspan="2" align=center><input name="button_register"
				id="button_register" type="button" value="立即注册"
				style="width: 150px; " /></td>
		</tr>
	</table>
</body>
</html>
