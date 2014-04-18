<%@page import="com.robot.model.PointInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 
        <%@include file="../inc/head.jsp"%>
        <script type="text/javascript"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
         <script src="http://code.highcharts.com/highcharts.js"></script>
        <script src="<%=request.getContextPath()%>/js/bootstrap-select.min.js"></script>
       <script type="text/javascript">
          $(function () {  /*  
              	$('.datatable').dataTable( {        				
				"oLanguage": {
					"sUrl": "/robot/lib/zh_CN.json"
				}   });   */                  
			                                                         
                       $("#select_pointgroup").change(function()
                         {
                           var sld=$(this).children('option:selected').val();
						   if (sld=='--选择点组--') return;
                    	   $.ajax({
           					url:'xyzMove_queryPoint.action',
           					type:'post',
           					data:({PGName:sld+""}),
           					success:function(results)
           					{
           					   alert(results.toString());
           					}
           					});
                           });                                                                     
        	});                             
          function click2(u,d){
        		
        	}
          </script>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
       <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css"rel="stylesheet" type="text/css"></link>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>选择项目</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						基本功能：
					</li>
					<li>
						分页 <span class="divider">/</span>
					</li>
					<li>
						排序 <span class="divider">/</span>
					</li>
					<li>
						过滤
					</li>
				</ul>
			</div>
			</div>
			<div class="row-fluid">
			<form class="form-inline">
				<select class="selectpicker"  title="选择点组" id="select_pointgroup">
				 <option>--选择点组--</option>
				 <c:forEach var="item" items="${pointGroupInfos}">
				 	<option value="${item.pointGroupNameString }">${item.pointGroupNameString }</option>
				 </c:forEach>
				</select>
				<select class="selectpicker"  title="选择点名" id="select_point">
				 <option>--选择点--</option>
				 </select>
      <a class="btn btn-primary" href="#">确定</a>
			</form>
				<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto">
				</div>
	  
            </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
