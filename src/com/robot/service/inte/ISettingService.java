package com.robot.service.inte;

import com.robot.model.Setting;



public interface ISettingService {
	public void add(Setting setting);
	public void delete(Setting setting);
	public void delete(int id);
	public Setting load(int id);
	public void update(Setting setting);
	public void setFactory(String name);
}
