package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.StationInfo;
import com.robot.service.inte.IStationInfoService;


@Controller("stationInfoAction")
@Scope("prototype")
public class StationInfoAction extends ActionSupport implements ModelDriven<StationInfo> {
	private IStationInfoService stationInfoService;
	private String projectname;
	private StationInfo stationinfo;
	private List<StationInfo> stationInfos;
	
	

	public IStationInfoService getStationInfoService() {
		return stationInfoService;
	}
	@Resource
	public void setStationInfoService(IStationInfoService stationInfoService) {
		this.stationInfoService = stationInfoService;
	}
	
	public StationInfo getStationinfo() {
		return stationinfo;
	}
	public void setStationinfo(StationInfo stationinfo) {
		this.stationinfo = stationinfo;
	}
	public List<StationInfo> getStationInfos() {
		return stationInfos;
	}
	public void setStationInfos(List<StationInfo> stationInfos) {
		this.stationInfos = stationInfos;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public StationInfo getModel() {
		// TODO Auto-generated method stub
		if (stationinfo == null) stationinfo=new StationInfo();
		return stationinfo;
	}

	public String list()
	{
		stationInfoService.setFactory(projectname);
		stationInfos=stationInfoService.list();
		return SUCCESS;
	}
}
