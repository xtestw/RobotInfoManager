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
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>设置</h2>
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
		<table class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr>
				 <th>stationName</th>
				 <th>standardPtName</th>
				 <th>orientPtName</th>
				 <th>instHeight</th>
				 <th>tagtHeight</th>
				 <th>temp</th>
				 <th>pressure</th>
				 <th>humidity</th>
				 <th>seril</th>
				 <th>morphReport</th>
				 <th>createDate</th>
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
