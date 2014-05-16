<%@page import="com.robot.model.PointInfo"%>
<%@page import="com.robot.model.Project"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 
        <%@include file="../inc/head.jsp"%>
        <script type="text/javascript"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
         <script src="http://code.highcharts.com/highcharts.js"></script> 
         <script src="js/exporting.js" type="text/javascript"></script>
	
        <script src="<%=request.getContextPath()%>/js/bootstrap-select.min.js"></script>
       <script type="text/javascript">
       var chart;
       var d1=[];
       var d2=[];
       var d3=[];
          $(function () {  /*  
              	$('.datatable').dataTable( {        				
				"oLanguage": {
					"sUrl": "/robot/lib/zh_CN.json"
				}   });   */                  
			                                                         
        	  $("#select_pointgroup").change(function()
                      {
                        var sld=$(this).children('option:selected').text();
						   if (sld=='--选择点组--') return;
                 	   $.ajax({
        					url:'xyzMove_queryPoint.action',
        					type:'post',
        					data:({pGName:sld+"",projectname:"<%=((Project)request.getSession().getAttribute("curProject")).getProjectName()%>"}),
        					success:function(results)
        					{
        						$("#select_point").empty();
          						 $("#select_point").append("<option>--选择点--</option>");

        						$.each(results.pointNames, function(i, item) {
											
             						 $("#select_point").append("<option>"+item.name+"</option>");
					       		 });
        						 
        					}
        					});
                        });            
				chart = new Highcharts.Chart({
				 chart: {

     	        	renderTo: 'container',
			            type: 'spline',
                        
        	            zoomType: 'xy'   
			        },
			        title: {
			            text: 'XYZ方向位移图'
			        },
			        subtitle: {
			            text: ''
			        },
			        xAxis: {
			        	 title: {                                                                         
	        	                enabled: true,                                                                 
	        	                text: '期数'                                                           
	        	            },                                                                               
	        	            startOnTick: true,                                                               
	        	            endOnTick: true,                                                                 
	        	            showLastLabel: true     
			        },
			        yAxis: {
			        	  title: {                                                                     
		        	                text: '变化量(mm)'                                                           
	        	            }        
			        },
			        tooltip: {
			        	 headerFormat: '<b>{series.name}</b><br>',                                
 	                    pointFormat: '{point.x} , {point.y} '                  
			        },
			        
			        series: [{
			            name: 'X',
			            data: d1
			        }, {
			            name: 'Y',
			            data: d2
			        }, {
			            name: 'Z',
			            data: d3
			        }]
				
				});                                                      
        	});                             
          function show(){
        	  var sld=$("#select_point").children('option:selected').text();
			   if (sld=='--选择点--') return;
	        	  var g=$("#select_pointgroup").children('option:selected').text();
				   if (g=='--选择点组--') return;
        	   $.ajax({
					url:'xyzMove_queryPointCoord.action',
					type:'post',
					data:({pGName:g+"",pointName:sld+"",projectname:"<%=((Project)request.getSession().getAttribute("curProject")).getProjectName()%>"}),
					success:function(results)
					{
						d1=[];
						d2=[];
						d3=[];
						 $.each(results.pointCoords, function(i, item) {
					        	d1.push([item.nop,item.totalXdiff]);
					        	d2.push([item.nop,item.totalYDiff]);
					        	d3.push([item.nop,item.totalZDiff]);
					        });
						 chart.series[0].setData(d1) ;
						 chart.series[1].setData(d2) ;
						 chart.series[2].setData(d3) ;
					}
					});
                     
        	}
          </script>
<link href="/robot/css/bootstrap-responsiv.css" rel="stylesheet" type="text/css"/>
<link href="/robot/css/dataTables.bootstra.css" rel="stylesheet" type="text/css"/>
       <link href="<%=request.getContextPath()%>/css/bootstrap-select.min.css"rel="stylesheet" type="text/css"></link>
</head>
<body class="">

 <%@include file="../inc/title.jsp"%>
 <%@include file="../inc/sidebar.jsp"%>

 <div class="content" style="min-height: 1000px">
		<div class="container-fluid">
		<div class="row-fluid">
		<h2>xyz位移图</h2>
			<div>
				<ul class="breadcrumb">
					<li>
						分析系统：
					</li>
					<li>
						xyz位移图 <span class="divider">/</span>
					</li>
					
					<li>
						过滤
					</li>
				</ul>
			</div>
			</div>
			<div class="row-fluid">
			<form class="form-inline">
				<select class="selectpicker"  title="选择点组" id="select_pointgroup">
				 <option>--选择点组--</option>
				 <c:forEach var="item" items="${pointGroupInfos}">
				 	<option value="${item.pointGroupName }">${item.pointGroupName }</option>
				 </c:forEach>
				</select>
				<select class="selectpicker"  title="选择点名" id="select_point">
				 <option>--选择点--</option>
				 </select>
      <a class="btn btn-primary" href="javascript:void(0)" onclick="show()">确定</a>
			</form>
				<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto">
				</div>
	  
            </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
