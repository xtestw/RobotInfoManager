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
		<thead><!-- 
			private String srial;
	private String name;
	private String port;
	private String dataFormat;
	private Integer baud;
	private Integer timeOutSet;
	 -->
			<tr>
				 <th>srial</th>
				 <th>name</th>
				 <th>port</th>
				 <th>dataFormat</th>
				 <th>baud</th>
				 <th>timeOutSet</th>
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${instrumentInfos}" >
		<tr>
			<td class="center">${item.srial }</td>
			<td class="center">${item.name }</td>
			<td class="center">${item.port }</td>
			<td class="center">${item.dataFormat }</td>
			<td class="center">${item.baud }</td>
			<td class="center">${item.timeOutSet }</td>
			
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