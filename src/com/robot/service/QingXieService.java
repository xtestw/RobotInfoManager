package com.robot.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointInfoDao;
import com.robot.dao.QingXieDao;
import com.robot.model.PointInfo;
import com.robot.model.QingXie;
import com.robot.model.Setting;
import com.robot.model.ShouLian;
import com.robot.service.inte.IQingXieService;


@Service("qingXieService")
@Scope("prototype")
public class QingXieService implements IQingXieService {

	private QingXieDao qingXieDao;
	private PointInfoDao pointInfoDao;
	
	
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
	
	@Override
	public void setFactory(String name) {
		qingXieDao.setSuperSessionFactory(name);
		pointInfoDao.setSuperSessionFactory(name);
	}
	@Override
	public List<QingXie> list(String pgName) {
		return qingXieDao.list("from QingXie s where s.PGName= ?",pgName);
	}
	@Override
	public List<PointInfo> getTopWarning(List<QingXie> qingXies, Setting qx,
			Setting qxv) {
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(QingXie p:qingXies){
			  if (p.getTheQXDiff()>Float.parseFloat(qxv.getValue()) || p.getTotalQXDiff()>Float.parseFloat(qx.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getTopPointName()));
			  }
		}
		return ret;
	}
	@Override
	public List<PointInfo> getBottomWarning(List<QingXie> qingXies, Setting qx,
			Setting qxv) {
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(QingXie p:qingXies){
			  if (p.getTheQXDiff()>Float.parseFloat(qxv.getValue()) || p.getTotalQXDiff()>Float.parseFloat(qx.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getBotPointName()));
			  }
		}
		return ret;
	}
	



}
