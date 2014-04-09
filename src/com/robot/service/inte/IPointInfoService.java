package com.robot.service.inte;

import com.robot.model.PointInfo;



public interface IPointInfoService {
	public void add(PointInfo pointInfo);
	
	public void delete(PointInfo pointInfo);
	
	public void delete(int id);
	
	public void update(PointInfo pointInfo);
	
	public PointInfo load(int id);
	
	public void setFactory(String name);
}
