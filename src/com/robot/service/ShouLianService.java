package com.robot.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointInfoDao;
import com.robot.dao.SectionInfoDao;
import com.robot.dao.ShouLianDao;
import com.robot.model.PointCoord;
import com.robot.model.PointInfo;
import com.robot.model.SectionInfo;
import com.robot.model.Setting;
import com.robot.model.ShouLian;
import com.robot.service.inte.ISectionInfoService;
import com.robot.service.inte.IShouLianService;


@Service("shouLianService")
@Scope("prototype")
public class ShouLianService implements IShouLianService {

	private ShouLianDao shouLianDao;
	private PointInfoDao pointInfoDao;
	
	public PointInfoDao getPointInfoDao() {
		return pointInfoDao;
	}
	@Resource
	public void setPointInfoDao(PointInfoDao pointInfoDao) {
		this.pointInfoDao = pointInfoDao;
	}
	public ShouLianDao getShouLianDao() {
		return shouLianDao;
	}
	@Resource
	public void setShouLianDao(ShouLianDao shouLianDao) {
		this.shouLianDao = shouLianDao;
	}
	@Override
	public void setFactory(String name) {
		shouLianDao.setSuperSessionFactory(name);
		pointInfoDao.setSuperSessionFactory(name);
	}
	@Override
	public List<ShouLian> list(String pgName) {
		return shouLianDao.list("from ShouLian s where s.PGName= ?",pgName);
	}
	@Override
	public List<PointInfo> getLeftWarning(List<ShouLian> shouLians, Setting sl,
			Setting slv) {
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(ShouLian p:shouLians){
			  if (p.getTheSLDiff()>Float.parseFloat(slv.getValue()) || p.getTotalSLDiff()>Float.parseFloat(sl.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getLeftPointName()));
			  }
		}
		return ret;
	}
	@Override
	public List<PointInfo> getRightWarning(List<ShouLian> shouLians,
			Setting sl, Setting slv) {
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(ShouLian p:shouLians){
			  if (p.getTheSLDiff()>Float.parseFloat(slv.getValue()) || p.getTotalSLDiff()>Float.parseFloat(sl.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getRightPointName()));
			  }
		}
		return ret;
	}
	



}
