package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointGroupInfoDao;
import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.PointName;
import com.robot.service.inte.IPointGroupInfoService;


@Service("pointGroupInfoService")
@Scope("prototype")
public class PointGroupInfoService implements IPointGroupInfoService {

	private PointGroupInfoDao pointGroupInfoDao;
	
	public PointGroupInfoDao getPointGroupInfoDao() {
		return pointGroupInfoDao;
	}
	@Resource
	public void setPointGroupInfoDao(PointGroupInfoDao pointGroupInfoDao) {
		this.pointGroupInfoDao = pointGroupInfoDao;
	}

	@Override
	public void add(PointGroupInfo pointGroupInfo) {
		pointGroupInfoDao.add(pointGroupInfo);
	}

	@Override
	public void delete(PointGroupInfo pointGroupInfo) {
		pointGroupInfoDao.delete(pointGroupInfo);
	}

	@Override
	public void delete(int id) {
		pointGroupInfoDao.delete(id);
	}

	@Override
	public PointGroupInfo load(int id) {
		return pointGroupInfoDao.load(id);
	}

	@Override
	public void update(PointGroupInfo pointGroupInfo) {
		pointGroupInfoDao.update(pointGroupInfo);
	}
	@Override
	public void setFactory(String name) {
		pointGroupInfoDao.setSuperSessionFactory(name);
	}
	@Override
	public List<PointGroupInfo> list() {
		// TODO Auto-generated method stub
		return pointGroupInfoDao.list("from PointGroupInfo");
	}
	@Override
	public List<PointInfo> list(String name) {
		// TODO Auto-generated method stub
		List<PointInfo> points=null;
		return points;
	}
	@Override
	public List<PointName> listAllPoint(String pgName) {
		// TODO Auto-generated method stub
		PointGroupInfo p=(PointGroupInfo)pointGroupInfoDao.queryByHql("From PointGroup p where p.PGName="+pgName);
		// TODO  
		return null;
	}



}
