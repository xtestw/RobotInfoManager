package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointGroupInfoDao;
import com.robot.model.PointGroupInfo;


@Repository("pointGroupInfoDao")
public class PointGroupInfoDao extends DBaseDao<PointGroupInfo> implements IPointGroupInfoDao  {

	public PointGroupInfoDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public PointGroupInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
