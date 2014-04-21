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

function query()
{
	var sld=$("#select_pointgroup  option:selected").text();
	 $.ajax({
			url:'spWarning_query.action',
			type:'post',
			data:({PGName:sld+""}),
			success:function(results)
			{
				var obj=$("#info tbody");
				obj.html("");
				        $.each(data.comments, function(i, item) {
				            obj.append(
				                    "<td class=\"center\">" + item.leftPointName + "</td>" + 
				                    "<td class=\"center\">" + item.rightPointName + "</td>" + 
				                    "<td class=\"center\">" + item.nop + "</td>" + 
				                    "<td class=\"center\">" + item.shouLian + "</td>" + 
				                    "<td class=\"center\">" + item.theSLDiff + "</td>" + 
				                    "<td class=\"center\">" + item.totalSLDiff + "</td>" + 
				                    "<td class=\"center\">" + item.measureTime + "</td>" 
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
		<h2>水平收敛预警</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						预警系统：
					</li>
					<li>
						水平收敛预警 <span class="divider">/</span>
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
      			<a class="btn btn-primary" href="javascript:void(0)" onclick="query()">确定</a>
			</form>
			</div>
			<div class="row-fluid" id="table">
		<table id="info" class="table table-striped table-bordered table-hover datatable">
		<thead>
			<tr>
				 <th>左帮点名</th>
				 <th>右帮点名</th>
				 <th>期数</th>
				 <th>水平收敛(m)</th>
				 <th>水平收敛速率(mm)</th>
				 <th>水平收敛位移(mm)</th>
				 <th>测量时间</th>
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