package com.robot.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.robot.dao.StationInfoDao;
import com.robot.model.Pager;
import com.robot.model.Project;
import com.robot.model.StationInfo;
import com.robot.service.inte.IStationInfoService;

@Service("stationInfoService")
@Scope("prototype")
public class StationInfoService implements IStationInfoService {

	private StationInfoDao stationInfoDao;
	
	public StationInfoDao getStationInfoDao() {
		return stationInfoDao;
	}

	@Resource
	public void setStationInfoDao(StationInfoDao stationInfoDao) {
		this.stationInfoDao = stationInfoDao;
	}

	@Override
	public void add(StationInfo stationInfo) {
		stationInfoDao.add(stationInfo);
		
	}

	@Override
	public void delete(StationInfo stationInfo) {
		stationInfoDao.delete(stationInfo);
	}

	@Override
	public void delete(int id) {
		stationInfoDao.delete(id);
	}

	@Override
	public Pager<StationInfo> find(Project project) {
		return null;
		//return stationInfoDao.find("from StationInfo stationinfo where stationinfo.p_id=?", project.getId());
	}

	@Override
	public StationInfo load(int id) {
		return stationInfoDao.load(id);
		
	}

	@Override
	public void update(StationInfo stationInfo) {
		stationInfoDao.update(stationInfo);

	}

	@Override
	public void setFactory(String name) {

		stationInfoDao.setSuperSessionFactory(name);
	}

}
