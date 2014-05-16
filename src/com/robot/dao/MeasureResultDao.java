package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IMeasureResultDao;
import com.robot.model.MeasureResult;

@Repository("measureResultDao")
@Scope("prototype")
public class MeasureResultDao extends DBaseDao<MeasureResult> implements
		IMeasureResultDao {

	public MeasureResultDao() {
		super();
		// TODO Auto-generated constructor stub
	}



}
