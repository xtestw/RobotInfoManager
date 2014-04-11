package com.robot.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.SettingDao;
import com.robot.model.Setting;
import com.robot.service.inte.ISettingService;
@Service("settingService")
@Scope("prototype")
public class SettingService implements ISettingService {

	private SettingDao settingDao;
	public SettingDao getSettingDao() {
		return settingDao;
	}
	@Resource
	public void setSettingDao(SettingDao settingDao) {
		this.settingDao = settingDao;
	}

	@Override
	public void add(Setting setting) {
		
		settingDao.add(setting);
	}

	@Override
	public void delete(Setting setting) {
		settingDao.delete(setting);
	}

	@Override
	public void delete(int id) {
		settingDao.delete(id);
	}

	@Override
	public Setting load(int id) {
		return settingDao.load(id);
	}
	@Override
	public void update(Setting setting) {
		settingDao.update(setting);
		
	}
	@Override
	public void setFactory(String name) {
		settingDao.setSuperSessionFactory(name);
		
	}
	@Override
	public List<Setting> list() {
		return settingDao.list("from Setting");
	}
	@Override
	public void setDB(String name) {
		
		settingDao.setSuperSessionFactory(name);
	}


}
