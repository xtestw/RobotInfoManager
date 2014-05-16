package com.robot.service.inte;

import java.util.List;

import com.robot.model.PointInfo;
import com.robot.model.QingXie;
import com.robot.model.Setting;



public interface IQingXieService {
	
	public void setFactory(String name);

	public List<QingXie> list(String pgName);

	public List<PointInfo> getTopWarning(List<QingXie> qingXies, Setting qx,
			Setting qxv);

	public List<PointInfo> getBottomWarning(List<QingXie> qingXies, Setting qx,
			Setting qxv);
	
}
