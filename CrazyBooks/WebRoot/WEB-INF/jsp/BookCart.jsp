<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link href="css/popuo-box.css" rel="stylesheet" type="text/css">
<title>Home</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Fashion Mania Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/zy_mainPage.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/responsiveslides.min.js"></script>
   <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
				<div class="col-sm-4 logo">
					<a href="index-mainPage"><img src="images/logo.png" alt=""></a>	
				</div>
				<div style="float:right;margin-right: 70px;margin-top: 20px;"><form method="get" action="book-findBooksBySomething.action">
				<input type="hidden" name="page" value="1"/>
				<input type="text" name="search" style="border:1px solid #52D0C4;width:200px;height: 40px;border-color: #52D0C4;"/><input type="submit" value="搜索" style="width:70px;height: 40px;background-color: #52D0C4;bor "/></form></div>
			<div class="col-sm-4 header-left">	
			<s:if test="#session.userName!=null">
			<p class="log">
						<a href="ToUserInfoHtmlAction.action"><s:property value="#session.userName"/></a></p>
			</s:if>	
			<s:else>
					<p class="log"><a href="ToUserLoginHtmlAction.action"  >登陆</a>
						<span>or</span><a  href="ToUserRegisterHtmlAction.action"  >注册</a></p>
						</s:else>
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="col-sm-2 number">
					<span><i class="glyphicon glyphicon-phone"></i>085 596 234</span>
				</div>
		 <div class="col-sm-8 h_menu4">
				<ul class="memenu skyblue">
				      <s:iterator var="clist" value="#session.cList">
				      <li class="grid"><a  href="book-findBooksByCid?page=1&&cid=<s:property value='#clist.id'/>"><s:property value="#clist.name"/></a>
				      <div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<s:iterator var="ct" value="#clist.categorytwos">
										<li><a href="book-findboosByCoid?coid=<s:property value='#ct.id'/>&&page=1"><s:property value="#ct.name"/></a></li>
										</s:iterator>
									</ul>	
								</div>							
							</div>
						  </div>
						</div>
				      </s:iterator>
			  </ul> 
			</div>
				<div class="col-sm-2 search">		
		</div>
				</div>
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>			
	<!---->		
		</div>
	</div>
	<!--//header-->
	<div class="container">
		<div class="bookcart">
			<h1>我的借阅车</h1>
			<hr>
				<table style="width: 1399px; ">
					<tr>
						<td >编号</td>
						<td >书名</td>
						<td >作者</td>
						<td >出版社</td>
						<td >价格</td>
						<td >归还日期</td>
						<td >小计</td>
						<td >移除</td>
					</tr> 
					<s:iterator var="cartItem" value="#session.bookCart.cartItems">
					<tr>
					<td><s:property value="#cartItem.book.id"/></td>
					<td><s:property value="#cartItem.book.name"/></td>
					<td><s:property value="#cartItem.book.author"/></td>
					<td><s:property value="#cartItem.book.pubHouse"/></td>
					<td><font style="color:red;">￥<s:property value="#cartItem.book.price"/></font></td>
					<td><input type="date" name="time" id="<s:property value='#cartItem.calendar'/>" onblur="setTime(this,<s:property value='#cartItem.book.id'/>)"/></td>
					<td><span id="<s:property value="#cartItem.book.id"/>">￥<s:property value="#cartItem.subTotal"/></span></td>
					<td><a href="bookCart-removeItem.action?bid=<s:property value="#cartItem.book.id"/>">删除</a></td>
					</tr>
					</s:iterator>
				</table>
				<span>金额：<span id="money"><font style="color:red;font-size: large;"><s:property value="#session.bookCart.totalPrice"/></font></span>元</span>
			<script type="text/javascript">
				function getXmlHttpObject() {
					var xmlHttpRequest;
					if (window.ActiveXObject) {
						xmlHttpRequest = new ActiveXObject("Microsoft.XMLHTTP");
					} else {
						xmlHttpRequest = new XMLHttpRequest();
					}
					return xmlHttpRequest;
				}
				var myxmlHttpRequest="";
				var spanid;
				function setTime(obj,sid)
				{
				myxmlHttpRequest=getXmlHttpObject();
				var id=obj.id;
				var url="bookCart-setTime.action?calendar="+$(id).value+"&&bid="+sid+"&&currentTime="+new Date();
				myxmlHttpRequest.open("get",url,true);
				spanid=sid;
				myxmlHttpRequest.onreadystatechange=getPrice;
				myxmlHttpRequest.send(null);
				}
				function getPrice() {
				if(myxmlHttpRequest.readState==4)
						$(spanid).innerHTML="";
						$(spanid).innerHTML=myxmlHttpRequest.responseText;
				}
				function getValue(id) {
					return document.getElementById(id).value;
				}
				function $(id)
				{
				return document.getElementById(id);
				}
			</script>
			<div class="register-but">
				<form>
					<input id="btn_submit" type="button" value="提交" onclick="javascript:window.location.href='UserinsertIntoBorrowAction'">
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