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
         } );

function querycontent()
{
	var sld=$("#select_pointgroup  option:selected").text()+"";
	var projectname="${sessionScope.curProject.projectName}"+"";
	 $.ajax({
			url:'qxWarning_query.action',
			type:'post',
			data:({PGName:sld+"",projectname:projectname}),
			success:function(results)
			{
						$("#info tbody").html("");
				        $.each(results.shouLians, function(i, item) {
				        	$("#info tbody").append(
				                    "<tr><td class=\"center\">" + item.topPointName + "</td>" + 
				                    "<td class=\"center\">" + item.botPointName + "</td>" + 
				                    "<td class=\"center\">" + item.nop + "</td>" + 
				                    "<td class=\"center\">" + item.qingXie + "</td>" + 
				                    "<td class=\"center\">" + item.theQXDiff + "</td>" + 
				                    "<td class=\"center\">" + item.totalQXDiff + "</td>" + 
				                    "<td class=\"center\">" + item.measureTime + "</td></tr>" 
					                  );
				        });
			}
			});                     
}
          </script>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>倾斜度预警</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						预警系统：
					</li>
					<li>
						倾斜度预警 <span class="divider">/</span>
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
      			<a class="btn btn-primary" href="javascript:void(0)" onclick="querycontent()">确定</a>
			</form>
			</div>
			<div class="row-fluid" id="table">
		<table id="info" class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr>
				 <th>顶部名称</th>
				 <th>底部名称</th>
				 <th>期数</th>
				 <th>倾斜度</th>
				 <th>倾斜度速率(mm)</th>
				 <th>倾斜度位移(mm)</th>
				 <th>测量时间(精确到秒)</th>
			</tr>
		</thead>
		<tbody>   
		
		</tbody>
		</table>
	
        </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>