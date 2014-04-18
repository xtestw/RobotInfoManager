package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointCoord;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.PointName;
import com.robot.service.inte.IPointCoordService;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.IPointInfoService;

@Controller("xyzMoveAction")
@Scope("prototype")
public class XYZMoveAction extends ActionSupport implements ModelDriven<PointCoord> {

	private String projectname;
	private PointCoord pointCoord;
	private List<PointCoord> pointCoords;
	private IPointCoordService pointCoordService;
	private List<PointName> pointNames;
	private List<PointGroupInfo> pointGroupInfos;
	private IPointGroupInfoService pointGroupInfoService;
	
	
	
	public IPointGroupInfoService getPointGroupInfoService() {
		return pointGroupInfoService;
	}


	@Resource
	public void setPointGroupInfoService(
			IPointGroupInfoService pointGroupInfoService) {
		this.pointGroupInfoService = pointGroupInfoService;
	}





	public List<PointName> getPointNames() {
		return pointNames;
	}


	public void setPointNames(List<PointName> pointNames) {
		this.pointNames = pointNames;
	}


	@JSON(serialize=false)
	public List<PointGroupInfo> getPointGroupInfos() {
		return pointGroupInfos;
	}



	public void setPointGroupInfos(List<PointGroupInfo> pointGroupInfos) {
		this.pointGroupInfos = pointGroupInfos;
	}


	@JSON(serialize=false)
	public String getProjectname() {
		return projectname;
	}



	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	@JSON(serialize=false)
	public PointCoord getPointCoord() {
		return pointCoord;
	}



	public void setPointCoord(PointCoord pointCoord) {
		this.pointCoord = pointCoord;
	}


	public List<PointCoord> getPointCoords() {
		return pointCoords;
	}


   
	public void setPointCoords(List<PointCoord> pointCoords) {
		this.pointCoords = pointCoords;
	}


	@JSON(serialize=false)
	public IPointCoordService getPointCoordService() {
		return pointCoordService;
	}


	@Resource
	public void setPointCoordService(IPointCoordService pointCoordService) {
		this.pointCoordService = pointCoordService;
	}

	public String show(){
		//pointCoordService.setFactory(projectname);
	///	pointCoords= pointCoordService.list(
	//					pointCoord.getPointName(), pointCoord.getPGName());
		pointGroupInfoService.setFactory(projectname);
		pointGroupInfos=pointGroupInfoService.list();
		return SUCCESS;
	}
	
	public String queryPoint()
	{
		pointNames=pointGroupInfoService.listAllPoint(pointCoord.getPGName());
		return "ajaxsuccess";
	}

	@Override
	public PointCoord getModel() {
		// TODO Auto-generated method stub
		if(pointCoord==null){
			pointCoord=new PointCoord();
		}
		return pointCoord;
	}
}
