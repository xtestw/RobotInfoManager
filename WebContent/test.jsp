<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>

    <meta charset="utf-8">
    <title>测量机器人</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
<script src="js/jquery-2.1.0.js" type="text/javascript"></script>

<script src="js/func.js" type="text/javascript" ></script>
<script type="text/javascript">

	function click2(){
	//	var  ajax=new Ajax.Request("project_update.action",
	//			{method:'post',parameters:{projectName:"fdfda",projectNote:"Aa"},onComplete:reaction,asynchronous:true});
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
		}
</script>
</head>
    <body >
	<a href="javascript:void(0)" onclick="click2()">test</a>
 <input type="button"  value="test" onclick="click2()"/>  
<div id="content">

</div>
    
  </body>
</html>