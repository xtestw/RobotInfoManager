<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 
        <%@include file="../inc/head.jsp"%>
        
           <script src="http://code.highcharts.com/highcharts.js"></script> 
         <script src="js/exporting.js" type="text/javascript"></script>
	
          <script type="text/javascript">
          var chart;
          var d1=[[1,1],[2,2]];
          var d2=[];
          var table;
          $(document).ready(function() {                    
				table=$('.datatable').dataTable( {        				
				"oLanguage": {
				"sUrl": "/robot/lib/zh_CN.json"
			} 
		});	
		chart = new Highcharts.Chart({
			//   $('#container').highcharts({                                                             
	        chart: {  
	        	renderTo: 'container',
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
	            name: '警告的左帮点',                                                                  
	            color: 'rgba(223, 83, 83, .5)',                                                  
	            data:d1
	                                                                                             
	        } , {                                                                                 
	            name: '警告的右帮点',                                                                    
	            color: 'rgba(119, 152, 191, .5)',                                                
	            data:d2                                             
	        }      
	        ]
	    });                       
} );

         

function querycontent()
{
	var sld=$("#select_pointgroup  option:selected").text()+"";
	var projectname="${sessionScope.curProject.projectName}"+"";
	 $.ajax({
			url:'spWarning_query.action',
			type:'post',
			data:({PGName:sld+"",projectname:projectname}),
			success:function(results)
			{
				$("#info tbody").empty();
						$("#info tbody").html("");
				          table.fnClearTable();
				        $.each(results.shouLians, function(i, item) {
				        	$("#info tbody").append(
				                    "<tr><td class=\"center\">" + item.leftPointName + "</td>" + 
				                    "<td class=\"center\">" + item.rightPointName + "</td>" + 
				                    "<td class=\"center\">" + item.nop + "</td>" + 
				                    "<td class=\"center\">" + item.shouLian + "</td>" + 
				                    "<td class=\"center\">" + item.theSLDiff + "</td>" + 
				                    "<td class=\"center\">" + item.totalSLDiff + "</td>" + 
				                    "<td class=\"center\">" + item.measureTime + "</td></tr>" 
					                  );
				        });
				        $.each(results.lpointInfos, function(i, item) {
				        	d1.push([item.x,item.y]);
				        });
				          chart.series[0].setData(d1) ;
					        $.each(results.rpointInfos, function(i, item) {
					        	d2.push([item.x,item.y]);
					        });;
					          chart.series[1].setData(d2) ;
					      //    table.fnClearTable();
					          table=$('.datatable').dataTable({
					        		  "bDestroy":true,
					         		 "oLanguage": {
										"sUrl": "/robot/lib/zh_CN.json"
								} });
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
				 	<option value="${item.pointGroupName }">${item.pointGroupName }</option>
				 </c:forEach>
				</select>
      			<a class="btn btn-primary" href="javascript:void(0)" onclick="querycontent()">确定</a>
			</form>
			</div>
			<div class="tabbable" id="tabs-311861">
				<ul class="nav nav-tabs">
					<li class="active">
						<a href="#panel-668750" data-toggle="tab">信息查看</a>
					</li>
					<li>
						<a href="#panel-99940" data-toggle="tab">图表展示</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-668750">
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
				 <th>测量时间(精确到秒)</th>
			</tr>
		</thead>
		<tbody>   
		
		</tbody>
		</table>
	
        </div>	
        </div>
        <div class="tab-pane" id="panel-99940">
						<div id="container" class="span10">
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
