package com.robot.service.inte;


import java.util.List;

import com.robot.model.Setting;



public interface ISettingService {
	public void add(Setting setting);
	public void delete(Setting setting);
	public void delete(int id);
	public Setting load(int id);
	public void update(Setting setting);
	public void setFactory(String name);
	public List<Setting> list();
	public void setDB(String name);
}
