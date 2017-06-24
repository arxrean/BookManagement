<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/theme.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="divMenue">
<div class="divIcon"><img src="images/crazyBook.png"/></div>
<div class="divMenueL">
<div class="divT">
<div class="divTop"><a class="a1" href="#">网站导航</a></div>
<div class="divTop"><a class="a1" href="#">客户服务</a></div>
<div class="divTop"><a class="a1" href="#">企业采购</a></div>
<div class="divTop"><a class="a1" href="#">我的书架</a></div>
<div class="divTop"><a class="a1" href="#">我为书狂</a></div>
<s:if test="#session.user!=null">
<div class="divTop">welcome!<s:property value="#session.user.userName"/></div>
</s:if>
<s:else>
<div class="divTop"><a class="a2" href="ToRegisterAction">免费注册</a></div>
<div class="divTop"><a class="a1" href="ToLoginAction">您好，请登录</a></div>
</s:else>
<div class="divTop"></div>
</div>
<div class="divT">
<div class="searchDiv">
<form>
<input type="text" style="width:80%;height:90%;border:2px solid red;"/>
<input type="submit" style="background-color: red;color:white;width: 16%;height:90%;border:2px solid red" value="搜索"/>
</form>
</div>
<div class="divCart"><img src="#"/><a href="#" class="a3">我的书架</a></div>
</div>
<div class="divB">
<s:iterator var="clist" value="#session.cList">
<div class="divCategory1"><font style="font-size: 20px;"><a href="#" class="a4"><s:property value="#clist.name"/></a></font></div>
</s:iterator>
</div>
</div>
</div>
<div class="divL">
<div class="divLItem"><a href="#"><img src="#"/></a></div>
<div class="divLItem"><a href="#"><img src="#"/></a></div>
<div class="divLItem"><a href="#"><img src="#"/></a></div>
<div class="divLItem"><a href="#"><img src="#"/></a></div>
<div class="divLItem"><a href="#"><img src="#"/></a></div>
</div>
</body>
</html>