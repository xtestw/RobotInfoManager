<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <body class=""> 
	<jsp:include page="include/top.jsp"></jsp:include>
    
     <div class="row-fluid">
    <div class="dialog">
        <div class="block">
            <p class="block-heading">登陆</p>
            <div class="block-body">
                <form action="login_login.action" id="login_form" method="post">
                    <label>用户名</label>
                    <input type="text" class="span12" name="username" id="username">
                    <label>密 码</label>
                    <input type="password" class="span12" name="password" id="password">
                    <a href="register.jsp"  ><span style="position:relative;top: 5px;">注册</span></a>
 					<a href="javascript:void(0)" class="btn btn-primary pull-right" onclick="login()">登陆</a>
                    <div class="clearfix"></div>
                </form>
            </div>
        </div>
    </div>
</div>


    


	<jsp:include page="include/buttom.jsp"></jsp:include>
    
    
  </body>
</html>
