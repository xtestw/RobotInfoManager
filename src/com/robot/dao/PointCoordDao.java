package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointCoordDao;
import com.robot.model.PointCoord;

@Repository("pointCoordDao")
@Scope("prototype")
public class PointCoordDao extends DBaseDao<PointCoord> implements
		IPointCoordDao {

	

	public PointCoordDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
