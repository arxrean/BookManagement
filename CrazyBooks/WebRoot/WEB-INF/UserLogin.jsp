<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UserLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style>
  td
  {
      font-size:10px
  }
  
  body{
	  margin: 0;
	  background: url(image/bg_login.jpg) no-repeat;
	  background-size: 100% 100%;
  }
  </style>
  <script type="text/javascript">
    function login(){
        var $login = $("input.btn_login");
		$login.bind("click", function() {
			$.ajax({
				type : "post",
				url : "UserLoginAction", 
			    data : {
			         userName : $("input[name=txt_userName]").val(),
					 password : $("input[name=txt_password]").val(),
                },
                dataType : "json",
				success : function(data) {
				    var json=eval("("+data+")");  
                    if(json.id=='1'){  
                        alert(json.msg);  
                        return;  
                    }
                    else{  
                        $("#frm").submit();  
                    }  
                },
				error : function() {
				}
			});
		});
    }
    function recieve(str) {
	    $.ajax({
			type : "post",
			url : "UserValidateLoginAction",
			data : {
				message : str,				
			},
			dataType : "json",
			success : function(data) {
				var d = eval("(" + data + ")");
				if (d.type == "error") {
					alter("用户名或密码错误！");
				} 
				else if(d.type == "disable"){
					alter("该用户被禁用！");
				}
				else
				{
				
				}
			}
        });
	}  
    </script>
  </head>
  
  <body> 
  <!-- 用户/管理员登录界面 -->
    <table height="800" width="1300" style="position:absolute;left:300px;top:50px">
	  <tr>
	    <td height="80" style="background:url(images/CrazyBook.jpg)no-repeat;">
	    </td>		    
	    <td >
        </td>
      </tr>		  

	  <tr align="center">
	    <td width="700" height="400">       
	    </td>
	    <td height="400">
	      <table height="200" align="center" style="border: 1px solid #83ACC0;">
	        <tr align="center">
		      <td width="350" height="80" colspan=2>
		        <strong>用户登录</strong>
		      </td>
	        </tr> 
	        <tr align="center" >
		      <td width="75" height="80">		  
		                   账号:
		      </td>
		      <td width="168">
		        <input type="text" name="userName" id="userName" value=""/>
		      </td>
	        </tr>
	        <tr align="center">
	  	      <td height="75">
		                   密码:
	 	      </td>
		      <td>
		        <input type="password" name="password" id="password" value=""/>
		      </td>
	        </tr>
	        <tr align="center">
		      <td height="75" colspan="2">
		        <input name="btn_login" id="btn_login" type="button" value="登录">
		        <input name="btn_reset" id="btn_reset" type="button" value="取消" />  
		      </td>
	        </tr>	        
	      </table>
	    </td>
	  </tr>
    </table>
    <table width="950" align="center" cellpadding="0" cellspacing="0" style="position:absolute;left:470px;top:858px">
	  <tr>
		<td style="border-left: 1px solid #83ACC0; border-top: 1px solid #83ACC0; border-right: 1px solid #83ACC0; padding-left: 8px; padding-top: 3px; padding-bottom: 2px; border-bottom: 1px solid #83ACC0">

		      版权信息
		</td>
	  </tr>
	  <tr>
		<td height="38" align="center" style="border: 1px solid #83ACC0">
		  Copyright? CrazyBooks Group All Rights Resered.
		</td>
	  </tr>
	</table>
    
  </body>
</html>
