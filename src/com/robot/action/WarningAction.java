package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.PointInfo;
import com.robot.model.WarningSetting;
import com.robot.service.inte.IPointInfoService;
import com.robot.service.inte.ISettingService;

@Controller("warningAction")
@Scope("prototype")
public class WarningAction extends ActionSupport implements ModelDriven<WarningSetting>  {

	private String projectname;
	private ISettingService settingService;
	private WarningSetting warningSetting;
	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public ISettingService getSettingService() {
		return settingService;
	}

	@Resource
	public void setSettingService(ISettingService settingService) {
		this.settingService = settingService;
	}


	public WarningSetting getWarningSetting() {
		return warningSetting;
	}


	public void setWarningSetting(WarningSetting warningSetting) {
		this.warningSetting = warningSetting;
	}


	public String info()
	{
	  	 settingService.setFactory(projectname);
		 warningSetting=settingService.getValues();
		 return SUCCESS;
	}


	@Override
	public WarningSetting getModel() {
		if (warningSetting==null) warningSetting=new WarningSetting();
		return warningSetting;
	}

}
