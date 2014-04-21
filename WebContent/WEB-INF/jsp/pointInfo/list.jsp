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
		<h2>点信息</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						信息查询：
					</li>
					<li>
						点信息<span class="divider">/</span>
					</li>
		
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		<table class="table table-striped table-bordered table-hover datatable">
		<thead><!-- 
		private  String pointName;
	private String PointType;
	private String isSteady;
	private float x,y,z;
	private String remark;
	private Date createTimeDate; -->
			<tr>
				 <th>点名</th>
				 <th>点类型</th>
				 <th>isSteady</th>
				 <th>x</th>
				 <th>y</th>
				 <th>z</th>
				 <th>点说明</th>
				 <th>创建时间</th>
				 
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${pointInfos}" >
		<tr>
			<td class="center">${item.pointName }</td>
			<td class="center">${item.PointType }</td>
			<td class="center">${item.isSteady }</td>
			<td class="center">${item.x }</td>
			<td class="center">${item.y }</td>
			<td class="center">${item.z }</td>
			<td class="center">${item.remark }</td>
			<td class="center">${item.createTimeDate }</td>
	
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
