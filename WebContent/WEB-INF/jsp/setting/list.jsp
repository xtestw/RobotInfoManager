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
	<div style="height: 40px;padding-top:20px;"><span style="font-size:30px;font-weight:bold;">设置</span>
	
<!-- 	 <a id="modal-774920" href="#modal-container-774920" class="pull-right" data-toggle="modal">导出报表</a></p>
	       <div id="modal-container-774920" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-header">
					 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h3 id="myModalLabel">
						报表格式选择
					</h3>
				</div>
				<div class="modal-body ">
				<label class="radio"><input type="radio" name="geshi" value="excel">EXCEL</label>	
				<label class="radio"><input type="radio" name="geshi" value="txt">TXT</label>	
				 <input type="text" class="span6" placeholder="请输入文件名 默认为output" name="filename">
				 </div>
				<div class="modal-footer">
					 <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button> 
					 <button class="btn btn-primary" onclick="outdata()">导出</button>
				</div>
			</div> -->
	
	</div>	
			<div>
				<ul class="breadcrumb">
					<li>
						信息查询：
					</li>
					<li>
						设置 <span class="divider">/</span>
					</li>
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		<table id="info" class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr><!-- 
				 <th>ID</th> -->
				 <th>设置参数</th>
				 <th>值</th>
			</tr>
		</thead>
		<tbody>   
		<c:forEach var="item" items="${settings}" >
		<tr><%-- 
			<td class="center">${item.id }</td> --%>
			<td class="center">${item.setting }</td>
			<td class="center">
			${item.value }
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
