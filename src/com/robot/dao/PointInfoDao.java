package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointInfoDao;
import com.robot.model.PointInfo;


@Repository("pointInfoDao")
@Scope("prototype")
public class PointInfoDao extends DBaseDao<PointInfo> implements IPointInfoDao  {

	
	public PointInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
