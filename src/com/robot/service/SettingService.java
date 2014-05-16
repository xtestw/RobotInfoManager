package com.robot.service;



import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	    WarningSetting ret=getWarningSetting();
//		ret.setCZGD(((Setting)settingDao.queryByHql("from Setting s where s.setting='CZGD'")).getValue());
//		ret.setQJGD(((Setting)settingDao.queryByHql("from Setting s where s.setting='QJGD'")).getValue());
//		ret.setSL(((Setting)settingDao.queryByHql("from Setting s where s.setting='SL'")).getValue());
//		ret.setCZGDV(((Setting)settingDao.queryByHql("from Setting s where s.setting='CZGDV'")).getValue());
//		ret.setQJGDV(((Setting)settingDao.queryByHql("from Setting s where s.setting='QJGDV'")).getValue());
//		ret.setSLV(((Setting)settingDao.queryByHql("from Setting s where s.setting='SLV'")).getValue());
//		ret.setQX(((Setting)settingDao.queryByHql("from Setting s where s.setting='QX'")).getValue());
//		ret.setQXV(((Setting)settingDao.queryByHql("from Setting s where s.setting='QXV'")).getValue());
//		ret.setCJ(((Setting)settingDao.queryByHql("from Setting s where s.setting='CJ'")).getValue());
//		ret.setCJV(((Setting)settingDao.queryByHql("from Setting s where s.setting='CJV'")).getValue());
//		System.out.println("dd");
		return ret;
	}
	@Override
	public void update(WarningSetting warningSetting) {
		// TODO Auto-generated method stub
			System.out.println("update WarningSetting");
		/*	WarningSetting ret=getWarningSetting();
		    if(ret.getCZGD().equals("无")) {if (!warningSetting.getCZGD().equals("无")) save("CZGD",warningSetting.getCZGD());}else update("CZGD",warningSetting.getCZGD());
		    if(ret.getCZGDV().equals("无")) {if(!warningSetting.getCZGDV().equals("无")) save("CZGDV",warningSetting.getCZGDV());}else update("CZGDV",warningSetting.getCZGDV());
		    if(ret.getQJGD().equals("无")){if(!warningSetting.getQJGD().equals("无")) save("QJGD",warningSetting.getQJGD());}else update("QJGD",warningSetting.getQJGD());
		    if(ret.getQJGDV().equals("无")){ if(!warningSetting.getQJGDV().equals("无")) save("QJGDV",warningSetting.getQJGDV());}else update("QJGDV",warningSetting.getQJGDV());
		    if(ret.getSL().equals("无")) {if(!warningSetting.getSL().equals("无")) save("SL",warningSetting.getSL());}else update("SL",warningSetting.getSL());
		    if(ret.getSLV().equals("无")){  if(!warningSetting.getSLV().equals("无")) save("SLV",warningSetting.getSLV());}else update("SLV",warningSetting.getSLV());
		    if(ret.getQX().equals("无")){if(!warningSetting.getQX().equals("无")) save("QX",warningSetting.getQX());}else update("QX",warningSetting.getQX());
		    if(ret.getQXV().equals("无")){if(!warningSetting.getQXV().equals("无")) save("QXV",warningSetting.getQXV());}else update("QXV",warningSetting.getQXV());
		    if(ret.getCJ().equals("无")){if(!warningSetting.getCJ().equals("无")) save("CJ",warningSetting.getCJ());}else update("CJ",warningSetting.getCJ());
		    if(ret.getCJV().equals("无")){if(!warningSetting.getCJV().equals("无")) save("CJV",warningSetting.getCJV());}else update("CJV",warningSetting.getCJV());
		    
*/	 if (!warningSetting.getCZGD().equals("无"))  update("CZGD",warningSetting.getCZGD());
if(!warningSetting.getCZGDV().equals("无"))  update("CZGDV",warningSetting.getCZGDV());
if(!warningSetting.getQJGD().equals("无"))update("QJGD",warningSetting.getQJGD());
     if(!warningSetting.getQJGDV().equals("无"))  update("QJGDV",warningSetting.getQJGDV());
if(!warningSetting.getSL().equals("无")) update("SL",warningSetting.getSL());
  if(!warningSetting.getSLV().equals("无"))  update("SLV",warningSetting.getSLV());
if(!warningSetting.getQX().equals("无"))  update("QX",warningSetting.getQX());
if(!warningSetting.getQXV().equals("无"))  update("QXV",warningSetting.getQXV());
if(!warningSetting.getCJ().equals("无"))update("CJ",warningSetting.getCJ());
if(!warningSetting.getCJV().equals("无")) update("CJV",warningSetting.getCJV());

			}
	
	public void save(String setting,String value)
	{
		Setting s=new Setting();
		s.setSetting(setting);
		s.setValue(value);
		settingDao.getHibernateTemplate().merge(s);
	
	}
	public void update(String setting,String value)
	{
		Setting s=new Setting();
		s.setSetting(setting);
		s.setValue(value);
		System.out.println("pre"+s.getValue());
		//s= settingDao.getHibernateTemplate().merge(s);
		  Session session = settingDao.getSessionFactory().openSession();
			
		   Transaction tx1 = session.beginTransaction();
	        session.saveOrUpdate(s);
	        tx1.commit();
	        session.close();
		System.out.println("next"+s.getValue());
	}
	
	public WarningSetting getWarningSetting()
	{ 
		WarningSetting ret=new WarningSetting();
    ret.setCZGD("无");ret.setCZGDV("无"); ret.setQJGD("无"); ret.setQJGDV("无");
    ret.setSL("无");ret.setSLV("无");ret.setQX("无");ret.setQXV("无");ret.setCJ("无");ret.setCJV("无");
    List<Setting> settings=settingDao.list("from Setting");
    for (Setting s:settings){
    	if (s.getSetting().equals("CZGD")) ret.setCZGD(s.getValue()); 
    	if (s.getSetting().equals("CZGDV")) ret.setCZGDV(s.getValue());
    	if (s.getSetting().equals("QJGD")) ret.setQJGD(s.getValue());
    	if (s.getSetting().equals("QJGDV")) ret.setQJGDV(s.getValue());
    	if (s.getSetting().equals("SL")) ret.setSL(s.getValue());
    	if (s.getSetting().equals("SLV")) ret.setSLV(s.getValue());
    	if (s.getSetting().equals("QX")) ret.setQX(s.getValue());
    	if (s.getSetting().equals("QXV")) ret.setQXV(s.getValue());
    	if (s.getSetting().equals("CJ")) ret.setCJ(s.getValue());
    	if (s.getSetting().equals("CJV")) ret.setCJV(s.getValue()); 
    }
		return ret;
	}
	
	@Override
	public Setting getParam(String param) {
		// TODO Auto-generated method stub
		List <Setting> s=settingDao.list("from Setting s where s.setting= ?",param);
		if (s!=null && s.size()>0) return s.get(0);
			Setting setting=new Setting();
			setting.setSetting(param);
			setting.setValue("1000000");
			return setting;
		
	}


}
