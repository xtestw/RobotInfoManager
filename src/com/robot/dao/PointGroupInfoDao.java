package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointGroupInfoDao;
import com.robot.model.PointGroupInfo;


@Repository("pointGroupInfoDao")
@Scope("prototype")
public class PointGroupInfoDao extends DBaseDao<PointGroupInfo> implements IPointGroupInfoDao  {

	
	public PointGroupInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
