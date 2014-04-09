package com.robot.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.robot.model.Project;
import com.robot.model.Setting;
import com.robot.service.SettingService;

@Controller("settingAction")
@Scope("prototype")
public class SettingAction extends ActionSupport implements ModelDriven<Setting> {
	private SettingService settingService;
	private Setting setting;
	public SettingService getSettingService() {
		return settingService;
	}
	@Resource
	public void setSettingService(SettingService settingService) {
		this.settingService = settingService;
	}
	public Setting getSetting() {
		return setting;
	}
	public void setSetting(Setting setting) {
		this.setting = setting;
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
	
}
