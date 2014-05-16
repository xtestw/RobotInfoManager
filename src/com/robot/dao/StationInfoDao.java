package com.robot.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IStationInfoDao;
import com.robot.model.StationInfo;

@Repository("stationInfoDao")
@Scope("prototype")
public class StationInfoDao extends DBaseDao<StationInfo> implements
		IStationInfoDao {

	

	public StationInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
