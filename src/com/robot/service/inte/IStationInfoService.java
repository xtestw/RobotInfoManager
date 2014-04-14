package com.robot.service.inte;

import java.util.List;

import com.robot.model.Pager;
import com.robot.model.Project;
import com.robot.model.StationInfo;

public interface IStationInfoService {
	public void add(StationInfo stationInfo);
	
	public void delete(StationInfo stationInfo);
	
	public void delete(int id);
	
	public Pager<StationInfo> find(Project project);
	
	public StationInfo load(int id);
	
	public void update(StationInfo stationInfo);
	
	public void setFactory(String name);
	
	public List<StationInfo> list();
}
