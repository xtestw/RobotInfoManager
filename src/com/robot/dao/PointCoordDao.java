package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IPointCoordDao;
import com.robot.model.PointCoord;

@Repository("pointCoordDao")
public class PointCoordDao extends DBaseDao<PointCoord> implements
		IPointCoordDao {

	public PointCoordDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public PointCoordDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
