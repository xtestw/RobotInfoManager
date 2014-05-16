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
	function warningupdate()
	{
		$("#warning_form").submit();
	}
</script>
<style type="text/css">
.form-group{
	padding-bottom:4px;
}
.form-group span{
position:relative;
	top:3px;
}
</style>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>预警值设定</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						预警系统：
					</li>
					<li>
						预警值信息<span class="divider">/</span>
					</li>
					
				
				</ul>
			</div>
			</div>
			<div class="row-fluid">
            <div class="block-body">
	       <p class="pull-right">	
	       <a id="modal-774920" href="#modal-container-774920" role="button" class="btn" data-toggle="modal">修改</a></p>
	       <div id="modal-container-774920" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-header">
					 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h3 id="myModalLabel">
						预警值信息修改
					</h3>
				</div>
				<div class="modal-body">
				<form role="form" class="form-horizontal" action="warning_update.action?projectname=${sessionScope.curProject.projectName}" id="warning_form" method="post">
                 <div class="form-group">
                    <span class="span6">车站拱顶沉降限差(mm)</span>
                    <input type="text" class="span6" name="CZGD" id="CZGD" value="${warningSetting.CZGD}">
                  </div>
                      <div class="form-group">
                <span class="span6">车站拱顶速率沉降限差(mm)</span>
                    <input type="text" class="span6" name="CZGDV" id="CZGDV" value="${warningSetting.CZGDV}">
                  </div>
                     <div class="form-group">
                <span class="span6">区间拱顶沉降限差(mm)</span>
                    <input type="text" class="span6" name="QJGD"  value="${warningSetting.QJGD}">
                 </div>    <div class="form-group">
                <span class="span6">区间拱顶沉降速率限差(mm)</span>
                    <input type="text" class="span6" name="QJGDV" value="${warningSetting.QJGDV}">
                  </div> <div class="form-group">
                 <span class="span6">水平收敛值限差(mm)</span>
                    <input type="text" class="span6" name="SL" id="SL" value="${warningSetting.SL}">
                 </div> <div class="form-group">
                <span class="span6">水平收敛值速率限差(mm)</span>
                    <input type="text" class="span6" name="SLV" id="SLV" value="${warningSetting.SLV}">
                </div>  <div class="form-group">
                <span class="span6">倾斜度限差(mm)</span>
                    <input type="text" class="span6" name="QX" id="QX" value="${warningSetting.QX}">
                 </div> <div class="form-group">
                <span class="span6">倾斜度速率限差(mm)</span>
                    <input type="text" class="span6" name="QXV" id="QXV" value="${warningSetting.QXV}">
                 </div>  <div class="form-group">
               <span class="span6">沉降值限差(mm)</span>
                    <input type="text" class="span6" name="CJ" id="CJ" value="${warningSetting.CJ}">
                 </div>  <div class="form-group">
               <span class="span6">沉降值速率限差(mm)</span>
                    <input type="text" class="span6" name="CJV" id="CJV" value="${warningSetting.CJV}">
                </div>   	</form>
				</div>
				<div class="modal-footer">
					 <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button> 
					 <button class="btn btn-primary" onclick="warningupdate()">保存设置</button>
				</div>
			</div>
               <table class="table">
				<tr>
				<td class="center">车站拱顶沉降限差(mm)</td><td>${warningSetting.CZGD}</td>
				<td class="center">车站拱顶速率沉降限差(mm)</td><td>${warningSetting.CZGDV}</td>
				</tr>
				<tr>
				<td class="center">区间拱顶沉降限差(mm)</td><td>${warningSetting.QJGD}</td>
				<td class="center">区间拱顶沉降速率限差(mm)</td><td>${warningSetting.QJGDV}</td>
				</tr>
				<tr>
				<td class="center">水平收敛值限差</td><td>${warningSetting.SL}</td>
				<td class="center">水平收敛值速率限差(mm)</td><td>${warningSetting.SLV}</td>
				</tr>
				<tr>
				<td class="center">倾斜度限差(mm)</td><td>${warningSetting.QX}</td>
				<td class="center">倾斜度速率限差(mm)</td><td>${warningSetting.QXV}</td>
				</tr>
				<tr>
				<td class="center">沉降值限差(mm)</td><td>${warningSetting.CJ}</td>
				<td class="center">沉降值速率限差(mm)</td><td>${warningSetting.CJV}</td>
				</tr>
			   </table>
            </div>
	
        </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
