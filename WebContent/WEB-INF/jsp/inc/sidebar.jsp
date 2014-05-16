<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



    
   <div class="sidebar-nav">
   <p class="block-heading">当前项目:
   <c:if test="${empty sessionScope.curProject}">未选择</c:if>
   <c:if  test="${!empty sessionScope.curProject}">${sessionScope.curProject.projectName }</c:if>
   </p>

         <div class="accordion" id ="accordion1" style="padding: 0px;margin:0px;">
         <div class="accordion-group" style="padding: 0px;margin:0px;">
         <a href="#file-menu" class="nav-header accordion-toggle" data-toggle="collapse" data-parent="#accordion1"><i class="icon-file"></i>项目管理</a>
        <ul id="file-menu" class="nav nav-list collapse in">
            <li ><a href="project_list.action">打开项目</a></li>
        </ul>
        </div>
          <div class="accordion-group" style="padding: 0px;margin:0px;">
       <a href="#system-menu" class="nav-header accordion-toggle" data-toggle="collapse" data-parent="#accordion1"><i class="icon-wrench"></i>信息查询</a>
        <ul id="system-menu" class="nav nav-list collapse ">
            <li ><a href="javascript:void(0)" onclick="go('setting_list.action?projectname=${sessionScope.curProject.projectName}')">设置信息</a></li>
            <li ><a href="javascript:void(0)" onclick="go('stationInfo_list.action?projectname=${sessionScope.curProject.projectName}')">设站点信息</a></li>
            <li ><a href="javascript:void(0)" onclick="go('instrumentParam_list.action?projectname=${sessionScope.curProject.projectName}')">仪器参数信息</a></li>
            <li ><a href="javascript:void(0)" onclick="go('pointInfo_list.action?projectname=${sessionScope.curProject.projectName}')">点信息</a></li>
            <li ><a href="javascript:void(0)" onclick="go('pointGroupInfo_list.action?projectname=${sessionScope.curProject.projectName}')">点组信息</a></li>
            <li ><a href="javascript:void(0)" onclick="go('sectionInfo_list.action?projectname=${sessionScope.curProject.projectName}')">断面信息</a></li>            
        </ul>
        </div>
          <div class="accordion-group" style="padding: 0px;margin:0px;">
        <a href="#set-menu" class="nav-header accordion-toggle" data-toggle="collapse" data-parent="#accordion1"><i class="icon-cog"></i>分析系统</a>
     
        <ul id="set-menu" class="nav nav-list collapse">
            <li ><a href="javascript:void(0)" onclick="go('pointThumbnail_draw.action?projectname=${sessionScope.curProject.projectName}')">点位缩略图</a></li>
           
            <li ><a href="javascript:void(0)" onclick="go('xyzMove_show.action?projectname=${sessionScope.curProject.projectName}')">XYZ方向位移图</a></li>
        </ul>
        </div>
  <div class="accordion-group" style="padding: 0px;margin:0px;">
        <a href="#premeasure-menu" class="nav-header collapsed accordion-toggle" data-toggle="collapse" data-parent="#accordion1"><i class="icon-pencil"></i>预警系统 </a>
 
        <ul id="premeasure-menu" class="nav nav-list collapse">
            <li ><a href="javascript:void(0)" onclick="go('warning_info.action?projectname=${sessionScope.curProject.projectName}')">预/报警值阅览</a></li>
            <li ><a href="javascript:void(0)" onclick="go('spWarning_list.action?projectname=${sessionScope.curProject.projectName}')">水平收敛预警</a></li>
            <li ><a href="javascript:void(0)" onclick="go('gdWarning_list.action?projectname=${sessionScope.curProject.projectName}')">拱顶沉降预警</a></li>
            <li ><a href="javascript:void(0)" onclick="go('qxWarning_list.action?projectname=${sessionScope.curProject.projectName}')">倾斜度预警</a></li>
            <li ><a href="javascript:void(0)" onclick="go('cjWarning_list.action?projectname=${sessionScope.curProject.projectName}')">沉降预警</a></li>
       </ul>
         </div>
          <div class="accordion-group" style="padding: 0px;margin:0px;">
        <a href="#help-menu" class="nav-header accordion-toggle" data-toggle="collapse" data-parent="#accordion1" ><i class="icon-question-sign"></i>帮助</a>

        <ul id="help-menu" class="nav nav-list collapse">
            <li ><a href="privacy-policy.html">版本</a></li>
            <li ><a href="terms-and-conditions.html">帮助</a></li>
        </ul> 
        </div>
                    
    </div>
    </div>


