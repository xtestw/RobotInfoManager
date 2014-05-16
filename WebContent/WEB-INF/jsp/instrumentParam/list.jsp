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
		<h2>仪器参数查询</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						信息查询：
					</li>
					<li>
						仪器参数查询 <span class="divider">/</span>
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
				 <th>机器序列号</th>
				 <th>机器名</th>
				 <th>串口</th>
				 <th>波特率</th>
				 <th>协议</th>
				 <th>超时设置</th>
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${instrumentParams}" >
		<tr>
			<td class="center">${item.srial }</td>
			<td class="center">${item.name }</td>
			<td class="center">${item.port }</td>
			<td class="center">${item.baud }</td>
			<td class="center">${item.dataFormat }</td>
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
