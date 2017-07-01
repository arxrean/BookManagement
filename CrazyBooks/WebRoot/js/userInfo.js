$(document).ready(function() {
	validateLogin();
	getUserInfo();
});

function deleteUserName() {
	$.ajax({
		type : "post",
		url : "SessionQuery",
		data : {
			sessionType : "deleteUserName",
		},
		dataType : "json",
		success : function(data) {
			var d = eval("(" + data + ")");
			if (d.sessionType == "deleteUserName") {
				window.location.href = "TomainPageJspAction.action";
			}
		},
		error : function() {
			alert("Ajax传输错误！");
		}
	});
}

function validateLogin() {
	$.ajax({
		type : "post",
		url : "SessionQuery",
		data : {
			sessionType : "userName",
		},
		dataType : "json",
		success : function(data) {
			var d = eval("(" + data + ")");
			if (d.sessionType != "none") {
				$("#user_login").empty();
				$("#user_login").append(
						"<a href='ToUserInfoHtmlAction'>" + d.sessionType
								+ "</a>"
								+ "<a onclick='deleteUserName()'>[注销]</a>");
				// 设置用户名
				$("#txt_userName").attr("readonly", "false");
				$("#txt_userName").val(d.sessionType);
				$("#txt_userName").attr("readonly", "true");
			}
		},
		error : function() {
			alert("Ajax传输错误！");
		}
	});
}

function getUserInfo() {
	$.ajax({
		type : "post",
		url : "UsergetUserInfoAction",
		data : {
			userName : "userName",
		},
		dataType : "json",
		success : function(data2) {
			var d2 = eval("(" + data2 + ")");
			alert(d2.idCard);
			// 设置scores
			$("#txt_score").attr("readonly", "false");
			$("#txt_score").val(d2.scores);
			$("#txt_score").attr("readonly", "true");
			//设置rank
			$("#txt_rank").attr("readonly", "false");
			$("#txt_rank").val(d2.rank);
			$("#txt_rank").attr("readonly", "true");
			//设置真实姓名
			$("#name").attr("readonly", "false");
			$("#name").val(d2.name);
			$("#name").attr("readonly", "true");
			//设置身份证号
			$("#idnum").attr("readonly", "false");
			$("#idnum").val(d2.idCard);
			$("#idnum").attr("readonly", "true");
			//设置地址
			$("#address").attr("readonly", "false");
			$("#address").val(d2.address);
			$("#address").attr("readonly", "true");
			//设置电话
			$("#phoneNum").attr("readonly", "false");
			$("#phoneNum").val(d2.phone);
			$("#phoneNum").attr("readonly", "true");
			//设置电子邮箱
			$("#email").attr("readonly", "false");
			$("#email").val(d2.email);
			$("#email").attr("readonly", "true");
		}
	});
}