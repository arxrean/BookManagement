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
	<!--图书信息-->
	<div class="container"
		style="width:1200px;height:300px;margin-top:20px;">
		<div style="border: #EBEBEB solid 2px;height: 100%;">
		<img name="picture" id="picture"
			style="width:250px;height:100%;float:left;border:1px #EBEBEB solid;" src="<s:property value="bookDetail.picture"/>" />
		<table style="display: block;">
			<tr>
				<td style="font-size: x-large;width=:100%;height: 50px;">图书名称:</td>
				<td style="font-size: lager; width=:100%;height: 50px;">《<s:property value="bookDetail.name"/>》</td>
			</tr>
			<tr>
				<td style="font-size: x-large;width=:100%;height: 50px%;">图书编号:</td>
				<td style="font-size: lager;width=:100%;height: 50px;"><s:property value="bookDetail.id"/></td>
			</tr>
			<tr><td style="font-size: x-large;width=:100%;height: 50px%;">原出版社</td>
			<td style="font-size: lager;width=:100%;height: 50px;">:<s:property value="bookDetail.pubHouse"/></td></tr>
			<tr><td style="font-size: x-large;width=:100%;height: 50px%;">作者</td>
			<td style="font-size: lager;width=:100%;height: 50px;">:<s:property value="bookDetail.author"/></td></tr>
			<tr>
				<td><a href="bookCart-addToCart.action?bid=<s:property value='bookDetail.id'/>">加入借阅车</a></td>
			</tr>
		</table>
	</div>
	</div>
	<div class="container" style="width:1200px;margin-top:30px;">
		<div class="container"
			style="width:1200px;float:left;">
				<div><a><font style="font-size: xx-large;color: #52D0C4;">详细信息</font></a></div>
			<div style="width:85%;"><s:property value="bookDetail.intro"/></div>
		</div>
		<div class="container"
			style="width:1200px;">
			
				<a><font style="font-size: xx-large;color: #52D0C4;">图书评价</font></a>
			
			<table id="myComment"
			style="width:770px;margin-left:5px;margin-top:30px;">
			<tr style="border:1px">
				<s:iterator var="com" value="bookDetail.commentaries">
				<tr><td><font style="font-size: xx-large; color:black;"><s:property value="#com.users.userName"/></font>&nbsp&nbsp&nbsp&nbsp<s:property value="#com.commentTime"/></td><td></td></tr>
				<tr><td><font style="font-size: large; color:black;">&nbsp&nbsp&nbsp<s:property value="#com.commentary"/></font></td><td></td><td></tr>
				</s:iterator>
			</tr>
		</table>
		<div class="divcontainer">
		<div class="content-top" > 
			<font style="font-size: 30px;">HOT BOOKS</font>
			<hr style="height:5px;border:1px gray solid;background-color: gray;"/>
			<div class="content-top1" >
			<s:iterator var="bn" value="#session.bnList">
				<div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem">
						<a href="book-findBookDetail.action?id=<s:property value='#bn.id'/>">
							<img class="img-responsive" src="<s:property value='#bn.picture'/>" alt="" />
						</a>
						<h3><a href="book-findBookDetail.action?id=<s:property value='#bn.id'/>"><s:property value='#bn.name'/></a></h3>
						<div class="price">
								<h5 class="item_price">￥<s:property value='#bn.price'/></h5>
								<a href="bookCart-addToCart.action?bid=<s:property value='#bn.id'/>" class="item_add">Add To Cart</a>
								<div class="clearfix"> </div>
						</div>
					</div>
				</div>	
				</s:iterator>	

			<div class="clearfix"> </div>
			</div>
			</div>
		</div>
		</div>
	</div>
	
	<!--footer-->
	<div class="footer">
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




