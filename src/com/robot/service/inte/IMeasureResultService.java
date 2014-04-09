package com.robot.service.inte;

import com.robot.model.MeasureResult;

public interface IMeasureResultService {
	public void add(MeasureResult measureResult);
	
	public void delete(MeasureResult measureResult);
	
	public void delete(int id);
	
	public MeasureResult load(int id);
	
	public void update(MeasureResult measureResult);
	
	public void setFactory(String name);
}
