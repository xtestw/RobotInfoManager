package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointInfoDao;
import com.robot.model.PointInfo;


@Repository("pointInfoDao")
public class PointInfoDao extends DBaseDao<PointInfo> implements IPointInfoDao  {

	public PointInfoDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public PointInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
