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
<script type="text/javascript">
	
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
		<h2>个人账号设置</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						首页：
					</li>
					<li>
						账号 <span class="divider">/</span>
					</li>
					<li>
						设置 <span class="divider">/</span>
					</li>
				
				</ul>
			</div>
			</div>
			<div class="row-fluid">
		    <div class="dialog">
      		<div class="">
            <div class="block-body">
               <table class="table table-striped table-bordered table-hover ">
				<tr>
				<td>车站拱顶沉降限差(mm)</td><td>${warningSetting.CZGD}</td>
				<td>车站拱顶速率沉降限差(mm)</td><td>${warningSetting.CZGDV}</td>
				</tr>
				<tr>
				<td>区间拱顶沉降限差(mm)</td><td>${warningSetting.QJGD}</td>
				<td>区间拱顶沉降速率限差(mm)</td><td>${warningSetting.QJGDV}</td>
				</tr>
				<tr>
				<td>水平收敛值限差</td><td>${warningSetting.SL}</td>
				<td>水平收敛值速率限差(mm)</td><td>${warningSetting.SLV}</td>
				</tr>
				<tr>
				<td>倾斜度限差(mm)</td><td>${warningSetting.QX}</td>
				<td>倾斜度速率限差(mm)</td><td>${warningSetting.QXV}</td>
				</tr>
				<tr>
				<td>沉降值限差(mm)</td><td>${warningSetting.CJ}</td>
				<td>沉降值速率限差(mm)</td><td>${warningSetting.CJV}</td>
				</tr>
			   </table>
            </div>
        </div>
    </div>
	
        </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
