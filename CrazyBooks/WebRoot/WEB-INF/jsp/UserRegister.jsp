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
	background: url(images/bg_register.jpg) no-repeat;
	background-size: 100% 100%;
	text-align: center
}

#border {
	border: 5px solid #f0f0f0;
}
</style>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	var userNameState = false;
	var passwordState = false;
	var repasswordState = false;
	var nameState = false;
	var IDNumState = false;
	var emailState = false;
	var phoneNumState = false;
	var addressState = false;

	function showHint(userName) {
		$
				.ajax({
					type : "post",
					url : "UserValidateRegisterAction",
					data : {
						userName : userName
					},
					dataType : "json",
					success : function(data) {
						var d = eval("(" + data + ")");
						if (d.type == "error") {
							document.getElementById("hint_userName").style.color = "red";
							document.getElementById("hint_userName").innerHTML = "用户名已存在";
							userNameState = false;
						} else {
							if (userName == '') {
								document.getElementById("hint_userName").innerHTML = "";
								userNameState = false;
							} else {
								document.getElementById("hint_userName").style.color = "green";
								document.getElementById("hint_userName").innerHTML = "✔";
								userNameState = true;
							}
						}
					}
				});
	}

	function register() {
		if (userNameState && passwordState && repasswordState && nameState
				&& emailState && phoneNumState && addressState) {
			$.ajax({
				type : "post",
				url : "UserRegisterAction",
				data : {
					userName : $("#txt_userName").val(),
					password : $("#txt_password").val(),
					name : $("#txt_name").val(),
					idnum : $("#txt_IDNum").val(),
					sex : $("#sel_sex").val(),
					email : $("#txt_email").val(),
					phoneNum : $("#txt_phoneNum").val(),
					address : $("#txt_address").val(),
				},
				dataType : "json",
				success : function(data) {
					var d = eval("(" + data + ")");
					if(d.type=="success"){
						alert("插入成功!");
						window.location.href="ToLoginAction";
					}
				},
				error : function() {
				}
			});
		} else {
			alert("请检查信息是否正确！");
		}
	}

	function isIDNum(IDNum) {
		var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
		if (reg.test(IDNum) === false) {
			document.getElementById("hint_IDNum").style.color = "red";
			document.getElementById("hint_IDNum").innerHTML = "非法身份证号";
			IDNumState = false;
		} else {
			document.getElementById("hint_IDNum").style.color = "green";
			document.getElementById("hint_IDNum").innerHTML = "✔";
			IDNumState = true;
		}
		if (IDNum == '') {
			document.getElementById("hint_IDNum").innerHTML = "";
			IDNumState = false;
		}
	}

	function isEmail(strEmail) {
		if (strEmail
				.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1) {
			document.getElementById("hint_email").style.color = "green";
			document.getElementById("hint_email").innerHTML = "✔";
			emailState = true;
		} else {
			document.getElementById("hint_email").style.color = "red";
			document.getElementById("hint_email").innerHTML = "非法邮箱地址";
			emailState = false;
		}
		if (strEmail == '') {
			document.getElementById("hint_email").innerHTML = "";
			emailState = false;
		}
	}

	function isEqual() {
		var password = document.getElementById("txt_password").value;
		var repassword = document.getElementById("txt_repassword").value;
		if (password != repassword) {
			document.getElementById("hint_repassword").style.color = "red";
			document.getElementById("hint_repassword").innerHTML = "输入不一致！";
			repasswordState = false;
		} else {
			document.getElementById("hint_repassword").style.color = "green";
			document.getElementById("hint_repassword").innerHTML = "✔";
			repasswordState = true;
		}
		if (repassword == '') {
			document.getElementById("hint_repassword").innerHTML = "";
			repasswordState = false;
		}
	}

	function isPasswordEmpty(password) {
		if (password == '') {
			document.getElementById("hint_password").innerHTML = "";
			passwordState = false;
		} else {
			document.getElementById("hint_password").style.color = "green";
			document.getElementById("hint_password").innerHTML = "✔";
			passwordState = true;
		}
	}

	function isNameEmpty(name) {
		if (name == '') {
			document.getElementById("hint_name").innerHTML = "";
			nameState = false;
		} else {
			document.getElementById("hint_name").style.color = "green";
			document.getElementById("hint_name").innerHTML = "✔";
			nameState = true;
		}
	}

	function isPhoneNumEmpty(phoneNum) {
		if (phoneNum == '') {
			document.getElementById("hint_phoneNum").innerHTML = "";
			phoneNumState = false;
		} else {
			document.getElementById("hint_phoneNum").style.color = "green";
			document.getElementById("hint_phoneNum").innerHTML = "✔";
			phoneNumState = true;
		}
	}

	function isAddressEmpty(address) {
		if (address == '') {
			document.getElementById("hint_address").innerHTML = "";
			addressState = false;
		} else {
			document.getElementById("hint_address").style.color = "green";
			document.getElementById("hint_address").innerHTML = "✔";
			addressState = true;
		}
	}
