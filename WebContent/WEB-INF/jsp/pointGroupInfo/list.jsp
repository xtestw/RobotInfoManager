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
		<h2>点组信息</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						信息查询：
					</li>
					<li>
						点组信息 <span class="divider">/</span>
					</li>
					
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		<table class="table table-striped table-bordered table-hover datatable">
		<thead><!-- 
			private String pointGroupNameString;
	private String contianPoint;
	private String measurePeriod;
	private String measureMode;
	private int roundCount;
	private int tryCount;
	private String remark;
	private Date createTime; -->
	
			<tr>
				 <th>点组名称</th>
				 <th>包含点</th>
				 <th>测量时间段</th>
				 <th>测量模式</th>
				 <th>测回数</th>
				 <th>尝试次数</th>
				 <th>点组说明</th>
				 <th>点组创建日期</th>
				 
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${pointGroupInfos}" >
		<tr>
			<td class="center">${item.pointGroupNameString }</td>
			<td class="center">${item.contianPoint }</td>
			<td class="center">${item.measurePeriod }</td>
			<td class="center">${item.measureMode }</td>
			<td class="center">${item.roundCount }</td>
			<td class="center">${item.tryCount }</td>
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
