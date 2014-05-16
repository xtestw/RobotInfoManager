package com.robot.service;

import java.util.ArrayList;
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
		System.out.println(pgName);
		PointGroupInfo p=pointGroupInfoDao.list("From PointGroupInfo p where p.pointGroupName = '"+pgName+"'").get(0);
		p=(PointGroupInfo)pointGroupInfoDao.queryByHql("From PointGroupInfo p where p.pointGroupName = ?",pgName);
		System.out.println(p.getPointGroupName());
		String str[]=p.getContianPoint().split(";");
		System.out.println(str.length+p.getContianPoint());
		List<PointName> ret=new ArrayList<PointName>();
		for (String s:str){
			PointName pn=new PointName();
			pn.setName(s);
			ret.add(pn);
		}
		return ret;
	}



}
