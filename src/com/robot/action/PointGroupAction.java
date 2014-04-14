package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointGroupInfo;
import com.robot.model.Setting;
import com.robot.service.inte.IPointGroupInfoService;
import com.robot.service.inte.ISettingService;

@Controller("pointGroupInfoAction")
@Scope("prototype")
public class PointGroupAction extends ActionSupport implements ModelDriven<PointGroupInfo> {

	private String projectname;
	private IPointGroupInfoService pointGroupInfoService;
	private PointGroupInfo pointGroupInfo;
	private List<PointGroupInfo> pointGroupInfofs;
	
	
	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public IPointGroupInfoService getpointGroupInfoService() {
		return pointGroupInfoService;
	}


    @Resource
	public void setpointGroupInfoService(IPointGroupInfoService pointGroupInfoService) {
		this.pointGroupInfoService = pointGroupInfoService;
	}


	public PointGroupInfo getpointGroupInfo() {
		return pointGroupInfo;
	}


	public void setpointGroupInfo(PointGroupInfo pointGroupInfo) {
		this.pointGroupInfo = pointGroupInfo;
	}


	public List<PointGroupInfo> getpointGroupInfofs() {
		return pointGroupInfofs;
	}


	public void setpointGroupInfofs(List<PointGroupInfo> pointGroupInfofs) {
		this.pointGroupInfofs = pointGroupInfofs;
	}


	public String list()
	{
		pointGroupInfoService.setFactory(projectname);
		pointGroupInfofs=pointGroupInfoService.list();
		return SUCCESS;
	}


	@Override
	public PointGroupInfo getModel() {
		// TODO Auto-generated method stub
		if(pointGroupInfo==null){
			pointGroupInfo=new PointGroupInfo();
		}
		return pointGroupInfo;
	}
}
