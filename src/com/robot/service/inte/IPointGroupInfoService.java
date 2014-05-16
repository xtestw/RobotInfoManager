package com.robot.service.inte;

import java.util.List;

import com.robot.model.PointGroupInfo;
import com.robot.model.PointInfo;
import com.robot.model.PointName;


public interface IPointGroupInfoService {
	public void add(PointGroupInfo pointGroupInfo);
	
	public void delete(PointGroupInfo pointGroupInfo);
	
	public void delete(int id);
	
	public PointGroupInfo load(int id);
	
	public void update(PointGroupInfo pointGroupInfo);
	
	public void setFactory(String name);

	public List<PointGroupInfo> list();
	
	public List<PointInfo> list(String name);

	public List<PointName> listAllPoint(String pgName);
}
