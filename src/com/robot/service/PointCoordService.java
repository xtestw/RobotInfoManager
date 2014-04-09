package com.robot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.robot.dao.PointCoordDao;
import com.robot.model.PointCoord;
import com.robot.service.inte.IPointCoordService;
@Service("pointCoordService")
public class PointCoordService implements IPointCoordService {
	
	private PointCoordDao pointCoordDao;
	
	
	public PointCoordDao getPointCoordDao() {
		return pointCoordDao;
	}
    @Resource	
	public void setPointCoordDao(PointCoordDao pointCoordDao) {
		this.pointCoordDao = pointCoordDao;
	}

	@Override
	public void add(PointCoord pointCoord) {
		pointCoordDao.add(pointCoord);
	}

	@Override
	public void delete(PointCoord pointCoord) {
		pointCoordDao.delete(pointCoord);
	}

	@Override
	public void delete(int id) {
		pointCoordDao.delete(id);
	}

	@Override
	public PointCoord load(int id) {
		return pointCoordDao.load(id);
	}

	@Override
	public void update(PointCoord pointCoord) {
		pointCoordDao.update(pointCoord);
	}
	@Override
	public void setFactory(String name) {
		
		pointCoordDao.setSuperSessionFactory(name);
		
	}

}
