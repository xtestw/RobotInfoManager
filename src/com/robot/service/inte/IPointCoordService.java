package com.robot.service.inte;

import com.robot.model.PointCoord;

public interface IPointCoordService {
	public void add(PointCoord pointCoord);
	
	public void delete(PointCoord pointCoord);
	
	public void delete(int id);
	
	public PointCoord load(int id);
	
	public void update(PointCoord pointCoord);
	
	public void setFactory(String name);
}	
