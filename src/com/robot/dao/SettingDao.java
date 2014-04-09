package com.robot.dao;


import org.springframework.stereotype.Repository;

import com.robot.dao.inte.ISettingDao;
import com.robot.model.Setting;

@Repository("settingDao")
public class SettingDao extends DBaseDao<Setting> implements ISettingDao {

	public SettingDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SettingDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
