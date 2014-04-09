package com.robot.dao;

import org.springframework.stereotype.Repository;

import com.robot.dao.inte.IStationInfoDao;
import com.robot.model.StationInfo;

@Repository("stationInfoDao")
public class StationInfoDao extends DBaseDao<StationInfo> implements
		IStationInfoDao {

	public StationInfoDao(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public StationInfoDao() {
		super();
		// TODO Auto-generated constructor stub
	}

}
