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
				},
				"sDom": 'T<"clear">lfrtip',
	        	"oTableTools": {
	           	 "sSwfPath": "/robot/media/copy_csv_xls_pdf.swf"
	        	} 
		});
} );</script>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>站点信息</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						信息查询：
					</li>
					<li>
						站点信息 <span class="divider">/</span>
					</li>
					
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		<table class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr>
				 <th>站点名称</th>
				 <th>设站点</th>
				 <th>定向点</th>
				 <th>仪器高度</th>
				 <th>目标高度</th>
				 <th>温度</th>
				 <th>气压</th>
				 <th>湿度</th>
				 <th>机器序列号</th>
				 <th>监测报告</th>
				 <th>创建日期</th>
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${stationInfos}" >
		<tr>
			<td class="center">${item.stationName }</td>
			<td class="center">${item.standardPtName }</td>
				<td class="center">${item.orientPtName }</td>
			<td class="center">${item.instHeight }</td>
				<td class="center">${item.tagtHeight }</td>
			<td class="center">${item.temp }</td>
				<td class="center">${item.pressure }</td>
			<td class="center">${item.humidity }</td>
				<td class="center">${item.seril }</td>
			<td class="center">${item.morphReport }</td>
			<td class="center">${item.createDate }</td>
			
		</tr>
		</c:forEach>
		</tbody>
		</table>
	
        </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
