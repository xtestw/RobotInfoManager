package com.robot.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.Setting;
import com.robot.service.inte.ISettingService;

@Controller("settingAction")
@Scope("prototype")
public class SettingAction extends ActionSupport implements ModelDriven<Setting> {
	private ISettingService settingService;
	private String projectname;
	private Setting setting;
	private List<Setting> settings;
	
	
	public ISettingService getSettingService() {
		return settingService;
	}
	@Resource
	public void setSettingService(ISettingService settingService) {
		this.settingService = settingService;
	}
	public Setting getSetting() {
		return setting;
	}
	public void setSetting(Setting setting) {
		this.setting = setting;
	}
	
	
	public List<Setting> getSettings() {
		return settings;
	}
	public void setSettings(List<Setting> settings) {
		this.settings = settings;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public Setting getModel() {
		// TODO Auto-generated method stub
		if (setting == null) setting=new Setting();
		return setting;
	}

	public String  update()
	{
		settingService.update(setting);
		return SUCCESS;		
	}
	public String list()
	{
		settingService.setDB(projectname);
		settings=settingService.list();
		return SUCCESS;
	}
}
