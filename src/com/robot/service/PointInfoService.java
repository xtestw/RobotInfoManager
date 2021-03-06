package com.robot.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointInfoDao;
import com.robot.model.PointInfo;
import com.robot.service.inte.IPointInfoService;

@Service("pointInfoService")
@Scope("prototype")
public class PointInfoService implements IPointInfoService {

	private PointInfoDao pointInfoDao;
	
	public PointInfoDao getPointInfoDao() {
		return pointInfoDao;
	}
	@Resource
	public void setPointInfoDao(PointInfoDao pointInfoDao) {
		this.pointInfoDao = pointInfoDao;
	}

	@Override
	public void add(PointInfo pointInfo) {
		pointInfoDao.add(pointInfo);
	}

	@Override
	public void delete(PointInfo pointInfo) {
		pointInfoDao.delete(pointInfo);
	}

	@Override
	public void delete(int id) {
		pointInfoDao.delete(id);
	}

	@Override
	public void update(PointInfo pointInfo) {
		pointInfoDao.update(pointInfo);
	}

	@Override
	public PointInfo load(int id) {
		return pointInfoDao.load(id);
	}
	@Override
	public void setFactory(String name) {
		pointInfoDao.setSuperSessionFactory(name);		
	}
	@Override
	public List<PointInfo> list() {
		// TODO Auto-generated method stub
		return pointInfoDao.list("from PointInfo");
	}
	@Override
	public List<PointInfo> listnonull() {
		// TODO Auto-generated method stub
		return pointInfoDao.list("from PointInfo p where p.x is not null and p.y is not null");
	}


}
