<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
    <title>monitor</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

	<link href="/robot/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/lib/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/func.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/stylesheets/theme.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/lib/font-awesome/css/font-awesome.css"><%-- 
	 <script src="<%=request.getContextPath()%>/lib/jquery-1.7.2.min.js" type="text/javascript"></script> --%>
      <script src="<%=request.getContextPath()%>/js/jquery1.9.1.js" type="text/javascript"></script>
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
    </style>
    <script type="text/javascript">

    function go(url)
    {
        var strSession="${sessionScope.curProject}".toString();
    	if (strSession=="")   
    	{
    		alert("请先选择项目！");
    		 window.location.href="project_list.action";
    	}else
    	{
    		window.location.href=url;
    	}
    	
    }</script>
   <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  
	<script src="js/jquery.dataTables.js" type="text/javascript"></script>
  	 <script src="js/TableTools.js"type="text/javascript"></script>
    <script src="js/ZeroClipboard.js"type="text/javascript"></script>
    <link href="/robot/css/TableTools.css" rel="stylesheet" type="text/css"/>
   <script src="js/dataTables.bootstrap.js" type="text/javascript"></script>
   