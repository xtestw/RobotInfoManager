package com.robot.service.inte;

import java.util.List;

import com.robot.model.PointCoord;
import com.robot.model.PointInfo;
import com.robot.model.PointName;
import com.robot.model.Setting;

public interface IPointCoordService {
	public void add(PointCoord pointCoord);
	
	public void delete(PointCoord pointCoord);
	
	public void delete(int id);
	
	public PointCoord load(int id);
	
	public void update(PointCoord pointCoord);
	
	public void setFactory(String name);
	
	public List<PointCoord> list(String pointName,String PGName);

	public List<PointCoord> listGD(String pgName,String cp);

	public List<PointCoord> listCJ(String pgName);

	public List<PointInfo> listCJWarningPoint(List<PointCoord> pointCoords,Setting cj,Setting cjv);

	public List<PointInfo> listGDWarningPoint(List<PointCoord> pointCoords,
			Setting gd, Setting gdv);

	public List<PointCoord> getPointXYZ(String pgName, String pointName);


}	
