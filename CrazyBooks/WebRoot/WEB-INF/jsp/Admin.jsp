<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Register</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

















</script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>
	$(document).ready(function() {
		$(".memenu").memenu();
	});
</script>
<script src="js/simpleCart.min.js">
	
</script>
<!-- slide -->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
	media="all" />
</head>
<body>
	<!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="col-md-4 world">
					<ul>
						<li><select class="in-drop">
								<option>English</option>
								<option>Japanese</option>
								<option>French</option>
						</select></li>
						<li><select class="in-drop1">
								<option>Dollar</option>
								<option>Euro</option>
								<option>Yen</option>
						</select></li>
					</ul>
				</div>
				<div class="col-md-4 logo">
					<a><img src="images/logo.png" alt=""></a>
				</div>

				<div class="col-md-4 header-left">
					<p class="log">
						<s:if test="#session.adminName!=null">
							<s:property value="#session.adminName" />
							<a href="adminDeleteSession.action">[注销]</a>
						</s:if>
						<s:else>
							<a href="ToUserLoginHtmlAction.action">登录</a>
							<span>or</span>
							<a href="ToUserRegisterHtmlAction.action">注册</a>
						</s:else>
					</p>
					<div class="cart box_1">
						<a href="checkout.html">
							<h3>
								<div class="total">
									<span class="simpleCart_total"></span>
								</div>
								<img src="images/cart.png" alt="" />
							</h3>
						</a>
						<p>
							<a href="javascript:;" class="simpleCart_empty">Empty Cart</a>
						</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="col-md-2 number">
					<span><i class="glyphicon glyphicon-phone"></i>085 596 234</span>
				</div>
				<div class="col-md-8 h_menu4">
					<ul class="memenu skyblue">
						<li><a href="#">用户管理</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1">
										<div class="h_nav">
											<ul>
												<li><a href="AdminViewUsersAction?page=1">查看用户</a></li>
												<li><a href="products.html">封禁用户</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div></li>
						<li><a href="#">图书管理</a>
							<div class="mepanel">
								<div class="row">
									<div class="h_nav">
										<ul>
											<li><a href="products.html">添加图书</a></li>
											<li><a href="products.html">修改图书</a></li>
											<li><a href="products.html">删除图书</a></li>
										</ul>
									</div>
								</div>
							</div></li>
						<li class="grid"><a href="#">信息统计</a>
							<div class="mepanel">
								<div class="row">
									<div class="h_nav">
										<ul>
											<li><a href="products.html">新增图书</a></li>
											<li><a href="products.html">最热图书</a></li>
										</ul>
									</div>
								</div>
							</div></li>
						<li><a class="color6" href="contact.html">帮助</a></li>
					</ul>
				</div>

				<div class="clearfix"></div>
				<!---pop-up-box---->
				<script type="text/javascript" src="js/modernizr.custom.min.js"></script>
				<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
				<!---//pop-up-box---->
				<div id="small-dialog" class="mfp-hide">
					<div class="search-top">
						<div class="login">
							<input type="submit" value=""> <input type="text"
								value="Type something..." onfocus="this.value = '';"
								onblur="if (this.value == '') {this.value = '';}">
						</div>
						<p>Shopping</p>
					</div>
				</div>
				<script>
					$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type : 'inline',
							fixedContentPos : false,
							fixedBgPos : true,
							overflowY : 'auto',
							closeBtnInside : true,
							preloader : false,
							midClick : true,
							removalDelay : 300,
							mainClass : 'my-mfp-zoom-in'
						});

					});
				</script>
				<!---->
			</div>
		</div>
	</div>
	<!--//header-->







	<div class="container" style="height:800px">
		<s:if test="#request.users!=null">
			<form action="AdminSearchUsersAction" method="post">
				<span><input type="hidden" value="1" name="page"></span> <span><input
					type="text" name="searchContent" id="txt_search"></span> <span>
					<select name="searchType">
						<option value="userName">用户名</option>
						<option value="sex">性别</option>
						<option value="balance">余额</option>
						<option value="idnum">身份证号</option>
						<option value="name">真实姓名</option>
						<option value="email">邮箱</option>
						<option value="address">地址</option>
						<option value="rank">等级</option>
						<option value="score">积分</option>
						<option value="phoneNum">手机号</option>
				</select>
				</span> <input type="submit" value="搜索"><input type="button" value="重置"
					onclick="javascript:window.location.href='AdminViewUsersAction?page=1';">

			</form>
		</s:if>
		<table>
			<s:if test="#request.users!=null">
				<thead>
					<tr>
						<th>用户名</th>
						<th>身份证号</th>
						<th>真实姓名</th>
						<th>性别</th>
						<th>余额</th>
						<th>电子邮箱</th>
						<th>地址</th>
						<th>积分</th>
						<th>等级</th>
						<th>电话号码</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="#request.users.list" var="user">
						<tr id="<s:property value="#user.userName"/>">
							<td><s:property value="#user.userName" /></td>
							<td><s:property value="#user.idnum" /></td>
							<td><s:property value="#user.name" /></td>
							<td><s:property value="#user.sex" /></td>
							<td><s:property value="#user.balance" /></td>
							<td><s:property value="#user.email" /></td>
							<td><s:property value="#user.address" /></td>
							<td><s:property value="#user.score" /></td>
							<td><s:property value="#user.rank" /></td>
							<td><s:property value="#user.phoneNum" /></td>
							<td><a href="#">封禁</a></td>
						</tr>
					</s:iterator>
				</tbody>
			</s:if>
		</table>
		<s:if test="#request.users!=null">
		当前是第<s:property value="#request.users.page" />页
		<s:if test="#request.users.page==1">
				<a onclick="javascript:alert('已经是第一页!')" style="cursor:hand">上一页</a>
			</s:if>
			<s:else>
				<a
					href="AdminViewUsersAction?page='<s:property value="#request.users.page-1"/>'"
					style="cursor:hand">上一页</a>
			</s:else>
			<s:if test="#request.users.page==#request.users.pageSize">
				<a onclick="javascript:alert('已经是最后一页!')" style="cursor:hand">下一页</a>
			</s:if>
			<s:else>
				<a
					href="AdminViewUsersAction?page='<s:property value="#request.users.page+1"/>'"
					style="cursor:hand">下一页</a>
			</s:else>
		</s:if>
	</div>






	<!--footer-->
	<div class="footer">
		<div class="footer-bottom">
			<div class="container">
				
				<div class="clearfix"></div>
				<p class="footer-class">
					Copyright &copy; 2015.Company name All rights reserved.<a
						target="_blank" href="http://sc.chinaz.com/moban/">crazybooks</a>
				</p>
			</div>
		</div>
	</div>

	<!--//footer-->
</body>
</html>