<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
    <body class="">
	<jsp:include page="include/top.jsp"></jsp:include>
    

   
     <div class="row-fluid">
    <div class="dialog">
        <div class="block">
            <p class="block-heading">注册</p>
            <div class="block-body">
                <form action="login_register.action" id="form_register" method="post">
                    <label>用户名:</label>
                    <input type="text" class="span12" name="userInfo.userName" id="username">
                    <label>密码:</label>
                    <input type="password" class="span12" name="userInfo.userPwd" id="pre_pwd">
                     <label>确认密码:</label>
                    <input type="password" class="span12" id="cfm_pwd">
                    <label>创建地点:</label>
                    <input type="text" class="span12" name="userInfo.createTime">
                
                 <div class="control-group">
                    <label  class="control-label" for="type">用户类型:</label>
                    <div class="controls" >
                            <input type="radio" name="userInfo.userRole"  value="admin" />管理人员
                            <input type="radio" name="userInfo.userRole" value="common"/>普通人员
                     </div>
                 
                  </div>
                    <a href="login.jsp" class="btn btn-primary pull-right" style="margin:4px 0 0 10px;">返回</a>
                      <a href="javascript:void(0)" class="btn btn-primary pull-right" style="margin:4px 0 0 10px;"onclick="register()">注册</a>
                    <div class="clearfix"></div>
                </form>
            </div>
        </div>
    </div>
</div>
	<jsp:include page="include/buttom.jsp"></jsp:include>
    
    
  </body>
</html>