<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
					<a href="index.html"><img src="images/logo.png" alt=""></a>	
				</div>
				<div style="float:right;margin-right: 70px;margin-top: 20px;"><form method="get" action="book-findBooksBySomething.action">
				<input type="hidden" name="page" value="1"/>
				<input type="text" name="search" id="search" style="border:1px solid #52D0C4;width:200px;height: 40px;border-color: #52D0C4;"/><input type="submit" value="搜索" style="width:70px;height: 40px;background-color: #52D0C4;bor "/></form></div>
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
<!--banner-->
<div class="banner" >
	<div class="col-sm-3 banner-mat">
			<div id="id_divcates">
				<dl>
					<s:iterator var="c" value="#session.cList">
						<dt>
							<big><s:property value="#c.name" /></big>
						</dt>
						<s:iterator var="ct" value="#c.Categorytwos">
							<dd class="dd1">
								<a href="book-findboosByCoid?coid=<s:property value='#ct.id'/>&&page=1" class="a2"><s:property value="#ct.name" /></a>
							</dd>
						</s:iterator>
						<br/>
						<br/>
						<br/>
						<br/>
					</s:iterator>
				</dl>
			</div>
		</div>
	<div class="col-sm-6 matter-banner">
	 	<div class="slider">
	    	<div class="callbacks_container">
	      		<ul class="rslides" id="slider">
	        		<li>
	          			<a href="book-findBooksBySomething.action?search=A" id="herfa"><img src="images/1.jpg" id="img" style="width: 100%;height: 65%;"></a>
	       			 </li>	
	      		</ul>
	      		<div style="margin-top: 20px;">
	      		<!--<marquee direction="left" width="100%;" behavior="scroll" loop="-1">-->
	      		<ul class="u1">
	      		<li class="l1"><a href="book-findBookDetail.action?id=5" class="a"><img src="images/cover/5.png" style="width:100%;height: 100%;border:1px solid #EBEBEB;"/></a></li>
	      		<li class="l1"><a href="book-findBookDetail.action?id=1"><img src="images/cover/1.png" style="width:100%;height: 100%;border:1px solid #EBEBEB;"/></a></li>
	      		<li class="l1"><a href="book-findBookDetail.action?id=2"><img src="images/cover/2.png" style="width:100%;height: 100%;border:1px solid #EBEBEB;"/></a></li>
	      		<li class="l1"><a href="book-findBookDetail.action?id=3"><img src="images/cover/3.png" style="width:100%;height: 100%;border:1px solid #EBEBEB;"/></a></li>
	      		
	      		</ul>
	      		
	      		</div>
	 	 	</div>
		</div>
	</div>
	<script type="text/javascript">
	function $(id)
	{
	return document.getElementById(id);
	}
	var i=1;
	function changePic()
	{
	$("img").src="images/"+i+".jpg";
	if(i==1)
	{
		$("herfa").href="book-findBooksBySomething.action?search=诗";
	
	}else if(i==2)
	{
		$("herfa").href="book-findBooksBySomething.action?search=诗";
	
	}
	i++;
	if(i>3)
	{
	i=1;
	}
	}
	setInterval("changePic()",3000);
	</script>
	<div class="infoDiv">
		<div id="divdymi">
		<h1><font style="font-family: sans-serif;font-size: 30px;">最新动态</font></h1>
		<hr style="color:black;border-top: 1px gray solid;"/>
		<ul style="list-style: none">
		<li><a href="#" class="a1">30万图书100减30，文艺分会场</a>
		
		<li><a href="#" class="a1">30万图书100减30，经管励志分会场</a>
	
		<li><a href="#" class="a1">倾听习总书记讲述“中国故事”</a>
		</ul>
		</div>
		<div class="divNBInfo">
		<h1><font style="font-family: sans-serif;font-size: 30px;">新书预约</font></h1>
		<hr style="color:black;border-top: 1px black solid;"/>
		<div class="bookDiv">
		<a href="#" class="a3"><img src="bookPic/1.jpg" style="width:100%;height: 60%;"/>
		<big>《哆啦A梦》</big>
		</a><font style="color:red;font-size:xx-large;">￥22.00</font><font style="font-size:large;color:gray; text-decoration: line-through;">￥52.00</font>
		<p>-------ljshfkhfoahfosafa</p>
		</div>
		</div>
	</div>
	<div class="clearfix"> </div>
</div>
<!--//banner-->
<!--content-->
<div class="content">
<div style="width: 100%;height:100%;">
	<div class="divcontainer">
			&nbsp&nbsp&nbsp&nbsp<font style="font-size: 40px;font-weight: bold;">HOT BOOKS</font>
			<hr>
			<div class="content-top1">
			<s:iterator var="bn" value="#session.bnList">
				<div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem" >
						<a href="book-findBookDetail.action?id=<s:property value='#bn.id'/>">
							<img class="img-responsive" src="<s:property value='#bn.picture'/>" alt="" />
						</a>
						<h3><a><s:property value='#bn.name'/></a></h3>
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
		<div class="divHot">
		<div style="width:100%;height: 8%;">
		<img src="images/newBookList.JPG" style="width: 90%;height:66;"/>
		</div>
		<div class="divList"></div>
		<div class="divList"></div>
		<div class="divList"></div>
	</div>
	</div>
	</div>
<div class="content">
<div style="width: 100%;height:100%;">
	<div class="divcontainer">
			<img src="images/newBookImg.JPG"/>
			<div class="content-top1">
			<s:iterator var="bn" value="#session.bnList">
				<div class="col-md-3 col-md2">
					<div class="col-md1 simpleCart_shelfItem" >
						<a href="book-findBookDetail.action?id=<s:property value='#bn.id'/>">
							<img class="img-responsive" src="<s:property value='#bn.picture'/>" alt="" />
						</a>
						<h3><a><s:property value='#bn.name'/></a></h3>
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
		<div class="divHot">
		<div style="width:100%;height: 8%;">
		<img src="images/newBookList.JPG" style="width: 90%;height:66;"/>
		</div>
		<div class="divList"></div>
		<div class="divList"></div>
		<div class="divList"></div>
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
						<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="SUBSCRIBE">
					</form>
			</div>
			<div class="clearfix"> </div>	
		</div>	
	</div>
	<div class="footer-bottom">
		<div class="container">
				<div class="col-sm-3 footer-bottom-cate">
					<h6>Categories</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>
						
					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate">
					<h6>Feature Projects</h6>
					<ul>
						<li><a href="#">Curabitur sapien</a></li>
						<li><a href="#">Dignissim purus</a></li>
						<li><a href="#">Tempus pretium</a></li>
						<li><a href="#">Dignissim neque</a></li>
						<li><a href="#">Ornared id aliquet</a></li>
						
					</ul>
				</div>
				<div class="col-sm-3 footer-bottom-cate">
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
				<div class="col-sm-3 footer-bottom-cate cate-bottom">
					<h6>Our Address</h6>
					<ul>
						<li>Aliquam metus  dui. </li>
						<li>orci, ornareidquet</li>
						<li> ut,DUI.</li>
						<li>nisi, dignissim</li>
						<li>gravida at.</li>
						<li class="phone">PH : 6985792466</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				<p class="footer-class">Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
			</div>
	</div>
</div>

<!--//footer-->
</body>
</html>