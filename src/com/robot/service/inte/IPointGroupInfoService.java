package com.robot.service.inte;

import com.robot.model.PointGroupInfo;


public interface IPointGroupInfoService {
	public void add(PointGroupInfo pointGroupInfo);
	
	public void delete(PointGroupInfo pointGroupInfo);
	
	public void delete(int id);
	
	public PointGroupInfo load(int id);
	
	public void update(PointGroupInfo pointGroupInfo);
	
	public void setFactory(String name);
}
