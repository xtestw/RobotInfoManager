package com.robot.service.inte;

import java.util.List;

import com.robot.model.PointInfo;
import com.robot.model.Setting;
import com.robot.model.ShouLian;



public interface IShouLianService {
	
	public void setFactory(String name);

	public List<ShouLian> list(String pgName);

	public List<PointInfo> getLeftWarning(List<ShouLian> shouLians, Setting sl,
			Setting slv);

	public List<PointInfo> getRightWarning(List<ShouLian> shouLians,
			Setting sl, Setting slv);
	
}
