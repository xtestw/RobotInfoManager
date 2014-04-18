<%@page import="com.robot.model.PointInfo"%>
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
          <script type="text/javascript">
   /*        $(document).ready(function() {                    
				$('.datatable').dataTable( {        				
				"oLanguage": {
				"sUrl": "/robot/lib/zh_CN.json"
			} 
		});
} ); */
          $(function () {  /*  
              	$('.datatable').dataTable( {        				
				"oLanguage": {
					"sUrl": "/robot/lib/zh_CN.json"
				}   });   */                                                                           
        	    $('#container').highcharts({                                                             
        	        chart: {                                                                             
        	            type: 'scatter',                                                                 
        	            zoomType: 'xy'                                                                   
        	        },                                                                                   
        	        title: {                                                                             
        	            text: '点位缩略图'                        
        	        },                                                                                   
        	        subtitle: {                                                                          
        	            text: ''                                                      
        	        },                                                                                   
        	        xAxis: {                                                                             
        	            title: {                                                                         
        	                enabled: true,                                                               
        	                text: 'X (N)'                                                          
        	            },                                                                               
        	            startOnTick: true,                                                               
        	            endOnTick: true,                                                                 
        	            showLastLabel: true                                                              
        	        },                                                                                   
        	        yAxis: {                                                                             
        	            title: {                                                                         
        	                text: 'Y (E)'                                                          
        	            }                                                                                
        	        },                                                                                   
        	        legend: {                                                                            
        	            layout: 'vertical',                                                              
        	            align: 'left',                                                                   
        	            verticalAlign: 'top',                                                            
        	            x: 8,                                                                          
        	            y: 100,                                                                           
        	            floating: true,                                                                  
        	            backgroundColor: '#FFFFFF',                                                      
        	            borderWidth: 1                                                                   
        	        },                                                                                   
        	        plotOptions: {                                                                       
        	            scatter: {                                                                       
        	                marker: {                                                                    
        	                    radius: 5,                                                               
        	                    states: {                                                                
        	                        hover: {                                                             
        	                            enabled: true,                                                   
        	                            lineColor: 'rgb(100,100,100)'                                    
        	                        }                                                                    
        	                    }                                                                        
        	                },                                                                           
        	                states: {                                                                    
        	                    hover: {                                                                 
        	                        marker: {                                                            
        	                            enabled: false                                                   
        	                        }                                                                    
        	                    }                                                                        
        	                },                                                                           
        	                tooltip: {                                                                   
        	                    headerFormat: '<b>{series.name}</b><br>',                                
        	                    pointFormat: '{point.x} , {point.y} '                                
        	                }                                                                            
        	            }                                                                                
        	        },                                                                                   
        	        series: [{                                                                           
        	            name: '观测点',                                                                  
        	            color: 'rgba(223, 83, 83, .5)',                                                  
        	            data: [
               	            <%List<PointInfo> pointInfos=(List<PointInfo>)request.getSession().getAttribute("points");
               	            	int flag=0;
               	            	for(int i=0;i<pointInfos.size();i++)
               	            	{
               	            
               	            		if (pointInfos.get(i).getPointType().equals("观测点")){
               	            		if(flag==1) {				
               	            %>
               	            	,
               	            <%}%>
               	            [<%=pointInfos.get(i).getX()%>,<%=pointInfos.get(i).getY()%>]
                       	            <%}}%>
                  	          ] 
        	                                                                                             
        	        }, {                                                                                 
        	            name: '测量点',                                                                    
        	            color: 'rgba(119, 152, 191, .5)',                                                
        	            data: [
        	                   <% flag=0;
              	            	for(int i=0;i<pointInfos.size();i++)
              	            	{
              	            
              	            		if (!pointInfos.get(i).getPointType().equals("观测点")){
              	            		if(flag==1) {				
              	            %>
              	            	,
              	            <%}%>
              	            [<%=pointInfos.get(i).getX()%>,<%=pointInfos.get(i).getY()%>]
                      	            <%}}%>
                      	     ]                                                
        	        }]                                                                                   
        	    });                                                                                      
        	});                             

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
		<h2>选择项目</h2>
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
				<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto">
				</div>
	  
            </div>
  <%@include file="../inc/footer.jsp"%>   
	</div>
       </div>  
                 <%@include file="../inc/buttom.jsp"%>   
           
   
  </body>
</html>
