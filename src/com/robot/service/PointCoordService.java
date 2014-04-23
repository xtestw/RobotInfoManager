package com.robot.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointCoordDao;
import com.robot.model.PointCoord;
import com.robot.model.PointName;
import com.robot.service.inte.IPointCoordService;
@Service("pointCoordService")
@Scope("prototype")
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
	@Override
	public List<PointCoord> list(String pointName,String PGName) {
		return pointCoordDao.list("from PointCoord p where p.totalXdiff is not null"
				+ "and p.totalYDiff is not null and p.totalZDiff is not null and p.pointName = "+pointName+
				"p.PGName="+PGName);
	}
	@Override
	public List<PointCoord> listGD(String pgName,String cp) {
		return pointCoordDao.list("from PointCoord p where p.PGName = "+pgName+" and p.pointName like '"+cp+"%'");
	}
	@Override
	public List<PointCoord> listCJ(String pgName) {
		return pointCoordDao.list("from PointCoord p where p.PGName = "+pgName);
		
	}


}
