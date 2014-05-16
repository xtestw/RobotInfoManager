package com.robot.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.robot.model.*;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.robot.dao.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class Txt2MysqlUtil {
	   private String baseDir="d:\\";
	   private String filename="";
	   private InstrumentParamDao instrumentParamDao;
	   private MeasureResultDao measureResultDao;
	   private PointCoordDao pointCoordDao;
	   private PointGroupInfoDao pointGroupInfoDao;
	   private PointInfoDao pointInfoDao;
	   private QingXieDao qingXieDao;
	   private SectionInfoDao sectionInfoDao;
	   private SettingDao settingDao;
	   private ShouLianDao shouLianDao;
	   private StationInfoDao stationInfoDao;
	   
	   public void setFilename(String filename) {
		   this.filename =baseDir+filename;
	   }
	   	
	   public List<String> getLines(){
		   File file=new File(filename);
		   try {
			FileInputStream fileInputStream=new FileInputStream(file);
			InputStreamReader streamReader=new InputStreamReader(fileInputStream,"UTF-8");
			List<String> ret=new ArrayList<String>();
			BufferedReader bf=new BufferedReader(streamReader);
			String line;
			while ((line=bf.readLine())!=null){
				ret.add(line);
			}
			bf.close();
			return ret;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return null;
	   }

	   @Test
	   public void PointGroup(){
		   setFilename("pointGroup.txt");
		   List<String> s=getLines(); 
		   pointGroupInfoDao.setSuperSessionFactory("jinshansi");
		   for (String str:s)
		   {
			   String t[]=str.split(" ");
			   PointGroupInfo p=new PointGroupInfo();
			   p.setPointGroupName(t[0]);
			   System.out.println(t[0]);
			   p=(PointGroupInfo)pointGroupInfoDao.queryByHql("from PointGroupInfo p where p.pointGroupName= ?",t[0]);
			 //  Session session1 = sessionFactory.buildSession();

			   System.out.println(p.getTryCount());
			   p.setContianPoint(t[1]);
			   Session session = pointGroupInfoDao.getSessionFactory().openSession();
				
			   Transaction tx1 = session.beginTransaction();
		        session.update(p);
		        tx1.commit();
		        session.close();
			  // pointGroupInfoDao.update(p);
			//   pointGroupInfoDao.getHibernateTemplate().saveOrUpdate(p);
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	public InstrumentParamDao getInstrumentParamDao() {
		return instrumentParamDao;
	}

	@Resource
	public void setInstrumentParamDao(InstrumentParamDao instrumentParamDao) {
		this.instrumentParamDao = instrumentParamDao;
	}

	public MeasureResultDao getMeasureResultDao() {
		return measureResultDao;
	}

	@Resource
	public void setMeasureResultDao(MeasureResultDao measureResultDao) {
		this.measureResultDao = measureResultDao;
	}

	public PointCoordDao getPointCoordDao() {
		return pointCoordDao;
	}

	@Resource
	public void setPointCoordDao(PointCoordDao pointCoordDao) {
		this.pointCoordDao = pointCoordDao;
	}

	public PointGroupInfoDao getPointGroupInfoDao() {
		return pointGroupInfoDao;
	}

	@Resource
	public void setPointGroupInfoDao(PointGroupInfoDao pointGroupInfoDao) {
		this.pointGroupInfoDao = pointGroupInfoDao;
	}

	public PointInfoDao getPointInfoDao() {
		return pointInfoDao;
	}

	@Resource
	public void setPointInfoDao(PointInfoDao pointInfoDao) {
		this.pointInfoDao = pointInfoDao;
	}

	public QingXieDao getQingXieDao() {
		return qingXieDao;
	}

	@Resource
	public void setQingXieDao(QingXieDao qingXieDao) {
		this.qingXieDao = qingXieDao;
	}

	public SectionInfoDao getSectionInfoDao() {
		return sectionInfoDao;
	}

	@Resource
	public void setSectionInfoDao(SectionInfoDao sectionInfoDao) {
		this.sectionInfoDao = sectionInfoDao;
	}

	public SettingDao getSettingDao() {
		return settingDao;
	}

	@Resource
	public void setSettingDao(SettingDao settingDao) {
		this.settingDao = settingDao;
	}

	public ShouLianDao getShouLianDao() {
		return shouLianDao;
	}

	@Resource
	public void setShouLianDao(ShouLianDao shouLianDao) {
		this.shouLianDao = shouLianDao;
	}

	public StationInfoDao getStationInfoDao() {
		return stationInfoDao;
	}
    
	@Resource
	public void setStationInfoDao(StationInfoDao stationInfoDao) {
		this.stationInfoDao = stationInfoDao;
	}
	   
	   
	   
	   
}
