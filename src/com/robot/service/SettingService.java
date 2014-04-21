package com.robot.service;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.SettingDao;
import com.robot.model.Setting;
import com.robot.model.WarningSetting;
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
	@Override
	public WarningSetting getValues() {
	    WarningSetting ret=new WarningSetting();
		ret.setCZGD((String)settingDao.queryByHql("from Setting s where s.value='CZGD'"));
		ret.setQJGD((String)settingDao.queryByHql("from Setting s where s.value='QJGD'"));
		ret.setSL((String)settingDao.queryByHql("from Setting s where s.value='SL'"));
		ret.setCZGDV((String)settingDao.queryByHql("from Setting s where s.value='CZGDV'"));
		ret.setQJGDV((String)settingDao.queryByHql("from Setting s where s.value='QJGDV'"));
		ret.setSLV((String)settingDao.queryByHql("from Setting s where s.value='SLV'"));
		ret.setQX((String)settingDao.queryByHql("from Setting s where s.value='QX'"));
		ret.setQXV((String)settingDao.queryByHql("from Setting s where s.value='QXV'"));
		ret.setCJ((String)settingDao.queryByHql("from Setting s where s.value='CJ'"));
		ret.setCJV((String)settingDao.queryByHql("from Setting s where s.value='CJV'"));
		return ret;
	}
	@Override
	public void update(WarningSetting warningSetting) {
		// TODO Auto-generated method stub
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getCZGD()+"where s.name='CZGD'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getQJGD()+"where s.name='QJGD'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getSL()+"where s.name='SL'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getCZGDV()+"where s.name='CZGDV'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getQJGDV()+"where s.name='QJGDV'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getSLV()+"where s.name='SLV'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getQX()+"where s.name='QX'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getCJ()+"where s.name='CJ'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getCJV()+"where s.name='CJV'");
		settingDao.executeByHql("update Setting s set s.value="+
				warningSetting.getQXV()+"where s.name='QX'");
	}


}
