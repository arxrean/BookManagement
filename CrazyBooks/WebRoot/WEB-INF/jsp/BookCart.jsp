<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat,java.util.Date" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!--List booksIdList = new ArrayList();booksIdList.add(1);booksIdList.add(2);booksIdList.add(3);booksIdList.add(4);booksIdList.add(5);session.setAttribute("booksInCart", booksIdList);
-->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>BookCart</title>
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
		$("#btn_submit").bind("click",function(){
			window.location.href="ToSuccessHtmlAction.action";
		});
	});
</script>
<script src="js/simpleCart.min.js">
	
</script>
<!-- slide -->
</head>
<body>
	<!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="col-md-4 world"></div>
				<div class="col-md-4 logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>
				</div>

				<div class="col-md-4 header-left">
					<p class="log">
						<span>您好，***</span><a href="account.html">注销</a>
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
				<div class="clearfix"></div>
				<!---pop-up-box---->
				<script type="text/javascript" src="js/modernizr.custom.min.js"></script>
				<link href="css/popuo-box.css" rel="stylesheet" type="text/css"
					media="all" />
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
	<div class="container">
		<div class="bookcart">
			<h1>我的借阅车</h1>
			<hr>
			<form id="cartTable" action=" " method="post">
				<table style="width: 1099px; ">
					<tr>
						<th style="width: 157px">图书编号</th>
						<th style="width: 157px">图书名</th>
						<th style="width: 157px">作者</th>
						<th style="width: 157px">出版社</th>
						<th style="width: 157px">价格</th>
						<th style="width: 157px">归还日期</th>
						<th style="width: 157px">小计</th>
						<th style="width: 157px"></th>
					</tr>  
					<s:iterator var="cartItem" value="#session.bookCart.cartItems">
					<tr>
					<td><s:property value="#cartItem.book.id"/></td>
					<td><s:property value="#cartItem.book.name"/></td>
					<td><s:property value="#cartItem.book.author"/></td>
					<td><s:property value="#cartItem.book.pubHouse"/></td>
					<td><font style="color:red;">￥<s:property value="#cartItem.book.price"/></font></td>
					<td><input type="date" name="<s:property value="#cartItem.date"/>" value="<s:property value="#cartItem.date"/>" onmouseout="flush()"/></td>
					</tr>
					</s:iterator>
				</table>
				<span>金额：<span id="money">440</span>元</span>
			</form>
			<script type="text/javascript">
				function $(id)
				{
				return doucument.getElemetById(id);
				}
				function flush()
				{
				$("cartTable").submit();
				}
				
				</script>
			<div class="register-but">
				<form>
					<input id="btn_submit" type="button" value="提交">
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
	</div>

	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="footer-top">
				<div class="col-md-4 top-footer1">
					<h2>Newsletter</h2>
					<form>
						<input type="text" value="" onfocus="this.value='';"
							onblur="if (this.value == '') {this.value ='';}"> <input
							type="submit" value="SUBSCRIBE">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="footer-bottom">
			<div class="container">
				<div class="col-md-3 footer-bottom-cate">
					<h6>Categories</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>

					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate">
					<h6>Feature Projects</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>

					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate">
					<h6>Top Brands</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>
						<li><a href="#">Ultrices id du</a></li>
						<li><a href="#">Commodo sit</a></li>

					</ul>
				</div>
				<div class="col-md-3 footer-bottom-cate cate-bottom">
					<h6>Our Address</h6>
					<ul>
						<li>Aliquam metus dui.</li>
						<li>orci, ornareidquet</li>
						<li>ut,DUI.</li>
						<li>nisi, dignissim</li>
						<li>gravida at.</li>
						<li class="phone">PH : 6985792466</li>
					</ul>
				</div>
				<div class="clearfix"></div>
				<p class="footer-class">
					Copyright &copy; 2015.Company name All rights reserved.<a
						target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>
			</div>
		</div>
	</div>

	<!--//footer-->
</body>
</html>