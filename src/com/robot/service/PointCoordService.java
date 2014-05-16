package com.robot.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.PointCoordDao;
import com.robot.dao.PointInfoDao;
import com.robot.model.PointCoord;
import com.robot.model.PointInfo;
import com.robot.model.Setting;
import com.robot.service.inte.IPointCoordService;
@Service("pointCoordService")
@Scope("prototype")
public class PointCoordService implements IPointCoordService {
	
	private PointCoordDao pointCoordDao;
    private PointInfoDao pointInfoDao;
    
	public PointInfoDao getPointInfoDao() {
		return pointInfoDao;
	}
	@Resource
	public void setPointInfoDao(PointInfoDao pointInfoDao) {
		this.pointInfoDao = pointInfoDao;
	}
	
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
		pointInfoDao.setSuperSessionFactory(name);
	}
	@Override
	public List<PointCoord> list(String pointName,String PGName) {
		return pointCoordDao.list("from PointCoord p where p.totalXdiff is not null"
				+ "and p.totalYDiff is not null and p.totalZDiff is not null and p.pointName = ?",pointName+
				"p.PGName="+PGName);
	}
	@Override
	public List<PointCoord> listGD(String pgName,String cp) {
		System.out.println("listGD");
		return pointCoordDao.list("from PointCoord p where p.PGName = '"+pgName+"' and p.pointName like '"+cp+"%'");

	}
	@Override
	public List<PointCoord> listCJ(String pgName) {
		System.out.println(pgName+"listCJ");
		return pointCoordDao.list("from PointCoord p where p.PGName = ?",pgName);
		
	}
	@Override
	public List<PointInfo> listCJWarningPoint(List<PointCoord> pointCoords,Setting cj,Setting cjv) {
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(PointCoord p:pointCoords){
			  if (p.getTheZDiff()>Float.parseFloat(cjv.getValue()) || p.getTotalZDiff()>Float.parseFloat(cj.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getPointName()));
			  }
		}
		return ret;
	}
	@Override
	public List<PointInfo> listGDWarningPoint(List<PointCoord> pointCoords,
			Setting gd, Setting gdv) {

		System.out.println("listGDend"+pointCoords.size());
		List<PointInfo> ret=new ArrayList<PointInfo>();
		for(PointCoord p:pointCoords){
			  if (p.getTheZDiff()>Float.parseFloat(gdv.getValue()) || p.getTotalZDiff()>Float.parseFloat(gd.getValue()) )
			  {
				  ret.add((PointInfo)pointInfoDao.queryByHql("from PointInfo p where p.pointName = ?",p.getPointName()));
			  }
		}
		return ret;
	}
	@Override
	public List<PointCoord> getPointXYZ(String pgName, String pointName) {
		return  pointCoordDao.list("from PointCoord p where p.totalXdiff is not null"
				+ " and p.totalYDiff is not null and p.totalZDiff is not null and p.pointName = ? and p.PGName=?",new Object[]{pointName,pgName});
//	return  pointCoordDao.list("from PointCoord");
	
		/*+pointName+
				"' and p.PGName= '"+pgName+"'");
	*/}


}
