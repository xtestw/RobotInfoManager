package com.robot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.robot.dao.PointGroupInfoDao;
import com.robot.model.PointGroupInfo;
import com.robot.service.inte.IPointGroupInfoService;


@Service("pointGroupInfoService")
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



}
