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
		<h2>选择项目</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						项目管理：
					</li>
					<li>
						选择项目 <span class="divider">/</span>
					</li>
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		<table class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr>
				 <th>项目名称</th>
				 <th>项目描述</th>
				 <th>操作</th>
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${projects}" >
		<tr>
			<td class="center">${item.projectName }</td>
			<td class="center">${item.projectNote }</td>
			<td class="center">
			<c:if test="${(!empty sessionScope.curProject) && item.projectName==sessionScope.curProject.projectName}" >
				<a href="#">已选择 </a>
			</c:if>
			<c:if test="${empty sessionScope.curProject || item.projectName!=sessionScope.curProject.projectName}" >
				<a href="project_select.action?projectName=${item.projectName }">选择 </a>
			</c:if>
			</td>
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
