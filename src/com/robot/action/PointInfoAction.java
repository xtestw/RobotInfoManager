package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointInfo;
import com.robot.service.inte.IPointInfoService;

@Controller("pointInfoAction")
@Scope("prototype")
public class PointInfoAction extends ActionSupport implements ModelDriven<PointInfo> {

	private String projectname;
	private IPointInfoService pointInfoService;
	private PointInfo pointInfo;
	private List<PointInfo> pointInfos;
	
	
	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
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


	public List<PointInfo> getPointInfos() {
		return pointInfos;
	}


	public void setPointInfos(List<PointInfo> pointInfos) {
		this.pointInfos = pointInfos;
	}


	public String list()
	{
		pointInfoService.setFactory(projectname);
		pointInfos=pointInfoService.list();
		return SUCCESS;
	}


	@Override
	public PointInfo getModel() {
		// TODO Auto-generated method stub
		if(pointInfo==null){
			pointInfo=new PointInfo();
		}
		return pointInfo;
	}
}
