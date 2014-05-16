package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.InstrumentParam;
import com.robot.model.SectionInfo;
import com.robot.model.Setting;
import com.robot.model.StationInfo;
import com.robot.service.inte.IInstrumentParamService;
import com.robot.service.inte.ISectionInfoService;
import com.robot.service.inte.ISettingService;
import com.robot.service.inte.IStationInfoService;

@Controller("sectionInfoAction")
@Scope("prototype")
public class SectionInfoAction extends ActionSupport implements ModelDriven<SectionInfo> {
	private ISectionInfoService sectionInfoService;
	private String projectname;
	private SectionInfo sectionInfo;
	private List<SectionInfo> sectionInfos;
	
	
	public ISectionInfoService getSectionInfoService() {
		return sectionInfoService;
	}
	@Resource
	public void setSectionInfoService(ISectionInfoService sectionInfoService) {
		this.sectionInfoService = sectionInfoService;
	}
	public SectionInfo getSectionInfo() {
		return sectionInfo;
	}
	public void setSectionInfo(SectionInfo sectionInfo) {
		this.sectionInfo = sectionInfo;
	}
	public List<SectionInfo> getSectionInfos() {
		return sectionInfos;
	}
	public void setSectionInfos(List<SectionInfo> sectionInfos) {
		this.sectionInfos = sectionInfos;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	

	public String list()
	{
		sectionInfoService.setFactory(projectname);
		sectionInfos=sectionInfoService.list();
		return SUCCESS;
	}
	@Override
	public SectionInfo getModel() {
		// TODO Auto-generated method stub
		if (sectionInfo==null) sectionInfo=new SectionInfo();
		return sectionInfo;
	}
}
