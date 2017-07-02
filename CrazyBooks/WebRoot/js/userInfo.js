$(document).ready(function() {
	$(".memenu").memenu();
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
			alert("Ajax浼犺緭閿欒锛�");
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
								+ "<a onclick='deleteUserName()'>[娉ㄩ攢]</a>");
				// 璁剧疆鐢ㄦ埛鍚�
				$("#txt_userName").attr("readonly", "false");
				$("#txt_userName").val(d.sessionType);
				$("#txt_userName").attr("readonly", "true");
			}
		},
		error : function() {
			alert("Ajax浼犺緭閿欒锛");
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
			// 璁剧疆scores
			$("#txt_score").attr("readonly", "false");
			$("#txt_score").val(d2.scores);
			$("#txt_score").attr("readonly", "true");
			//璁剧疆rank
			$("#txt_rank").attr("readonly", "false");
			$("#txt_rank").val(d2.rank);
			$("#txt_rank").attr("readonly", "true");
			//璁剧疆鐪熷疄濮撳悕
			$("#name").attr("readonly", "false");
			$("#name").val(d2.name);
			$("#name").attr("readonly", "true");
			//璁剧疆韬唤璇佸彿
			$("#idnum").attr("readonly", "false");
			$("#idnum").val(d2.idCard);
			$("#idnum").attr("readonly", "true");
			//璁剧疆鍦板潃
			$("#address").attr("readonly", "false");
			$("#address").val(d2.address);
			$("#address").attr("readonly", "true");
			//璁剧疆鐢佃瘽
			$("#phoneNum").attr("readonly", "false");
			$("#phoneNum").val(d2.phone);
			$("#phoneNum").attr("readonly", "true");
			//璁剧疆鐢靛瓙閭
			$("#email").attr("readonly", "false");
			$("#email").val(d2.email);
			$("#email").attr("readonly", "true");
		}
	});
}

function addCategoryOne(){
	$.ajax({
		type : "post",
		url : "UsergetUserInfoAction",
		data : {
			userName : "userName",
		},
		dataType : "json",
		success : function(data) {
			
		}
	});
}