</script>


</head>

<body>
	<div style="background-color:#fcfcfc;">
		<br>
		<h1 align=center
			style="font-family:微软雅黑;font-size:40px;color:#5b5b5b;">用户注册</h1>
		<p align=right>
			已有帐号？请<a href="ToLoginAction">登录</a>
		</p>
	</div>
	<div id="border"
		style="background-color:#f0f0f0;width:1500;margin:0 auto;text-align:center;opacity:0.8;">
		<table cellpadding="0" cellspacing="0" border="0" align=center
			width=400px
			style="border-collapse:separate; border-spacing:0px 20px;">
			<tr>
				<td width=100px>用 户 名</td>
				<td><input name="txt_userName" id="txt_userName" MaxLength="40"
					value="" type="text" style="width: 200px;border-radius:2px"
					onblur="showHint(this.value)" /><span id="hint_userName"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>密 码</td>
				<td><input name="txt_password" id="txt_password" MaxLength="20"
					value="" type="password" style="width: 200px;border-radius:2px "
					onblur="isPasswordEmpty(this.value)" /><span id="hint_password"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>确 认 密 码</td>
				<td><input name="txt_repassword" id="txt_repassword"
					MaxLength="20" value="" type="password"
					style="width: 200px;border-radius:2px" onblur="isEqual()" /><span
					id="hint_repassword" style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>真 实 姓 名</td>
				<td><input name="txt_name" id="txt_name" MaxLength="20"
					value="" type="text" style="width: 200px;border-radius:2px "
					onblur="isNameEmpty(this.value)" /><span id="hint_name"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>身 份 证 号</td>
				<td><input name="txt_IDNum" id="txt_IDNum" MaxLength="20"
					tabindex="5" value="" type="text"
					style="width: 200px;border-radius:2px" onblur="isIDNum(this.value)" /><span
					id="hint_IDNum" style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>性 别</td>
				<td><select name="sel_sex" id="sel_sex"
					style="width: 200px; border-radius:2px">
						<option selected="selected" value="1">男</option>
						<option value="2">女</option>
				</select></td>
			</tr>
			<tr>
				<td width=100px>邮 箱</td>
				<td><input name="txt_email" id="txt_email" MaxLength="40"
					value="" type="text" style="width: 200px; border-radius:2px"
					onblur="isEmail(this.value)" /><span id="hint_email"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>手 机 号 码</td>
				<td><input name="txt_phoneNum" id="txt_phoneNum" MaxLength="20"
					value="" type="text" style="width: 200px;border-radius:2px "
					onblur="isPhoneNumEmpty(this.value)" /><span id="hint_phoneNum"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td width=100px>家 庭 地 址</td>
				<td><input name="txt_address" id="txt_address" MaxLength="20"
					value="" type="text" style="width: 200px;border-radius:2px "
					onblur="isAddressEmpty(this.value)" /><span id="hint_address"
					style="color:red;font-size:10px"></span></td>
			</tr>
			<tr>
				<td></td>
				<td><input name="btn_register" id="btn_register" type="button"
					value="确认提交"
					style="width: 200px;height:40px;border-radius:5px;cursor:hand;background-color:#f0f0f0;font-size:15px;font-family:微软雅黑"
					onclick="register()" /></td>
			</tr>
		</table>
	</div>
</body>
</html>
