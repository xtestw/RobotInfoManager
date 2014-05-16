<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>

                 <script type="text/javascript">
                 	window.onload=function()
                 	{
                 		setInterval("redirect();",1000); 
                 	}
                 	function redirect() 
                 	 { 
                 	 window.location.href="project_list.action"; 
                 	 } 
                 </script>
</head>
<html>
<body class="">
<div>登录成功！正在<a href="project_list.action">跳转</a></div>
  </body>
</html>
