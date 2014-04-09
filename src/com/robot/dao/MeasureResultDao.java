package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IMeasureResultDao;
import com.robot.model.MeasureResult;

@Repository("measureResultDao")
public class MeasureResultDao extends DBaseDao<MeasureResult> implements
		IMeasureResultDao {

	public MeasureResultDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MeasureResultDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


}
