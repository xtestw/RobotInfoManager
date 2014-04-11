package com.robot.dao;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.ISettingDao;
import com.robot.model.Setting;

@Repository("settingDao")
@Scope("prototype")
public class SettingDao extends DBaseDao<Setting> implements ISettingDao {


	public SettingDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
