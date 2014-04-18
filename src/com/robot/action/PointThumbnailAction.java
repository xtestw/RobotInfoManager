package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.IPointInfoService;

@Controller("pointThumbnailAction")
@Scope("prototype")
public class PointThumbnailAction extends ActionSupport implements ModelDriven<PointGroupInfo> {

	private String projectname;
	private IPointInfoService pointInfoService;
	private IPointGroupInfoService pointGroupInfoService;
	private PointInfo pointInfo;
	private List<PointInfo> pointInfofs;
	private PointGroupInfo pointGroupInfo;
	private List<PointInfo> poingGroupInfos;
	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	
	public PointGroupInfo getPointGroupInfo() {
		return pointGroupInfo;
	}


	public void setPointGroupInfo(PointGroupInfo pointGroupInfo) {
		this.pointGroupInfo = pointGroupInfo;
	}


	public IPointInfoService getPointInfoService() {
		return pointInfoService;
	}


    @Resource
	public void setPointInfoService(IPointInfoService pointInfoService) {
		this.pointInfoService = pointInfoService;
	}


	public PointInfo getPointInfo() {
		return pointInfo;
	}


	public void setPointInfo(PointInfo pointInfo) {
		this.pointInfo = pointInfo;
	}


	public List<PointInfo> getPointInfofs() {
		return pointInfofs;
	}


	public void setPointInfofs(List<PointInfo> pointInfofs) {
		this.pointInfofs = pointInfofs;
	}
   
	

	public IPointGroupInfoService getPointGroupInfoService() {
		return pointGroupInfoService;
	}


    @Resource
	public void setPointGroupInfoService(
			IPointGroupInfoService pointGroupInfoService) {
		this.pointGroupInfoService = pointGroupInfoService;
	}


	public List<PointInfo> getPoingGroupInfos() {
		return poingGroupInfos;
	}

	public void setPoingGroupInfos(List<PointInfo> poingGroupInfos) {
		this.poingGroupInfos = poingGroupInfos;
	}


	public String list()
	{
		return SUCCESS;
	}
	
	public String draw()
	{
		pointInfoService.setFactory(projectname);
		List<PointInfo> points=pointInfoService.listnonull();
		ActionContext.getContext().getSession().put("points", points);
		return SUCCESS;
	}


	@Override
	public PointGroupInfo getModel() {
		// TODO Auto-generated method stub
		if (pointGroupInfo==null){
			pointGroupInfo=new PointGroupInfo();
		}
		return pointGroupInfo;
	}
}
