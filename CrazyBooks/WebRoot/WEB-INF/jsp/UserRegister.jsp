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
<!-- abc -->
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

body {
	margin: 0;
	background: url(images/bg.jpg) no-repeat;
	background-size: 100% 100%;
}
</style>

<script type="text/javascript">
	function showHint() {
		var $hint = $("#txt_userName");
		alert("ok");
		$hint
				.bind(
						"onblur",
						function() {
							$
									.ajax({
										type : "post",
										url : "UserValidateRegisterAction",
										data : {
											userName : $(
													"input[name=txt_userName]")
													.val(),
										},
										dataType : "json",
										success : function(data) {
											var d = eval("(" + data + ")");
											if (data.type == "error") {
												document
														.getElementById("hint_userName").innerHTML = "用户名已存在";
											} else {
												document
														.getElementById("hint_userName").style.color = "green";
												document
														.getElementById("hint_userName").innerHTML = "用户名可用";
											}
										},
										error : function() {
											alert("sys error!");
										}
									});
						});
	}

	function showHint(str) {
		$
				.ajax({
					type : "post",
					url : "UserValidateRegisterAction",
					data : {
						userName : str
					},
					dataType : "json",
					success : function(data) {
						var d = eval("(" + data + ")");
						if (d.type == "error") {
							document.getElementById("hint_userName").innerHTML = "用户名已存在";
						} else {
							document.getElementById("hint_userName").style.color = "green";
							document.getElementById("hint_userName").innerHTML = "用户名可用";
						}
					}
				});
	}

	function register() {
		var $register = $("input.btn_register");
		$register.bind("click", function() {
			$.ajax({
				type : "post",
				url : "UserRegisterAction",
				data : {
					userName : $("input[name=txt_userName]").val(),
					password : $("input[name=txt_password]").val(),
					name : $("input[name=txt_name]").val(),
					IDNum : $("input[name=txt_IDNum]").val(),
					sex : $("input[name=txt_sex]").val(),
					email : $("input[name=txt_email]").val(),
					phoneNum : $("input[name=txt_phoneNum]").val(),
					address : $("input[name=txt_address]").val(),
				},
				dataType : "json",
				success : function(data) {
				},
				error : function() {
				}
			});
		});
	}
	$(document).ready(function() {
		register();
	});

	function isIDNum(IDNum) {
		var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
		if (reg.test(IDNum) === false) {
			document.getElementById("hint_IDNum").innerHTML = "非法身份证号";
		} else {
			document.getElementById("hint_IDNum").style.color = "green";
			document.getElementById("hint_IDNum").innerHTML = "合法身份证号";
		}
	}

	function isEmail(strEmail) {
		if (strEmail == '')
			return true;
		if (strEmail
				.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1) {
			document.getElementById("hint_email").style.color = "green";
			document.getElementById("hint_email").innerHTML = "合法邮箱地址";
		} else
			document.getElementById("hint_email").innerHTML = "非法邮箱地址";
	}
</script>


</head>

<body>
	<h2 align=center style="font-family:微软雅黑;margin-top:150px">用户注册</h2>
	<table cellpadding="0" cellspacing="0" border="0" align=center
		width=400px style="border-collapse:separate; border-spacing:0px 20px;">
		<tr>
			<td width=100px>用 户 名</td>
			<td><input name="txt_userName" id="txt_userName" MaxLength="40"
				value="" type="text" style="width: 200px;" onblur="showHint()" /><span
				id="hint_userName" style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td width=100px>密 码</td>
			<td><input name="txt_password" id="txt_password" MaxLength="20"
				value="" type="password" style="width: 200px; " /><span
				id="hint_password" style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td width=100px>确 认 密 码</td>
			<td><input name="txt_repassword" id="txt_repassword"
				MaxLength="20" value="" type="password" style="width: 200px; " /><span
				id="hint_repassword" style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td width=100px>真 实 姓 名</td>
			<td><input name="txt_name" id="txt_name" MaxLength="20" value=""
				type="text" style="width: 200px; " /><span id="hint_name"
				style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td width=100px>身 份 证 号</td>
			<td><input name="txt_IDNum" id="txt_IDNum" MaxLength="20"
				tabindex="5" value="" type="text" style="width: 200px;"
				onblur="isIDNum(this.value)" /><span id="hint_IDNum"
				style="color:red;font-size:10px"></span></td>
		</tr>
		<tr>
			<td width=100px>性 别</td>
			<td><select name="txt_sex" id="txt_sex" style="width: 200px; ">
					<option selected="selected">男</option>
					<option>女</option>
			</select></td>
		</tr>
		<tr>
			<td width=100px>邮 箱</td>
			<td><input name="txt_email" id="txt_email" MaxLength="40"
				value="" type="text" style="width: 200px; "
				onblur="isEmail(this.value)" /><span id="hint_email"
				style="color:red;font-size:10px"></span></td>
		</tr>
		<tr>
			<td width=100px>手 机 号 码</td>
			<td><input name="txt_phoneNum" id="txt_phoneNum" MaxLength="20"
				value="" type="text" style="width: 200px; " /><span
				id="hint_phoneNum" style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td width=100px>家 庭 地 址</td>
			<td><input name="txt_address" id="txt_address" MaxLength="20"
				value="" type="text" style="width: 200px; " /><span
				id="hint_address" style="color:red;font-size:15px"></span></td>
		</tr>
		<tr>
			<td colspan="2" align=center><input name="btn_register"
				id="btn_register" type="button" value="立即注册" style="width: 150px; " /></td>
		</tr>
	</table>
	<p align=center style="color:red;font-size:25px"></p>
</body>
</html>
