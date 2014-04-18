package com.robot.service.inte;

import java.util.List;

import com.robot.model.PointCoord;
import com.robot.model.PointName;

public interface IPointCoordService {
	public void add(PointCoord pointCoord);
	
	public void delete(PointCoord pointCoord);
	
	public void delete(int id);
	
	public PointCoord load(int id);
	
	public void update(PointCoord pointCoord);
	
	public void setFactory(String name);
	
	public List<PointCoord> list(String pointName,String PGName);


}	
