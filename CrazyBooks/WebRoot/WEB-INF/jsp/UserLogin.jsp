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

<title>My JSP 'UserLogin.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style>
td {
	font-size: 10px
}

body {
	margin: 0;
	background: url(image/bg_login.jpg) no-repeat;
	background-size: 100% 100%;
}
</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	function login() {
		$.ajax({
			type : "post",
			url : "UserLoginAction",
			data : {
				userName : $("#txt_userName").val(),
				password : $("#txt_password").val(),
			},
			dataType : "json",
			success : function(data) {
				var d = eval("(" + data + ")");
				if (d.type == "success") {
					alert("登陆成功！");
					window.location.href = "TomainPageAction";
				} else if (d.type == "none") {
					alert("账户名或密码错误!");
				} else {
					alert("该用户已被封禁！");
				}
			},
			error : function() {
				alert("ajax error");
			}
		});
	}
</script>
</head>

<body>
	<!-- 用户/管理员登录界面 -->
	<table height="800" width="1300"
		style="position:absolute;left:300px;top:50px">
		<tr>
			<td height="80"
				style="background:url(images/CrazyBook.jpg)no-repeat;"></td>
			<td></td>
		</tr>

		<tr align="center">
			<td width="700" height="400"></td>
			<td height="400">
				<table height="200" align="center"
					style="border: 1px solid #83ACC0;">
					<tr align="center">
						<td width="350" height="80" colspan=2><strong>用户登录</strong></td>
					</tr>
					<tr align="center">
						<td width="75" height="80">账号:</td>
						<td width="168"><input type="text" name="txt_userName"
							id="txt_userName" value="" /></td>
					</tr>
					<tr align="center">
						<td height="75">密码:</td>
						<td><input type="password" name="txt_password"
							id="txt_password" value="" /></td>
					</tr>
					<tr align="center">
						<td height="75" colspan="2"><input name="btn_login"
							id="btn_login" type="button" value="登录" onclick="login()">
							<input name="btn_undo" id="btn_undo" type="button" value="撤销"
							onClick="document.execCommand('Undo')" /></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table width="950" align="center" cellpadding="0" cellspacing="0"
		style="position:absolute;left:470px;top:858px">
		<tr>
			<td
				style="border-left: 1px solid #83ACC0; border-top: 1px solid #83ACC0; border-right: 1px solid #83ACC0; padding-left: 8px; padding-top: 3px; padding-bottom: 2px; border-bottom: 1px solid #83ACC0">

				版权信息</td>
		</tr>
		<tr>
			<td height="38" align="center" style="border: 1px solid #83ACC0">
				Copyright? CrazyBooks Group All Rights Resered.</td>
		</tr>
	</table>

</body>
</html>
