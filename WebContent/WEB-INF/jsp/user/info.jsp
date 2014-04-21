<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 
        <%@include file="../inc/head.jsp"%>
          <script type="text/javascript">
          $(document).ready(function() {                    
				$('.datatable').dataTable( {        				
				"oLanguage": {
				"sUrl": "/robot/lib/zh_CN.json"
			} 
		});
} );</script>
<script type="text/javascript">
	function user_update()
	{
		
		if ($("#username").val()!=="" && $("#prepassword").val()!="" && $("#curpassword").val()!="" && $("#recurpassword").val()!="" )
		{	if ( $("#password").val()==$("#password").val( ))
			$.ajax({
				url:'project_update.action',
				type:'post',
				data:({projectName:"fdfda",projectNote:"Aa"}),
				success:function(results)
				{
					results=results["projectNote"];
					$("#content").html(results);
				/* 	for (var p in results)
						$("#content").innerHTML+=p+":"+results[p]+"<br/>"; */
				}
				});
		/* 		$("#user_form").submit(); */
			else
				alert("两次输入新密码不一致");}
		else{
				alert("密码不能为空");
			}
	}
</script>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>个人账号设置</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						个人信息：
					</li>
					<li>
						账号 <span class="divider">/</span>
					</li>
					<li>
						设置 <span class="divider">/</span>
					</li>
				
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		    <div class="dialog">
      		<div class="">
            <div class="block-body">
                <form action="user_update.action" id="user_form" method="post">
                    <label>用户名</label>
                    <input type="text" class="span12" name="username" id="username" disabled="disabled" value="${sessionScope.loginUser.userName}">
                    <label>原密码</label>
                    <input type="password" class="span12" name="prepassword" id="prepassword">
                    <label>新密码</label>
                    <input type="password" class="span12" name="curpassword" id="curpassword">
                    <label>确认新密 码</label>
                    <input type="password" class="span12" name="recurpassword" id="recurpassword">
 					<a href="javascript:void(0)" class="btn btn-primary pull-right" onclick="user_update()">修改</a>
                    <div class="clearfix"></div>
                </form>
            </div>
        </div>
    </div>
	
        </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
